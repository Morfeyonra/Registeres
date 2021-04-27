<%@ page import="com.infosys.serviceBuilder.model.banks" %>
<%@ page import="com.infosys.serviceBuilder.service.banksLocalServiceUtil" %>
<%@ page import="java.util.List" %>
<%@ include file="init.jsp" %>

<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
	List<banks> list = banksLocalServiceUtil
			.getbankses(0, banksLocalServiceUtil.getbanksesCount());
%>

<liferay-ui:search-container
		orderByType="asc"
		delta="<%= Math.min(20, list.size()) %>"
		deltaConfigurable="true"
		emptyResultsMessage="Uuupsy! No data available... T.T"
		total="<%= list.size() %>">

	<liferay-ui:search-container-results
			results="<%= list.subList(searchContainer.getStart(), Math.min(list.size(), searchContainer.getEnd())) %>"/>

	<liferay-ui:search-container-row
			className="com.infosys.serviceBuilder.model.banks"
			modelVar="banksReg">

		<portlet:renderURL var="rowURL">
			<portlet:param name="bank_name" value="${banksReg.bank_name}"/>
			<portlet:param name="bik" value="${banksReg.bik}"/>
			<portlet:param name="mvcPath" value="/redact.jsp"/>
		</portlet:renderURL>

		<liferay-ui:search-container-column-text property="bank_name" name="Наименование банка"/>
		<liferay-ui:search-container-column-text property="bik" name="БИК"/>
		<liferay-ui:search-container-column-text property="address" name="Физический адрес"/>
		<liferay-ui:search-container-column-text href="${rowURL}" name="Действия" value="Редактировать/Удалить"/>

	</liferay-ui:search-container-row>
	<liferay-ui:search-iterator/>
</liferay-ui:search-container>

<portlet:renderURL var="addBankURL">
	<portlet:param name="mvcPath" value="/add.jsp"/>
</portlet:renderURL>
<aui:button
		name="addBank"
		href="${addBankURL}"
		value="Добавить организацию">
</aui:button>