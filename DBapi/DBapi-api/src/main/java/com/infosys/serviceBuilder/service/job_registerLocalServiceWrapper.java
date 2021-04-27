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
 * Provides a wrapper for {@link job_registerLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see job_registerLocalService
 * @generated
 */
public class job_registerLocalServiceWrapper
	implements job_registerLocalService,
			   ServiceWrapper<job_registerLocalService> {

	public job_registerLocalServiceWrapper(
		job_registerLocalService job_registerLocalService) {

		_job_registerLocalService = job_registerLocalService;
	}

	/**
	 * Adds the job_register to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect job_registerLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param job_register the job_register
	 * @return the job_register that was added
	 */
	@Override
	public com.infosys.serviceBuilder.model.job_register addjob_register(
		com.infosys.serviceBuilder.model.job_register job_register) {

		return _job_registerLocalService.addjob_register(job_register);
	}

	/**
	 * Creates a new job_register with the primary key. Does not add the job_register to the database.
	 *
	 * @param position the primary key for the new job_register
	 * @return the new job_register
	 */
	@Override
	public com.infosys.serviceBuilder.model.job_register createjob_register(
		String position) {

		return _job_registerLocalService.createjob_register(position);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _job_registerLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the job_register from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect job_registerLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param job_register the job_register
	 * @return the job_register that was removed
	 */
	@Override
	public com.infosys.serviceBuilder.model.job_register deletejob_register(
		com.infosys.serviceBuilder.model.job_register job_register) {

		return _job_registerLocalService.deletejob_register(job_register);
	}

	/**
	 * Deletes the job_register with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect job_registerLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param position the primary key of the job_register
	 * @return the job_register that was removed
	 * @throws PortalException if a job_register with the primary key could not be found
	 */
	@Override
	public com.infosys.serviceBuilder.model.job_register deletejob_register(
			String position)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _job_registerLocalService.deletejob_register(position);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _job_registerLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _job_registerLocalService.dynamicQuery();
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

		return _job_registerLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.infosys.serviceBuilder.model.impl.job_registerModelImpl</code>.
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

		return _job_registerLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.infosys.serviceBuilder.model.impl.job_registerModelImpl</code>.
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

		return _job_registerLocalService.dynamicQuery(
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

		return _job_registerLocalService.dynamicQueryCount(dynamicQuery);
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

		return _job_registerLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.infosys.serviceBuilder.model.job_register fetchjob_register(
		String position) {

		return _job_registerLocalService.fetchjob_register(position);
	}

	/**
	 * Returns the job_register with the primary key.
	 *
	 * @param position the primary key of the job_register
	 * @return the job_register
	 * @throws PortalException if a job_register with the primary key could not be found
	 */
	@Override
	public com.infosys.serviceBuilder.model.job_register getjob_register(
			String position)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _job_registerLocalService.getjob_register(position);
	}

	/**
	 * Returns a range of all the job_registers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.infosys.serviceBuilder.model.impl.job_registerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of job_registers
	 * @param end the upper bound of the range of job_registers (not inclusive)
	 * @return the range of job_registers
	 */
	@Override
	public java.util.List<com.infosys.serviceBuilder.model.job_register>
		getjob_registers(int start, int end) {

		return _job_registerLocalService.getjob_registers(start, end);
	}

	/**
	 * Returns the number of job_registers.
	 *
	 * @return the number of job_registers
	 */
	@Override
	public int getjob_registersCount() {
		return _job_registerLocalService.getjob_registersCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _job_registerLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _job_registerLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the job_register in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect job_registerLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param job_register the job_register
	 * @return the job_register that was updated
	 */
	@Override
	public com.infosys.serviceBuilder.model.job_register updatejob_register(
		com.infosys.serviceBuilder.model.job_register job_register) {

		return _job_registerLocalService.updatejob_register(job_register);
	}

	@Override
	public job_registerLocalService getWrappedService() {
		return _job_registerLocalService;
	}

	@Override
	public void setWrappedService(
		job_registerLocalService job_registerLocalService) {

		_job_registerLocalService = job_registerLocalService;
	}

	private job_registerLocalService _job_registerLocalService;

}