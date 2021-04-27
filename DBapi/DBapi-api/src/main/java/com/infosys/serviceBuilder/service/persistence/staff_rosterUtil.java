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

import com.infosys.serviceBuilder.model.staff_roster;

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
 * The persistence utility for the staff_roster service. This utility wraps <code>com.infosys.serviceBuilder.service.persistence.impl.staff_rosterPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see staff_rosterPersistence
 * @generated
 */
public class staff_rosterUtil {

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
	public static void clearCache(staff_roster staff_roster) {
		getPersistence().clearCache(staff_roster);
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
	public static Map<Serializable, staff_roster> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<staff_roster> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<staff_roster> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<staff_roster> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<staff_roster> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static staff_roster update(staff_roster staff_roster) {
		return getPersistence().update(staff_roster);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static staff_roster update(
		staff_roster staff_roster, ServiceContext serviceContext) {

		return getPersistence().update(staff_roster, serviceContext);
	}

	/**
	 * Caches the staff_roster in the entity cache if it is enabled.
	 *
	 * @param staff_roster the staff_roster
	 */
	public static void cacheResult(staff_roster staff_roster) {
		getPersistence().cacheResult(staff_roster);
	}

	/**
	 * Caches the staff_rosters in the entity cache if it is enabled.
	 *
	 * @param staff_rosters the staff_rosters
	 */
	public static void cacheResult(List<staff_roster> staff_rosters) {
		getPersistence().cacheResult(staff_rosters);
	}

	/**
	 * Creates a new staff_roster with the primary key. Does not add the staff_roster to the database.
	 *
	 * @param worker_id the primary key for the new staff_roster
	 * @return the new staff_roster
	 */
	public static staff_roster create(int worker_id) {
		return getPersistence().create(worker_id);
	}

	/**
	 * Removes the staff_roster with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param worker_id the primary key of the staff_roster
	 * @return the staff_roster that was removed
	 * @throws NoSuchstaff_rosterException if a staff_roster with the primary key could not be found
	 */
	public static staff_roster remove(int worker_id)
		throws com.infosys.serviceBuilder.exception.
			NoSuchstaff_rosterException {

		return getPersistence().remove(worker_id);
	}

	public static staff_roster updateImpl(staff_roster staff_roster) {
		return getPersistence().updateImpl(staff_roster);
	}

	/**
	 * Returns the staff_roster with the primary key or throws a <code>NoSuchstaff_rosterException</code> if it could not be found.
	 *
	 * @param worker_id the primary key of the staff_roster
	 * @return the staff_roster
	 * @throws NoSuchstaff_rosterException if a staff_roster with the primary key could not be found
	 */
	public static staff_roster findByPrimaryKey(int worker_id)
		throws com.infosys.serviceBuilder.exception.
			NoSuchstaff_rosterException {

		return getPersistence().findByPrimaryKey(worker_id);
	}

	/**
	 * Returns the staff_roster with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param worker_id the primary key of the staff_roster
	 * @return the staff_roster, or <code>null</code> if a staff_roster with the primary key could not be found
	 */
	public static staff_roster fetchByPrimaryKey(int worker_id) {
		return getPersistence().fetchByPrimaryKey(worker_id);
	}

	/**
	 * Returns all the staff_rosters.
	 *
	 * @return the staff_rosters
	 */
	public static List<staff_roster> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the staff_rosters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>staff_rosterModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of staff_rosters
	 * @param end the upper bound of the range of staff_rosters (not inclusive)
	 * @return the range of staff_rosters
	 */
	public static List<staff_roster> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the staff_rosters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>staff_rosterModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of staff_rosters
	 * @param end the upper bound of the range of staff_rosters (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of staff_rosters
	 */
	public static List<staff_roster> findAll(
		int start, int end, OrderByComparator<staff_roster> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the staff_rosters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>staff_rosterModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of staff_rosters
	 * @param end the upper bound of the range of staff_rosters (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of staff_rosters
	 */
	public static List<staff_roster> findAll(
		int start, int end, OrderByComparator<staff_roster> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the staff_rosters from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of staff_rosters.
	 *
	 * @return the number of staff_rosters
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static staff_rosterPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<staff_rosterPersistence, staff_rosterPersistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(staff_rosterPersistence.class);

		ServiceTracker<staff_rosterPersistence, staff_rosterPersistence>
			serviceTracker =
				new ServiceTracker
					<staff_rosterPersistence, staff_rosterPersistence>(
						bundle.getBundleContext(),
						staff_rosterPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}