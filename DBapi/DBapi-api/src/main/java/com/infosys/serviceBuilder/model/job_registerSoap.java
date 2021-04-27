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
public class job_registerSoap implements Serializable {

	public static job_registerSoap toSoapModel(job_register model) {
		job_registerSoap soapModel = new job_registerSoap();

		soapModel.setPosition(model.getPosition());
		soapModel.setArchive(model.isArchive());

		return soapModel;
	}

	public static job_registerSoap[] toSoapModels(job_register[] models) {
		job_registerSoap[] soapModels = new job_registerSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static job_registerSoap[][] toSoapModels(job_register[][] models) {
		job_registerSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new job_registerSoap[models.length][models[0].length];
		}
		else {
			soapModels = new job_registerSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static job_registerSoap[] toSoapModels(List<job_register> models) {
		List<job_registerSoap> soapModels = new ArrayList<job_registerSoap>(
			models.size());

		for (job_register model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new job_registerSoap[soapModels.size()]);
	}

	public job_registerSoap() {
	}

	public String getPrimaryKey() {
		return _position;
	}

	public void setPrimaryKey(String pk) {
		setPosition(pk);
	}

	public String getPosition() {
		return _position;
	}

	public void setPosition(String position) {
		_position = position;
	}

	public boolean getArchive() {
		return _archive;
	}

	public boolean isArchive() {
		return _archive;
	}

	public void setArchive(boolean archive) {
		_archive = archive;
	}

	private String _position;
	private boolean _archive;

}