<%@ include file="init.jsp" %>

<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.*" %>
<%@ page import="com.infosys.portlets.portlet.Filter" %>

<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<liferay-portlet:renderURL var="backURL">
	<portlet:param name="backURL" value="/view.jsp"/>
</liferay-portlet:renderURL>

<liferay-portlet:renderURL var="addNameFilter">
	<portlet:param name="backURL" value="${backURL}"/>
</liferay-portlet:renderURL>

<% Calendar nowCalendar = new GregorianCalendar(); %>

<aui:form action="${addNameFilter}">

	<aui:input
			name="filter"
			label="Фильтр по ФИО">
	</aui:input>

	<aui:input type="text" name="fromDate"
			   prefix="с :" label="Фильтр по дате рождения"/>
	<script>
		AUI().use('aui-datepicker',
				function(A) {
					new A.DatePicker(
							{
								trigger: '#<portlet:namespace />fromDate',
								mask: '%d.%m.%Y',
								calendar: {
									maximumDate: new Date('<%=nowCalendar.get(Calendar.YEAR)%>',
											'<%=nowCalendar.get(Calendar.MONTH)%>',
											'<%=nowCalendar.get(Calendar.DAY_OF_MONTH)%>'),
									minimumDate: new Date(1900, 0, 1)
								},
								popover: {
									zIndex: 2
								}
							}
					);
				});
	</script>

	<aui:input type="text" name="toDate"
			   prefix="по :" label=""/>
	<script>
		AUI().use('aui-datepicker',
				function(A) {
					new A.DatePicker(
							{
								trigger: '#<portlet:namespace />toDate',
								mask: '%d.%m.%Y',
								calendar: {
									maximumDate: new Date('<%=nowCalendar.get(Calendar.YEAR)%>',
											'<%=nowCalendar.get(Calendar.MONTH)%>',
											'<%=nowCalendar.get(Calendar.DAY_OF_MONTH)%>'),
									minimumDate: new Date(1900, 0, 1)
								},
								popover: {
									zIndex: 2
								}
							}
					);
				});
	</script>

	<aui:button
			name="addStuffButton"
			type="submit"
			value="Применить">
	</aui:button>
</aui:form>

<%
	SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");

	Filter filter = new Filter();
%>

<liferay-portlet:renderURL varImpl="iteratorURL">
	<portlet:param name="mvcPath" value="/view.jsp"/>
</liferay-portlet:renderURL>

<liferay-ui:search-container
		delta="<%= 20 %>"
		deltaConfigurable="true"
		emptyResultsMessage="Uuupsy! No data available... T.T"
		total="<%= filter.getTotal(request) %>">

	<liferay-ui:search-container-results
		results='<%= filter.getResults(request, searchContainer.getStart(), searchContainer.getEnd()) %>'/>

	<liferay-ui:search-container-row
			className="com.infosys.serviceBuilder.model.staff_roster"
			modelVar="nonst"
			keyProperty="worker_id">

		<portlet:renderURL var="rowURL">
			<portlet:param name="worker_id" value="${nonst.worker_id}"/>
			<portlet:param name="mvcPath" value="/redact.jsp"/>
		</portlet:renderURL>

		<liferay-portlet:actionURL var="changeArchStat" name="changeArchStat">
			<portlet:param name="worker_id" value="${nonst.worker_id}"/>
			<portlet:param name="backURL" value="${backURL}"/>
		</liferay-portlet:actionURL>

		<liferay-ui:search-container-column-text property="worker_id"
												 name="ID"/>
		<liferay-ui:search-container-column-text property="last_name"
												 name="Фамилия"/>
		<liferay-ui:search-container-column-text property="first_name"
												 name="Имя"/>
		<liferay-ui:search-container-column-text property="middle_name"
												 name="Отчество"/>
		<liferay-ui:search-container-column-text name="Дата рождения"
												 value="<%= sdf.format(nonst.getBirth_date()) %>"/>
		<liferay-ui:search-container-column-text property="position"
												 name="Должность"/>
		<liferay-ui:search-container-column-text name="Дата трудоустройства"
												 value="<%= sdf.format(nonst.getEmployment_date()) %>"/>
		<liferay-ui:search-container-column-text property="salary"
												 name="Заработная плата"/>
		<liferay-ui:search-container-column-text property="work_phone_num"
												 name="Рабочий номер"/>
		<liferay-ui:search-container-column-text property="mobile_phone_num"
												 name="Личный номер"/>
		<liferay-ui:search-container-column-text property="bank"
												 name="Обслуживающий банк"/>
		<liferay-ui:search-container-column-text name="Статус архивности"
												 value='<%= nonst.isArchive() ? "В архиве" : "Актуальная запись" %>'/>
		<liferay-ui:search-container-column-text href="${changeArchStat}"
												 name="Архивация"
												 value="Архивировать/Разархивировать"/>
		<liferay-ui:search-container-column-text href="${rowURL}"
												 name="Редактирование"
												 value="Редактировать/Удалить"/>

	</liferay-ui:search-container-row>
	<liferay-ui:search-iterator/>
</liferay-ui:search-container>

<portlet:renderURL var="addStuffURL">
	<portlet:param name="mvcPath" value="/add.jsp"/>
</portlet:renderURL>
<aui:button
		name="addStuff"
		href="${addStuffURL}"
		value="Добавить сотрудника">
</aui:button>