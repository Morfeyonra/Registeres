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

import com.infosys.serviceBuilder.exception.NoSuchbanksException;
import com.infosys.serviceBuilder.model.banks;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import java.util.Set;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the banks service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see banksUtil
 * @generated
 */
@ProviderType
public interface banksPersistence extends BasePersistence<banks> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link banksUtil} to access the banks persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the bankses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching bankses
	 */
	public java.util.List<banks> findByUuid(String uuid);

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
	public java.util.List<banks> findByUuid(String uuid, int start, int end);

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
	public java.util.List<banks> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<banks>
			orderByComparator);

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
	public java.util.List<banks> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<banks>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first banks in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching banks
	 * @throws NoSuchbanksException if a matching banks could not be found
	 */
	public banks findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<banks>
				orderByComparator)
		throws NoSuchbanksException;

	/**
	 * Returns the first banks in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching banks, or <code>null</code> if a matching banks could not be found
	 */
	public banks fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<banks>
			orderByComparator);

	/**
	 * Returns the last banks in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching banks
	 * @throws NoSuchbanksException if a matching banks could not be found
	 */
	public banks findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<banks>
				orderByComparator)
		throws NoSuchbanksException;

	/**
	 * Returns the last banks in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching banks, or <code>null</code> if a matching banks could not be found
	 */
	public banks fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<banks>
			orderByComparator);

	/**
	 * Returns the bankses before and after the current banks in the ordered set where uuid = &#63;.
	 *
	 * @param banksPK the primary key of the current banks
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next banks
	 * @throws NoSuchbanksException if a banks with the primary key could not be found
	 */
	public banks[] findByUuid_PrevAndNext(
			com.infosys.serviceBuilder.service.persistence.banksPK banksPK,
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<banks>
				orderByComparator)
		throws NoSuchbanksException;

	/**
	 * Removes all the bankses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of bankses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching bankses
	 */
	public int countByUuid(String uuid);

	/**
	 * Caches the banks in the entity cache if it is enabled.
	 *
	 * @param banks the banks
	 */
	public void cacheResult(banks banks);

	/**
	 * Caches the bankses in the entity cache if it is enabled.
	 *
	 * @param bankses the bankses
	 */
	public void cacheResult(java.util.List<banks> bankses);

	/**
	 * Creates a new banks with the primary key. Does not add the banks to the database.
	 *
	 * @param banksPK the primary key for the new banks
	 * @return the new banks
	 */
	public banks create(
		com.infosys.serviceBuilder.service.persistence.banksPK banksPK);

	/**
	 * Removes the banks with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param banksPK the primary key of the banks
	 * @return the banks that was removed
	 * @throws NoSuchbanksException if a banks with the primary key could not be found
	 */
	public banks remove(
			com.infosys.serviceBuilder.service.persistence.banksPK banksPK)
		throws NoSuchbanksException;

	public banks updateImpl(banks banks);

	/**
	 * Returns the banks with the primary key or throws a <code>NoSuchbanksException</code> if it could not be found.
	 *
	 * @param banksPK the primary key of the banks
	 * @return the banks
	 * @throws NoSuchbanksException if a banks with the primary key could not be found
	 */
	public banks findByPrimaryKey(
			com.infosys.serviceBuilder.service.persistence.banksPK banksPK)
		throws NoSuchbanksException;

	/**
	 * Returns the banks with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param banksPK the primary key of the banks
	 * @return the banks, or <code>null</code> if a banks with the primary key could not be found
	 */
	public banks fetchByPrimaryKey(
		com.infosys.serviceBuilder.service.persistence.banksPK banksPK);

	/**
	 * Returns all the bankses.
	 *
	 * @return the bankses
	 */
	public java.util.List<banks> findAll();

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
	public java.util.List<banks> findAll(int start, int end);

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
	public java.util.List<banks> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<banks>
			orderByComparator);

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
	public java.util.List<banks> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<banks>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the bankses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of bankses.
	 *
	 * @return the number of bankses
	 */
	public int countAll();

	public Set<String> getCompoundPKColumnNames();

}