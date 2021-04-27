<%@ page import="com.liferay.portal.kernel.exception.PortalException" %>
<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ page import="com.infosys.serviceBuilder.model.banks" %>
<%@ page import="com.infosys.serviceBuilder.service.banksLocalServiceUtil" %>
<%@ page import="com.infosys.serviceBuilder.service.persistence.banksPK" %>
<%@ page import="com.infosys.serviceBuilder.model.staff_roster" %>
<%@ page import="com.infosys.serviceBuilder.service.staff_rosterLocalServiceUtil" %>
<%@ page import="java.util.List" %>
<%@ page import="com.liferay.portal.kernel.dao.orm.DynamicQuery" %>
<%@ page import="com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil" %>
<%@ include file="init.jsp" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
    banksPK pk = new banksPK(
            ParamUtil.getString(request, "bank_name"),
            ParamUtil.getString(request, "bik"));
    banks bank = null;
    try {
        bank = banksLocalServiceUtil.getbanks(pk);
    } catch (PortalException e) {
        e.printStackTrace();
    }
    request.setAttribute("bank", bank);
%>

<liferay-portlet:renderURL var="backURL">
    <portlet:param name="backURL" value="/view.jsp"/>
</liferay-portlet:renderURL>

<liferay-portlet:actionURL var="submitChanges" name="submitChanges">
    <portlet:param name="bank_name" value="${bank.bank_name}"/>
    <portlet:param name="oldBIK" value="${bank.bik}"/>
    <portlet:param name="backURL" value="${backURL}"/>
</liferay-portlet:actionURL>

<aui:form action="${submitChanges}">

    <aui:input
            name="bik"
            label="БИК"
            value="${bank.bik}">
    </aui:input>
    <aui:input
            name="address"
            label="Физический адрес"
            value="${bank.address}">
    </aui:input>

    <aui:button
            name="submitChangesButton"
            type="submit"
            value="Сохранить изменения">
    </aui:button>

    <liferay-portlet:actionURL var="deleteBank" name="deleteBank">
        <portlet:param name="del_bank_name" value="${bank.bank_name}"/>
        <portlet:param name="del_BIK" value="${bank.bik}"/>
        <portlet:param name="backURL" value="${backURL}"/>
    </liferay-portlet:actionURL>
    <aui:button
            name="deleteBankButton"
            href="${deleteBank}"
            value="Удалить">
    </aui:button>
</aui:form>

<%
    DynamicQuery query = staff_rosterLocalServiceUtil.dynamicQuery();
    query.add(RestrictionsFactoryUtil.and(
            RestrictionsFactoryUtil.eq("bank", pk.getBank_name()),
            RestrictionsFactoryUtil.eq("archive", false)));
    List<staff_roster> list = staff_rosterLocalServiceUtil.dynamicQuery(query);
%>

<liferay-ui:search-container
        orderByType="asc"
        delta="20"
        emptyResultsMessage="Нет работников получающих зп в данном банке">

    <liferay-ui:search-container-results
            results="<%= list %>"/>

    <liferay-ui:search-container-row
            className="com.infosys.serviceBuilder.model.staff_roster"
            modelVar="people">

        <liferay-ui:search-container-column-text property="worker_id" name="ID"/>
        <liferay-ui:search-container-column-text property="last_name" name="Фамилия"/>
        <liferay-ui:search-container-column-text property="first_name" name="Имя"/>
        <liferay-ui:search-container-column-text property="middle_name" name="Отчество"/>
        <liferay-ui:search-container-column-text property="birth_date" name="Дата рождения"/>
        <liferay-ui:search-container-column-text property="position" name="Должность"/>
        <liferay-ui:search-container-column-text property="work_phone_num" name="Рабочий номер"/>
        <liferay-ui:search-container-column-text property="mobile_phone_num" name="Личный номер"/>
        <liferay-ui:search-container-column-text property="archive" name="Статус архивности"/>

    </liferay-ui:search-container-row>
    <liferay-ui:search-iterator/>
</liferay-ui:search-container>