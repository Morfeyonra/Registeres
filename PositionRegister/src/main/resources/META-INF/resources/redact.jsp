<%@ page import="com.liferay.portal.kernel.exception.PortalException" %>
<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ page import="com.infosys.serviceBuilder.model.staff_roster" %>
<%@ page import="com.infosys.serviceBuilder.service.staff_rosterLocalServiceUtil" %>
<%@ page import="java.util.List" %>
<%@ page import="com.liferay.portal.kernel.dao.orm.DynamicQuery" %>
<%@ page import="com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil" %>
<%@ page import="com.infosys.serviceBuilder.model.job_register" %>
<%@ page import="com.infosys.serviceBuilder.service.job_registerLocalServiceUtil" %>
<%@ include file="init.jsp" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
    job_register job;
    try {
        job = job_registerLocalServiceUtil.getjob_register(ParamUtil.getString(request, "position"));
    } catch (PortalException e) {
        e.printStackTrace();
        return;
    }
    request.setAttribute("job", job);
%>

<liferay-portlet:renderURL var="backURL">
    <portlet:param name="backURL" value="/view.jsp"/>
</liferay-portlet:renderURL>

<liferay-portlet:actionURL var="submitChanges" name="submitChanges">
    <portlet:param name="oldPosition" value="${job.position}"/>
    <portlet:param name="backURL" value="${backURL}"/>
</liferay-portlet:actionURL>

<aui:form action="${submitChanges}">

    <aui:input
            name="position"
            label="Должность"
            value="${job.position}">
    </aui:input>
    <aui:select name="archive"
                label="Статус архивности"
                value="${job.archive}">
        <aui:option label="Актуальная запись" value="${false}"/>
        <aui:option label="Архивная запись" value="${true}"/>
    </aui:select>

    <aui:button
            name="submitChangesButton"
            type="submit"
            value="Сохранить изменения">
    </aui:button>

    <liferay-portlet:actionURL var="deleteJob" name="deleteJob">
        <portlet:param name="delPosition" value="${job.position}"/>
        <portlet:param name="backURL" value="${backURL}"/>
    </liferay-portlet:actionURL>
    <aui:button
            name="deleteJobButton"
            href="${deleteJob}"
            value="Удалить">
    </aui:button>
</aui:form>

<%
    DynamicQuery query = staff_rosterLocalServiceUtil.dynamicQuery();
    query.add(RestrictionsFactoryUtil.eq("position", job.getPrimaryKey()));
    List<staff_roster> list = staff_rosterLocalServiceUtil.dynamicQuery(query);
%>

<% if (list.size() != 0) { %>
    ВНИМАНИЕ!!! Есть работники на данной должности, изменение данных не отобразится в реестре работников!
<% } %>