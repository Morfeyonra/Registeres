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
 * This class is a wrapper for {@link banks}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see banks
 * @generated
 */
public class banksWrapper
	extends BaseModelWrapper<banks> implements banks, ModelWrapper<banks> {

	public banksWrapper(banks banks) {
		super(banks);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("bank_name", getBank_name());
		attributes.put("bik", getBik());
		attributes.put("address", getAddress());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		String bank_name = (String)attributes.get("bank_name");

		if (bank_name != null) {
			setBank_name(bank_name);
		}

		String bik = (String)attributes.get("bik");

		if (bik != null) {
			setBik(bik);
		}

		String address = (String)attributes.get("address");

		if (address != null) {
			setAddress(address);
		}
	}

	/**
	 * Returns the address of this banks.
	 *
	 * @return the address of this banks
	 */
	@Override
	public String getAddress() {
		return model.getAddress();
	}

	/**
	 * Returns the bank_name of this banks.
	 *
	 * @return the bank_name of this banks
	 */
	@Override
	public String getBank_name() {
		return model.getBank_name();
	}

	/**
	 * Returns the bik of this banks.
	 *
	 * @return the bik of this banks
	 */
	@Override
	public String getBik() {
		return model.getBik();
	}

	/**
	 * Returns the primary key of this banks.
	 *
	 * @return the primary key of this banks
	 */
	@Override
	public com.infosys.serviceBuilder.service.persistence.banksPK
		getPrimaryKey() {

		return model.getPrimaryKey();
	}

	/**
	 * Returns the uuid of this banks.
	 *
	 * @return the uuid of this banks
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the address of this banks.
	 *
	 * @param address the address of this banks
	 */
	@Override
	public void setAddress(String address) {
		model.setAddress(address);
	}

	/**
	 * Sets the bank_name of this banks.
	 *
	 * @param bank_name the bank_name of this banks
	 */
	@Override
	public void setBank_name(String bank_name) {
		model.setBank_name(bank_name);
	}

	/**
	 * Sets the bik of this banks.
	 *
	 * @param bik the bik of this banks
	 */
	@Override
	public void setBik(String bik) {
		model.setBik(bik);
	}

	/**
	 * Sets the primary key of this banks.
	 *
	 * @param primaryKey the primary key of this banks
	 */
	@Override
	public void setPrimaryKey(
		com.infosys.serviceBuilder.service.persistence.banksPK primaryKey) {

		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the uuid of this banks.
	 *
	 * @param uuid the uuid of this banks
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	protected banksWrapper wrap(banks banks) {
		return new banksWrapper(banks);
	}

}