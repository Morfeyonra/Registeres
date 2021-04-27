<%@ page import="com.infosys.serviceBuilder.model.job_register" %>
<%@ page import="com.infosys.serviceBuilder.service.job_registerLocalServiceUtil" %>
<%@ page import="java.util.List" %>
<%@ page import="com.infosys.serviceBuilder.model.banks" %>
<%@ page import="com.infosys.serviceBuilder.service.banksLocalServiceUtil" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="init.jsp" %>

<liferay-portlet:renderURL var="backURL">
    <portlet:param name="backURL" value="/view.jsp"/>
</liferay-portlet:renderURL>

<liferay-portlet:actionURL var="addStuff" name="addStuff">
    <portlet:param name="backURL" value="${backURL}"/>
</liferay-portlet:actionURL>

<aui:form action="${addStuff}">

    <aui:input
            name="last_name"
            label="Фамилия">
    </aui:input>
    <aui:input
            name="name"
            label="Имя">
    </aui:input>
    <aui:input
            name="middle_name"
            label="Отчество">
    </aui:input>
    <aui:input
            name="birth_date"
            label="Дата рождения"
            value="dd.mm.yyyy">
    </aui:input>

    <%
        List<job_register> job_registerList = job_registerLocalServiceUtil
                .getjob_registers(0, job_registerLocalServiceUtil.getjob_registersCount());
    %>
    <aui:select name="position"
                label="Должность">
    <%
        for (job_register jr : job_registerList) {
            if (jr.getArchive()) {
                continue;
            }
    %>
    <aui:option label="<%= jr.getPosition() %>" value="<%= jr.getPosition() %>"/>
    <%
        }
    %>
    </aui:select>
    <aui:input
            name="employment_date"
            label="Дата трудоустройства"
            value="dd.mm.yyyy">
    </aui:input>
    <aui:input
            name="salary"
            label="Заработная плата">
    </aui:input>
    <aui:input
            name="work_phone_num"
            label="Рабочий номер">
    </aui:input>
    <aui:input
            name="mobile_phone_num"
            label="Личный номер">
    </aui:input>

    <%
        List<banks> banksList = banksLocalServiceUtil
                .getbankses(0, banksLocalServiceUtil.getbanksesCount());
    %>
    <aui:select name="bank"
                label="Обслуживающий банк">
        <% for (banks b : banksList) { %>
        <aui:option label="<%= b.getBank_name() %>" value="<%= b.getBank_name() %>"/>
        <% } %>
    </aui:select>

    <aui:button
            name="addStuffButton"
            type="submit"
            value="Сохранить изменения">
    </aui:button>
</aui:form>