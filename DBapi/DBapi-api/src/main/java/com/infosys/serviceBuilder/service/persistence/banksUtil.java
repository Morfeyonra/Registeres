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

import com.infosys.serviceBuilder.model.banks;

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
 * The persistence utility for the banks service. This utility wraps <code>com.infosys.serviceBuilder.service.persistence.impl.banksPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see banksPersistence
 * @generated
 */
public class banksUtil {

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
	public static void clearCache(banks banks) {
		getPersistence().clearCache(banks);
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
	public static Map<Serializable, banks> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<banks> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<banks> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<banks> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<banks> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static banks update(banks banks) {
		return getPersistence().update(banks);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static banks update(banks banks, ServiceContext serviceContext) {
		return getPersistence().update(banks, serviceContext);
	}

	/**
	 * Returns all the bankses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching bankses
	 */
	public static List<banks> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the bankses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>banksModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of bankses
	 * @param end the upper bound of the range of bankses (not inclusive)
	 * @return the range of matching bankses
	 */
	public static List<banks> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the bankses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>banksModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of bankses
	 * @param end the upper bound of the range of bankses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching bankses
	 */
	public static List<banks> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<banks> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the bankses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>banksModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of bankses
	 * @param end the upper bound of the range of bankses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching bankses
	 */
	public static List<banks> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<banks> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first banks in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching banks
	 * @throws NoSuchbanksException if a matching banks could not be found
	 */
	public static banks findByUuid_First(
			String uuid, OrderByComparator<banks> orderByComparator)
		throws com.infosys.serviceBuilder.exception.NoSuchbanksException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first banks in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching banks, or <code>null</code> if a matching banks could not be found
	 */
	public static banks fetchByUuid_First(
		String uuid, OrderByComparator<banks> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last banks in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching banks
	 * @throws NoSuchbanksException if a matching banks could not be found
	 */
	public static banks findByUuid_Last(
			String uuid, OrderByComparator<banks> orderByComparator)
		throws com.infosys.serviceBuilder.exception.NoSuchbanksException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last banks in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching banks, or <code>null</code> if a matching banks could not be found
	 */
	public static banks fetchByUuid_Last(
		String uuid, OrderByComparator<banks> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the bankses before and after the current banks in the ordered set where uuid = &#63;.
	 *
	 * @param banksPK the primary key of the current banks
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next banks
	 * @throws NoSuchbanksException if a banks with the primary key could not be found
	 */
	public static banks[] findByUuid_PrevAndNext(
			com.infosys.serviceBuilder.service.persistence.banksPK banksPK,
			String uuid, OrderByComparator<banks> orderByComparator)
		throws com.infosys.serviceBuilder.exception.NoSuchbanksException {

		return getPersistence().findByUuid_PrevAndNext(
			banksPK, uuid, orderByComparator);
	}

	/**
	 * Removes all the bankses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of bankses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching bankses
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Caches the banks in the entity cache if it is enabled.
	 *
	 * @param banks the banks
	 */
	public static void cacheResult(banks banks) {
		getPersistence().cacheResult(banks);
	}

	/**
	 * Caches the bankses in the entity cache if it is enabled.
	 *
	 * @param bankses the bankses
	 */
	public static void cacheResult(List<banks> bankses) {
		getPersistence().cacheResult(bankses);
	}

	/**
	 * Creates a new banks with the primary key. Does not add the banks to the database.
	 *
	 * @param banksPK the primary key for the new banks
	 * @return the new banks
	 */
	public static banks create(
		com.infosys.serviceBuilder.service.persistence.banksPK banksPK) {

		return getPersistence().create(banksPK);
	}

	/**
	 * Removes the banks with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param banksPK the primary key of the banks
	 * @return the banks that was removed
	 * @throws NoSuchbanksException if a banks with the primary key could not be found
	 */
	public static banks remove(
			com.infosys.serviceBuilder.service.persistence.banksPK banksPK)
		throws com.infosys.serviceBuilder.exception.NoSuchbanksException {

		return getPersistence().remove(banksPK);
	}

	public static banks updateImpl(banks banks) {
		return getPersistence().updateImpl(banks);
	}

	/**
	 * Returns the banks with the primary key or throws a <code>NoSuchbanksException</code> if it could not be found.
	 *
	 * @param banksPK the primary key of the banks
	 * @return the banks
	 * @throws NoSuchbanksException if a banks with the primary key could not be found
	 */
	public static banks findByPrimaryKey(
			com.infosys.serviceBuilder.service.persistence.banksPK banksPK)
		throws com.infosys.serviceBuilder.exception.NoSuchbanksException {

		return getPersistence().findByPrimaryKey(banksPK);
	}

	/**
	 * Returns the banks with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param banksPK the primary key of the banks
	 * @return the banks, or <code>null</code> if a banks with the primary key could not be found
	 */
	public static banks fetchByPrimaryKey(
		com.infosys.serviceBuilder.service.persistence.banksPK banksPK) {

		return getPersistence().fetchByPrimaryKey(banksPK);
	}

	/**
	 * Returns all the bankses.
	 *
	 * @return the bankses
	 */
	public static List<banks> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the bankses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>banksModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of bankses
	 * @param end the upper bound of the range of bankses (not inclusive)
	 * @return the range of bankses
	 */
	public static List<banks> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the bankses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>banksModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of bankses
	 * @param end the upper bound of the range of bankses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of bankses
	 */
	public static List<banks> findAll(
		int start, int end, OrderByComparator<banks> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the bankses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>banksModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of bankses
	 * @param end the upper bound of the range of bankses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of bankses
	 */
	public static List<banks> findAll(
		int start, int end, OrderByComparator<banks> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the bankses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of bankses.
	 *
	 * @return the number of bankses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static Set<String> getCompoundPKColumnNames() {
		return getPersistence().getCompoundPKColumnNames();
	}

	public static banksPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<banksPersistence, banksPersistence>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(banksPersistence.class);

		ServiceTracker<banksPersistence, banksPersistence> serviceTracker =
			new ServiceTracker<banksPersistence, banksPersistence>(
				bundle.getBundleContext(), banksPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}