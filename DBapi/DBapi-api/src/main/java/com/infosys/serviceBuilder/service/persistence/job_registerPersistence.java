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

import com.infosys.serviceBuilder.exception.NoSuchjob_registerException;
import com.infosys.serviceBuilder.model.job_register;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the job_register service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see job_registerUtil
 * @generated
 */
@ProviderType
public interface job_registerPersistence extends BasePersistence<job_register> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link job_registerUtil} to access the job_register persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Caches the job_register in the entity cache if it is enabled.
	 *
	 * @param job_register the job_register
	 */
	public void cacheResult(job_register job_register);

	/**
	 * Caches the job_registers in the entity cache if it is enabled.
	 *
	 * @param job_registers the job_registers
	 */
	public void cacheResult(java.util.List<job_register> job_registers);

	/**
	 * Creates a new job_register with the primary key. Does not add the job_register to the database.
	 *
	 * @param position the primary key for the new job_register
	 * @return the new job_register
	 */
	public job_register create(String position);

	/**
	 * Removes the job_register with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param position the primary key of the job_register
	 * @return the job_register that was removed
	 * @throws NoSuchjob_registerException if a job_register with the primary key could not be found
	 */
	public job_register remove(String position)
		throws NoSuchjob_registerException;

	public job_register updateImpl(job_register job_register);

	/**
	 * Returns the job_register with the primary key or throws a <code>NoSuchjob_registerException</code> if it could not be found.
	 *
	 * @param position the primary key of the job_register
	 * @return the job_register
	 * @throws NoSuchjob_registerException if a job_register with the primary key could not be found
	 */
	public job_register findByPrimaryKey(String position)
		throws NoSuchjob_registerException;

	/**
	 * Returns the job_register with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param position the primary key of the job_register
	 * @return the job_register, or <code>null</code> if a job_register with the primary key could not be found
	 */
	public job_register fetchByPrimaryKey(String position);

	/**
	 * Returns all the job_registers.
	 *
	 * @return the job_registers
	 */
	public java.util.List<job_register> findAll();

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
	public java.util.List<job_register> findAll(int start, int end);

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
	public java.util.List<job_register> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<job_register>
			orderByComparator);

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
	public java.util.List<job_register> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<job_register>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the job_registers from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of job_registers.
	 *
	 * @return the number of job_registers
	 */
	public int countAll();

}