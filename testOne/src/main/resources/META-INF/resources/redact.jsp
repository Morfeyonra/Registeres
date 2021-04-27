<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="init.jsp" %>
<%@ page import="com.infosys.serviceBuilder.model.staff_roster" %>
<%@ page import="com.infosys.serviceBuilder.service.staff_rosterLocalServiceUtil" %>
<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ page import="com.liferay.portal.kernel.exception.PortalException" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.List" %>
<%@ page import="com.infosys.serviceBuilder.service.banksLocalServiceUtil" %>
<%@ page import="com.infosys.serviceBuilder.model.banks" %>
<%@ page import="com.infosys.serviceBuilder.model.job_register" %>
<%@ page import="com.infosys.serviceBuilder.service.job_registerLocalServiceUtil" %>

<%
    SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
    int workerID = ParamUtil.getInteger(request, "worker_id");
    staff_roster stuff;
    try {
        stuff = staff_rosterLocalServiceUtil.getstaff_roster(workerID);
    } catch (PortalException e) {
        e.printStackTrace();
        return;
    }
    request.setAttribute("stuff", stuff);
%>

<liferay-portlet:renderURL var="backURL">
    <portlet:param name="backURL" value="/view.jsp"/>
</liferay-portlet:renderURL>

<liferay-portlet:actionURL var="submitChanges" name="saveToStuff">
    <portlet:param name="workerID" value="${stuff.worker_id}"/>
    <portlet:param name="backURL" value="${backURL}"/>
</liferay-portlet:actionURL>

<aui:form action="${submitChanges}">

    <aui:input
            name="last_name"
            label="Фамилия"
            value="${stuff.last_name}">
    </aui:input>
    <aui:input
            name="name"
            label="Имя"
            value="${stuff.first_name}">
    </aui:input>
    <aui:input
            name="middle_name"
            label="Отчество"
            value="${stuff.middle_name}">
    </aui:input>
    <aui:input
            name="birth_date"
            label="Дата рождения"
            value="<%=sdf.format(stuff.getBirth_date())%>">
    </aui:input>

    <%
        List<job_register> job_registerList = job_registerLocalServiceUtil
                .getjob_registers(0, job_registerLocalServiceUtil.getjob_registersCount());
    %>
    <aui:select name="position"
                label="Должность"
                value="${stuff.position}">
    <%
        if (!stuff.isArchive()) {
            for (job_register jr : job_registerList) {
                if (jr.getArchive()) {
                    continue;
                }
    %>
    <aui:option label="<%= jr.getPosition() %>" value="<%= jr.getPosition() %>"/>
    <%
            }
        } else {
            for (job_register jr : job_registerList) {
    %>
    <aui:option label="<%= jr.getPosition() %>" value="<%= jr.getPosition() %>"/>
    <%
                }
        }
    %>
    </aui:select>

    <aui:input
            name="employment_date"
            label="Дата трудоустройства"
            value="<%=sdf.format(stuff.getEmployment_date())%>">
    </aui:input>
    <aui:input
            name="salary"
            label="Заработная плата"
            value="${stuff.salary}">
    </aui:input>
    <aui:input
            name="work_phone_num"
            label="Рабочий номер"
            value="${stuff.work_phone_num}">
    </aui:input>
    <aui:input
            name="mobile_phone_num"
            label="Личный номер"
            value="${stuff.mobile_phone_num}">
    </aui:input>

    <%
        List<banks> banksList = banksLocalServiceUtil
                .getbankses(0, banksLocalServiceUtil.getbanksesCount());

    %>
    <aui:select name="bank"
                label="Обслуживающий банк"
                value="${stuff.bank}">
    <% for (banks b : banksList) { %>
    <aui:option label="<%= b.getBank_name() %>" value="<%= b.getBank_name() %>"/>
    <% } %>
    </aui:select>

    <aui:button
            name="submit"
            type="submit"
            value="Сохранить">
    </aui:button>

    <liferay-portlet:actionURL var="deleteStuff" name="deleteStuff">
        <portlet:param name="delWorkerID" value="${stuff.worker_id}"/>
        <portlet:param name="backURL" value="${backURL}"/>
    </liferay-portlet:actionURL>
    <aui:button
            name="deleteStuff"
            href="${deleteStuff}"
            value="Удалить">
    </aui:button>
</aui:form>