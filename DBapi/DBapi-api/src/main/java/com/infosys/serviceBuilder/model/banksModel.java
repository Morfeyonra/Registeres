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

import com.infosys.serviceBuilder.service.persistence.banksPK;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the banks service. Represents a row in the &quot;banks&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.infosys.serviceBuilder.model.impl.banksModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.infosys.serviceBuilder.model.impl.banksImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see banks
 * @generated
 */
@ProviderType
public interface banksModel extends BaseModel<banks> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a banks model instance should use the {@link banks} interface instead.
	 */

	/**
	 * Returns the primary key of this banks.
	 *
	 * @return the primary key of this banks
	 */
	public banksPK getPrimaryKey();

	/**
	 * Sets the primary key of this banks.
	 *
	 * @param primaryKey the primary key of this banks
	 */
	public void setPrimaryKey(banksPK primaryKey);

	/**
	 * Returns the uuid of this banks.
	 *
	 * @return the uuid of this banks
	 */
	@AutoEscape
	public String getUuid();

	/**
	 * Sets the uuid of this banks.
	 *
	 * @param uuid the uuid of this banks
	 */
	public void setUuid(String uuid);

	/**
	 * Returns the bank_name of this banks.
	 *
	 * @return the bank_name of this banks
	 */
	@AutoEscape
	public String getBank_name();

	/**
	 * Sets the bank_name of this banks.
	 *
	 * @param bank_name the bank_name of this banks
	 */
	public void setBank_name(String bank_name);

	/**
	 * Returns the bik of this banks.
	 *
	 * @return the bik of this banks
	 */
	@AutoEscape
	public String getBik();

	/**
	 * Sets the bik of this banks.
	 *
	 * @param bik the bik of this banks
	 */
	public void setBik(String bik);

	/**
	 * Returns the address of this banks.
	 *
	 * @return the address of this banks
	 */
	@AutoEscape
	public String getAddress();

	/**
	 * Sets the address of this banks.
	 *
	 * @param address the address of this banks
	 */
	public void setAddress(String address);

}