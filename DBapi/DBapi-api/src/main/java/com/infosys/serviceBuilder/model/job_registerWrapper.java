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

package com.infosys.serviceBuilder.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link job_register}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see job_register
 * @generated
 */
public class job_registerWrapper
	extends BaseModelWrapper<job_register>
	implements job_register, ModelWrapper<job_register> {

	public job_registerWrapper(job_register job_register) {
		super(job_register);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("position", getPosition());
		attributes.put("archive", isArchive());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String position = (String)attributes.get("position");

		if (position != null) {
			setPosition(position);
		}

		Boolean archive = (Boolean)attributes.get("archive");

		if (archive != null) {
			setArchive(archive);
		}
	}

	/**
	 * Returns the archive of this job_register.
	 *
	 * @return the archive of this job_register
	 */
	@Override
	public boolean getArchive() {
		return model.getArchive();
	}

	/**
	 * Returns the position of this job_register.
	 *
	 * @return the position of this job_register
	 */
	@Override
	public String getPosition() {
		return model.getPosition();
	}

	/**
	 * Returns the primary key of this job_register.
	 *
	 * @return the primary key of this job_register
	 */
	@Override
	public String getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns <code>true</code> if this job_register is archive.
	 *
	 * @return <code>true</code> if this job_register is archive; <code>false</code> otherwise
	 */
	@Override
	public boolean isArchive() {
		return model.isArchive();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets whether this job_register is archive.
	 *
	 * @param archive the archive of this job_register
	 */
	@Override
	public void setArchive(boolean archive) {
		model.setArchive(archive);
	}

	/**
	 * Sets the position of this job_register.
	 *
	 * @param position the position of this job_register
	 */
	@Override
	public void setPosition(String position) {
		model.setPosition(position);
	}

	/**
	 * Sets the primary key of this job_register.
	 *
	 * @param primaryKey the primary key of this job_register
	 */
	@Override
	public void setPrimaryKey(String primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	@Override
	protected job_registerWrapper wrap(job_register job_register) {
		return new job_registerWrapper(job_register);
	}

}