<%@ page import="com.infosys.serviceBuilder.model.job_register" %>
<%@ page import="com.infosys.serviceBuilder.service.job_registerLocalServiceUtil" %>
<%@ page import="java.util.List" %>
<%@ include file="init.jsp" %>

<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<liferay-portlet:renderURL var="backURL">
	<portlet:param name="backURL" value="/view.jsp"/>
</liferay-portlet:renderURL>

<%
	List<job_register> list = job_registerLocalServiceUtil
			.getjob_registers(0, job_registerLocalServiceUtil.getjob_registersCount());
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
			className="com.infosys.serviceBuilder.model.job_register"
			modelVar="jobsReg">

		<portlet:renderURL var="rowURL">
			<portlet:param name="position" value="${jobsReg.position}"/>
			<portlet:param name="mvcPath" value="/redact.jsp"/>
		</portlet:renderURL>

		<liferay-portlet:actionURL var="changeArchStat" name="changeArchStat">
			<portlet:param name="position" value="${jobsReg.position}"/>
			<portlet:param name="backURL" value="${backURL}"/>
		</liferay-portlet:actionURL>

		<liferay-ui:search-container-column-text property="position"
												 name="Должность"/>
		<liferay-ui:search-container-column-text name="Статус архивности"
												 value='<%= jobsReg.isArchive() ? "В архиве" : "Актуальная запись" %>'/>
		<liferay-ui:search-container-column-text href="${changeArchStat}"
												 name="Архивация"
												 value="Архивировать/Разархивировать"/>
		<liferay-ui:search-container-column-text href="${rowURL}"
												 name="Редактирование"
												 value="Редактировать/Удалить"/>

	</liferay-ui:search-container-row>
	<liferay-ui:search-iterator/>
</liferay-ui:search-container>

<portlet:renderURL var="addJobURL">
	<portlet:param name="mvcPath" value="/add.jsp"/>
</portlet:renderURL>
<aui:button
		name="addJobButton"
		href="${addJobURL}"
		value="Добавить должность">
</aui:button>