package com.infosys.portlets.portlet;

import com.infosys.portlets.constants.testOnePortletKeys;

import com.infosys.serviceBuilder.model.staff_roster;
import com.infosys.serviceBuilder.service.staff_rosterLocalServiceUtil;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.*;

import com.liferay.portal.kernel.util.ParamUtil;
import org.osgi.service.component.annotations.Component;

import java.io.IOException;
import java.text.SimpleDateFormat;

/**
 * @author user
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=testOne",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + testOnePortletKeys.TESTONE,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class testOnePortlet extends MVCPortlet {

	public static void setValues(ActionRequest actionRequest, staff_roster str) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");

		str.setLast_name(ParamUtil.getString(actionRequest, "last_name"));
		str.setFirst_name(ParamUtil.getString(actionRequest, "name"));
		str.setMiddle_name(ParamUtil.getString(actionRequest, "middle_name"));
		str.setBirth_date(ParamUtil.getDate(actionRequest, "birth_date", sdf));
		str.setPosition(ParamUtil.getString(actionRequest, "position"));
		str.setEmployment_date(ParamUtil.getDate(actionRequest, "employment_date", sdf));
		str.setSalary(ParamUtil.getInteger(actionRequest, "salary"));
		str.setWork_phone_num(ParamUtil.getString(actionRequest, "work_phone_num"));
		str.setMobile_phone_num(ParamUtil.getString(actionRequest, "mobile_phone_num"));
		str.setBank(ParamUtil.getString(actionRequest, "bank"));
	}

	public void deleteStuff(ActionRequest actionRequest, ActionResponse actionResponse) {

		int delWorkerID = ParamUtil.getInteger(actionRequest, "delWorkerID");
		String backURL = ParamUtil.getString(actionRequest, "backURL");

		try {
			staff_rosterLocalServiceUtil.deletestaff_roster(delWorkerID);
			actionResponse.sendRedirect(backURL);
		} catch (PortalException | IOException e) {
			e.printStackTrace();
		}
	}

	public void saveToStuff(ActionRequest actionRequest, ActionResponse actionResponse) {

		int refactoredWorkerID = Integer.parseInt(ParamUtil.getString(actionRequest, "workerID"));
		String backURL = ParamUtil.getString(actionRequest, "backURL");

		try {
			staff_roster str = staff_rosterLocalServiceUtil.getstaff_roster(refactoredWorkerID);

			testOnePortlet.setValues(actionRequest, str);

			str.persist();

			actionResponse.sendRedirect(backURL);

		} catch (PortalException | IOException e) {
			e.printStackTrace();
		}
	}

	public void addStuff(ActionRequest actionRequest, ActionResponse actionResponse) {

		String backURL = ParamUtil.getString(actionRequest, "backURL");

		staff_roster newSR = staff_rosterLocalServiceUtil.createstaff_roster((int) CounterLocalServiceUtil
				.increment(staff_roster.class.getName()));

		testOnePortlet.setValues(actionRequest, newSR);

		newSR.setArchive(false);

		newSR.persist();

		try {
			actionResponse.sendRedirect(backURL);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void changeArchStat(ActionRequest actionRequest, ActionResponse actionResponse) {

		String backURL = ParamUtil.getString(actionRequest, "backURL");

		try {
			staff_roster str = staff_rosterLocalServiceUtil.getstaff_roster(
					ParamUtil.getInteger(actionRequest, "worker_id"));

			str.setArchive(!str.getArchive());
			str.persist();

			actionResponse.sendRedirect(backURL);
		} catch (PortalException | IOException e) {
			e.printStackTrace();
		}
	}
}