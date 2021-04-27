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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link staff_rosterLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see staff_rosterLocalService
 * @generated
 */
public class staff_rosterLocalServiceWrapper
	implements ServiceWrapper<staff_rosterLocalService>,
			   staff_rosterLocalService {

	public staff_rosterLocalServiceWrapper(
		staff_rosterLocalService staff_rosterLocalService) {

		_staff_rosterLocalService = staff_rosterLocalService;
	}

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
	@Override
	public com.infosys.serviceBuilder.model.staff_roster addstaff_roster(
		com.infosys.serviceBuilder.model.staff_roster staff_roster) {

		return _staff_rosterLocalService.addstaff_roster(staff_roster);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _staff_rosterLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new staff_roster with the primary key. Does not add the staff_roster to the database.
	 *
	 * @param worker_id the primary key for the new staff_roster
	 * @return the new staff_roster
	 */
	@Override
	public com.infosys.serviceBuilder.model.staff_roster createstaff_roster(
		int worker_id) {

		return _staff_rosterLocalService.createstaff_roster(worker_id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _staff_rosterLocalService.deletePersistedModel(persistedModel);
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
	@Override
	public com.infosys.serviceBuilder.model.staff_roster deletestaff_roster(
			int worker_id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _staff_rosterLocalService.deletestaff_roster(worker_id);
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
	@Override
	public com.infosys.serviceBuilder.model.staff_roster deletestaff_roster(
		com.infosys.serviceBuilder.model.staff_roster staff_roster) {

		return _staff_rosterLocalService.deletestaff_roster(staff_roster);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _staff_rosterLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _staff_rosterLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _staff_rosterLocalService.dynamicQuery(dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _staff_rosterLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _staff_rosterLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _staff_rosterLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.infosys.serviceBuilder.model.staff_roster fetchstaff_roster(
		int worker_id) {

		return _staff_rosterLocalService.fetchstaff_roster(worker_id);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _staff_rosterLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _staff_rosterLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _staff_rosterLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _staff_rosterLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the staff_roster with the primary key.
	 *
	 * @param worker_id the primary key of the staff_roster
	 * @return the staff_roster
	 * @throws PortalException if a staff_roster with the primary key could not be found
	 */
	@Override
	public com.infosys.serviceBuilder.model.staff_roster getstaff_roster(
			int worker_id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _staff_rosterLocalService.getstaff_roster(worker_id);
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
	@Override
	public java.util.List<com.infosys.serviceBuilder.model.staff_roster>
		getstaff_rosters(int start, int end) {

		return _staff_rosterLocalService.getstaff_rosters(start, end);
	}

	/**
	 * Returns the number of staff_rosters.
	 *
	 * @return the number of staff_rosters
	 */
	@Override
	public int getstaff_rostersCount() {
		return _staff_rosterLocalService.getstaff_rostersCount();
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
	@Override
	public com.infosys.serviceBuilder.model.staff_roster updatestaff_roster(
		com.infosys.serviceBuilder.model.staff_roster staff_roster) {

		return _staff_rosterLocalService.updatestaff_roster(staff_roster);
	}

	@Override
	public staff_rosterLocalService getWrappedService() {
		return _staff_rosterLocalService;
	}

	@Override
	public void setWrappedService(
		staff_rosterLocalService staff_rosterLocalService) {

		_staff_rosterLocalService = staff_rosterLocalService;
	}

	private staff_rosterLocalService _staff_rosterLocalService;

}