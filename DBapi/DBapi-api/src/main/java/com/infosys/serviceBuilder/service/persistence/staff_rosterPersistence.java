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

import com.infosys.serviceBuilder.exception.NoSuchstaff_rosterException;
import com.infosys.serviceBuilder.model.staff_roster;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the staff_roster service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see staff_rosterUtil
 * @generated
 */
@ProviderType
public interface staff_rosterPersistence extends BasePersistence<staff_roster> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link staff_rosterUtil} to access the staff_roster persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Caches the staff_roster in the entity cache if it is enabled.
	 *
	 * @param staff_roster the staff_roster
	 */
	public void cacheResult(staff_roster staff_roster);

	/**
	 * Caches the staff_rosters in the entity cache if it is enabled.
	 *
	 * @param staff_rosters the staff_rosters
	 */
	public void cacheResult(java.util.List<staff_roster> staff_rosters);

	/**
	 * Creates a new staff_roster with the primary key. Does not add the staff_roster to the database.
	 *
	 * @param worker_id the primary key for the new staff_roster
	 * @return the new staff_roster
	 */
	public staff_roster create(int worker_id);

	/**
	 * Removes the staff_roster with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param worker_id the primary key of the staff_roster
	 * @return the staff_roster that was removed
	 * @throws NoSuchstaff_rosterException if a staff_roster with the primary key could not be found
	 */
	public staff_roster remove(int worker_id)
		throws NoSuchstaff_rosterException;

	public staff_roster updateImpl(staff_roster staff_roster);

	/**
	 * Returns the staff_roster with the primary key or throws a <code>NoSuchstaff_rosterException</code> if it could not be found.
	 *
	 * @param worker_id the primary key of the staff_roster
	 * @return the staff_roster
	 * @throws NoSuchstaff_rosterException if a staff_roster with the primary key could not be found
	 */
	public staff_roster findByPrimaryKey(int worker_id)
		throws NoSuchstaff_rosterException;

	/**
	 * Returns the staff_roster with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param worker_id the primary key of the staff_roster
	 * @return the staff_roster, or <code>null</code> if a staff_roster with the primary key could not be found
	 */
	public staff_roster fetchByPrimaryKey(int worker_id);

	/**
	 * Returns all the staff_rosters.
	 *
	 * @return the staff_rosters
	 */
	public java.util.List<staff_roster> findAll();

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
	public java.util.List<staff_roster> findAll(int start, int end);

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
	public java.util.List<staff_roster> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<staff_roster>
			orderByComparator);

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
	public java.util.List<staff_roster> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<staff_roster>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the staff_rosters from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of staff_rosters.
	 *
	 * @return the number of staff_rosters
	 */
	public int countAll();

}