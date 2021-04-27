<%@ include file="init.jsp" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<liferay-portlet:renderURL var="backURL">
    <portlet:param name="backURL" value="/view.jsp"/>
</liferay-portlet:renderURL>

<liferay-portlet:actionURL var="addJob" name="addJob">
    <portlet:param name="backURL" value="${backURL}"/>
</liferay-portlet:actionURL>

<aui:form action="${addJob}">

    <aui:input
            name="position"
            label="Должность">
    </aui:input>
    <aui:select name="archive"
                label="Статус архивности">
        <aui:option label="Актуальная запись" value="${false}"/>
        <aui:option label="Архивная запись" value="${true}"/>
    </aui:select>

    <aui:button
            name="addBankButton"
            type="submit"
            value="Сохранить изменения">
    </aui:button>
</aui:form>
