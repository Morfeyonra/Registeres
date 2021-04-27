<%@ include file="init.jsp" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<liferay-portlet:renderURL var="backURL">
    <portlet:param name="backURL" value="/view.jsp"/>
</liferay-portlet:renderURL>

<liferay-portlet:actionURL var="addBank" name="addBank">
    <portlet:param name="backURL" value="${backURL}"/>
</liferay-portlet:actionURL>

<aui:form action="${addBank}">

    <aui:input
            name="bank_name"
            label="Наименование банка">
    </aui:input>
    <aui:input
            name="bik"
            label="БИК">
    </aui:input>
    <aui:input
            name="address"
            label="Физический адрес">
    </aui:input>

    <aui:button
            name="addBankButton"
            type="submit"
            value="Сохранить изменения">
    </aui:button>
</aui:form>
