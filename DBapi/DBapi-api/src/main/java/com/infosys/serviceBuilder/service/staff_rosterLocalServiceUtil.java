/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.infosys.serviceBuilder.service;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for staff_roster. This utility wraps
 * <code>com.infosys.serviceBuilder.service.impl.staff_rosterLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see staff_rosterLocalService
 * @generated
 */
public class staff_rosterLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.infosys.serviceBuilder.service.impl.staff_rosterLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the staff_roster to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect staff_rosterLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param staff_roster the staff_roster
	 * @return the staff_roster that was added
	 */
	public static com.infosys.serviceBuilder.model.staff_roster addstaff_roster(
		com.infosys.serviceBuilder.model.staff_roster staff_roster) {

		return getService().addstaff_roster(staff_roster);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			createPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new staff_roster with the primary key. Does not add the staff_roster to the database.
	 *
	 * @param worker_id the primary key for the new staff_roster
	 * @return the new staff_roster
	 */
	public static com.infosys.serviceBuilder.model.staff_roster
		createstaff_roster(int worker_id) {

		return getService().createstaff_roster(worker_id);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			deletePersistedModel(
				com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the staff_roster with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect staff_rosterLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param worker_id the primary key of the staff_roster
	 * @return the staff_roster that was removed
	 * @throws PortalException if a staff_roster with the primary key could not be found
	 */
	public static com.infosys.serviceBuilder.model.staff_roster
			deletestaff_roster(int worker_id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deletestaff_roster(worker_id);
	}

	/**
	 * Deletes the staff_roster from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect staff_rosterLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param staff_roster the staff_roster
	 * @return the staff_roster that was removed
	 */
	public static com.infosys.serviceBuilder.model.staff_roster
		deletestaff_roster(
			com.infosys.serviceBuilder.model.staff_roster staff_roster) {

		return getService().deletestaff_roster(staff_roster);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery
		dynamicQuery() {

		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.infosys.serviceBuilder.model.impl.staff_rosterModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.infosys.serviceBuilder.model.impl.staff_rosterModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.infosys.serviceBuilder.model.staff_roster
		fetchstaff_roster(int worker_id) {

		return getService().fetchstaff_roster(worker_id);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			getPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the staff_roster with the primary key.
	 *
	 * @param worker_id the primary key of the staff_roster
	 * @return the staff_roster
	 * @throws PortalException if a staff_roster with the primary key could not be found
	 */
	public static com.infosys.serviceBuilder.model.staff_roster getstaff_roster(
			int worker_id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getstaff_roster(worker_id);
	}

	/**
	 * Returns a range of all the staff_rosters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.infosys.serviceBuilder.model.impl.staff_rosterModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of staff_rosters
	 * @param end the upper bound of the range of staff_rosters (not inclusive)
	 * @return the range of staff_rosters
	 */
	public static java.util.List<com.infosys.serviceBuilder.model.staff_roster>
		getstaff_rosters(int start, int end) {

		return getService().getstaff_rosters(start, end);
	}

	/**
	 * Returns the number of staff_rosters.
	 *
	 * @return the number of staff_rosters
	 */
	public static int getstaff_rostersCount() {
		return getService().getstaff_rostersCount();
	}

	/**
	 * Updates the staff_roster in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect staff_rosterLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param staff_roster the staff_roster
	 * @return the staff_roster that was updated
	 */
	public static com.infosys.serviceBuilder.model.staff_roster
		updatestaff_roster(
			com.infosys.serviceBuilder.model.staff_roster staff_roster) {

		return getService().updatestaff_roster(staff_roster);
	}

	public static staff_rosterLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<staff_rosterLocalService, staff_rosterLocalService> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(staff_rosterLocalService.class);

		ServiceTracker<staff_rosterLocalService, staff_rosterLocalService>
			serviceTracker =
				new ServiceTracker
					<staff_rosterLocalService, staff_rosterLocalService>(
						bundle.getBundleContext(),
						staff_rosterLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}