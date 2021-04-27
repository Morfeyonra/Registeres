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

package com.infosys.serviceBuilder.model.impl;

import com.infosys.serviceBuilder.model.banks;
import com.infosys.serviceBuilder.service.persistence.banksPK;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing banks in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class banksCacheModel implements CacheModel<banks>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof banksCacheModel)) {
			return false;
		}

		banksCacheModel banksCacheModel = (banksCacheModel)object;

		if (banksPK.equals(banksCacheModel.banksPK)) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, banksPK);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", bank_name=");
		sb.append(bank_name);
		sb.append(", bik=");
		sb.append(bik);
		sb.append(", address=");
		sb.append(address);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public banks toEntityModel() {
		banksImpl banksImpl = new banksImpl();

		if (uuid == null) {
			banksImpl.setUuid("");
		}
		else {
			banksImpl.setUuid(uuid);
		}

		if (bank_name == null) {
			banksImpl.setBank_name("");
		}
		else {
			banksImpl.setBank_name(bank_name);
		}

		if (bik == null) {
			banksImpl.setBik("");
		}
		else {
			banksImpl.setBik(bik);
		}

		if (address == null) {
			banksImpl.setAddress("");
		}
		else {
			banksImpl.setAddress(address);
		}

		banksImpl.resetOriginalValues();

		return banksImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();
		bank_name = objectInput.readUTF();
		bik = objectInput.readUTF();
		address = objectInput.readUTF();

		banksPK = new banksPK(bank_name, bik);
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		if (bank_name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bank_name);
		}

		if (bik == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bik);
		}

		if (address == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(address);
		}
	}

	public String uuid;
	public String bank_name;
	public String bik;
	public String address;
	public transient banksPK banksPK;

}