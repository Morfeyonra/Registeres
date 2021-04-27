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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class banksSoap implements Serializable {

	public static banksSoap toSoapModel(banks model) {
		banksSoap soapModel = new banksSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setBank_name(model.getBank_name());
		soapModel.setBik(model.getBik());
		soapModel.setAddress(model.getAddress());

		return soapModel;
	}

	public static banksSoap[] toSoapModels(banks[] models) {
		banksSoap[] soapModels = new banksSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static banksSoap[][] toSoapModels(banks[][] models) {
		banksSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new banksSoap[models.length][models[0].length];
		}
		else {
			soapModels = new banksSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static banksSoap[] toSoapModels(List<banks> models) {
		List<banksSoap> soapModels = new ArrayList<banksSoap>(models.size());

		for (banks model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new banksSoap[soapModels.size()]);
	}

	public banksSoap() {
	}

	public banksPK getPrimaryKey() {
		return new banksPK(_bank_name, _bik);
	}

	public void setPrimaryKey(banksPK pk) {
		setBank_name(pk.bank_name);
		setBik(pk.bik);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public String getBank_name() {
		return _bank_name;
	}

	public void setBank_name(String bank_name) {
		_bank_name = bank_name;
	}

	public String getBik() {
		return _bik;
	}

	public void setBik(String bik) {
		_bik = bik;
	}

	public String getAddress() {
		return _address;
	}

	public void setAddress(String address) {
		_address = address;
	}

	private String _uuid;
	private String _bank_name;
	private String _bik;
	private String _address;

}