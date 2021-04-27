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

package com.infosys.serviceBuilder.service.persistence;

import com.infosys.serviceBuilder.model.job_register;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the job_register service. This utility wraps <code>com.infosys.serviceBuilder.service.persistence.impl.job_registerPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see job_registerPersistence
 * @generated
 */
public class job_registerUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(job_register job_register) {
		getPersistence().clearCache(job_register);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, job_register> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<job_register> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<job_register> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<job_register> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<job_register> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static job_register update(job_register job_register) {
		return getPersistence().update(job_register);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static job_register update(
		job_register job_register, ServiceContext serviceContext) {

		return getPersistence().update(job_register, serviceContext);
	}

	/**
	 * Caches the job_register in the entity cache if it is enabled.
	 *
	 * @param job_register the job_register
	 */
	public static void cacheResult(job_register job_register) {
		getPersistence().cacheResult(job_register);
	}

	/**
	 * Caches the job_registers in the entity cache if it is enabled.
	 *
	 * @param job_registers the job_registers
	 */
	public static void cacheResult(List<job_register> job_registers) {
		getPersistence().cacheResult(job_registers);
	}

	/**
	 * Creates a new job_register with the primary key. Does not add the job_register to the database.
	 *
	 * @param position the primary key for the new job_register
	 * @return the new job_register
	 */
	public static job_register create(String position) {
		return getPersistence().create(position);
	}

	/**
	 * Removes the job_register with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param position the primary key of the job_register
	 * @return the job_register that was removed
	 * @throws NoSuchjob_registerException if a job_register with the primary key could not be found
	 */
	public static job_register remove(String position)
		throws com.infosys.serviceBuilder.exception.
			NoSuchjob_registerException {

		return getPersistence().remove(position);
	}

	public static job_register updateImpl(job_register job_register) {
		return getPersistence().updateImpl(job_register);
	}

	/**
	 * Returns the job_register with the primary key or throws a <code>NoSuchjob_registerException</code> if it could not be found.
	 *
	 * @param position the primary key of the job_register
	 * @return the job_register
	 * @throws NoSuchjob_registerException if a job_register with the primary key could not be found
	 */
	public static job_register findByPrimaryKey(String position)
		throws com.infosys.serviceBuilder.exception.
			NoSuchjob_registerException {

		return getPersistence().findByPrimaryKey(position);
	}

	/**
	 * Returns the job_register with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param position the primary key of the job_register
	 * @return the job_register, or <code>null</code> if a job_register with the primary key could not be found
	 */
	public static job_register fetchByPrimaryKey(String position) {
		return getPersistence().fetchByPrimaryKey(position);
	}

	/**
	 * Returns all the job_registers.
	 *
	 * @return the job_registers
	 */
	public static List<job_register> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the job_registers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>job_registerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of job_registers
	 * @param end the upper bound of the range of job_registers (not inclusive)
	 * @return the range of job_registers
	 */
	public static List<job_register> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the job_registers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>job_registerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of job_registers
	 * @param end the upper bound of the range of job_registers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of job_registers
	 */
	public static List<job_register> findAll(
		int start, int end, OrderByComparator<job_register> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the job_registers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>job_registerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of job_registers
	 * @param end the upper bound of the range of job_registers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of job_registers
	 */
	public static List<job_register> findAll(
		int start, int end, OrderByComparator<job_register> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the job_registers from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of job_registers.
	 *
	 * @return the number of job_registers
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static job_registerPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<job_registerPersistence, job_registerPersistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(job_registerPersistence.class);

		ServiceTracker<job_registerPersistence, job_registerPersistence>
			serviceTracker =
				new ServiceTracker
					<job_registerPersistence, job_registerPersistence>(
						bundle.getBundleContext(),
						job_registerPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}