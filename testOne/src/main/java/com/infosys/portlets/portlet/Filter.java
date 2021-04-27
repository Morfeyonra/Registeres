package com.infosys.portlets.portlet;

import com.infosys.serviceBuilder.model.staff_roster;
import com.infosys.serviceBuilder.service.staff_rosterLocalServiceUtil;
import com.liferay.portal.kernel.dao.orm.Disjunction;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Filter {

    private static DynamicQuery getQuery(HttpServletRequest request) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");

        Date defFromDate = new Date(0L);
        Date defToDate = new Date();

        Date fromDate = ParamUtil.getDate(request, "fromDate", sdf, defFromDate);
        Date toDate = ParamUtil.getDate(request, "toDate", sdf, defToDate);

        String fio = ParamUtil.getString(request, "filter", "");

        DynamicQuery query = staff_rosterLocalServiceUtil.dynamicQuery();
        Disjunction disjunction = RestrictionsFactoryUtil.disjunction();

        String[] fioArray = fio.trim().split(" ");

        for (String foioo : fioArray) {
            disjunction.add(RestrictionsFactoryUtil.ilike("last_name", "%" + foioo + "%"));
            disjunction.add(RestrictionsFactoryUtil.ilike("first_name", "%" + foioo + "%"));
            disjunction.add(RestrictionsFactoryUtil.ilike("middle_name", "%" + foioo + "%"));
        }

        query.add(disjunction);
        query.add(RestrictionsFactoryUtil.ge("birth_date", fromDate));
        query.add(RestrictionsFactoryUtil.le("birth_date", toDate));

        return query;
    }

    public int getTotal(HttpServletRequest request) {
        return (int) staff_rosterLocalServiceUtil.dynamicQueryCount(Filter.getQuery(request));
    }

    public List<staff_roster> getResults(HttpServletRequest request, int searchContainerStart, int searchContainerEnd) {
        return staff_rosterLocalServiceUtil
                .dynamicQuery(Filter.getQuery(request), searchContainerStart, searchContainerEnd);
    }

    @Deprecated
    public static List<staff_roster> filter(String fio, Date fromDate, Date toDate) {

        String def = "defValue";
        Date defFromDate = new Date(0L);
        Date defToDate = new Date();

        List<staff_roster> list = staff_rosterLocalServiceUtil
                .getstaff_rosters(0, staff_rosterLocalServiceUtil.getstaff_rostersCount());

        List<staff_roster> filteredList = new ArrayList<>();

        if (fio.equals(def)
                && defFromDate.equals(fromDate)
                && defToDate.equals(toDate)) {

            return list;
        }

        if (!fio.equals(def)) {

            String[] fioArray = fio.trim().split(" ");

            for (staff_roster sr : list) {

                int count = 0;

                for (String name : fioArray) {

                    String regExp = "(?i).*?" + name + ".*?";

                    if (sr.getFirst_name().matches(regExp)
                            || sr.getMiddle_name().matches(regExp)
                            || sr.getLast_name().matches(regExp)) {

                        ++count;
                        break;
                    }
                }

                if (count > 0 && sr.getBirth_date().after(fromDate) && sr.getBirth_date().before(toDate)) {
                    filteredList.add(sr);
                }
            }
        } else {

            for (staff_roster sr : list) {

                if (sr.getBirth_date().after(fromDate) && sr.getBirth_date().before(toDate)) {
                    filteredList.add(sr);
                }
            }
        }

        return filteredList;
    }
}