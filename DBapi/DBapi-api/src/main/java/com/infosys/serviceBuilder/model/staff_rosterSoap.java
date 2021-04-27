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
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class staff_rosterSoap implements Serializable {

	public static staff_rosterSoap toSoapModel(staff_roster model) {
		staff_rosterSoap soapModel = new staff_rosterSoap();

		soapModel.setWorker_id(model.getWorker_id());
		soapModel.setLast_name(model.getLast_name());
		soapModel.setFirst_name(model.getFirst_name());
		soapModel.setMiddle_name(model.getMiddle_name());
		soapModel.setBirth_date(model.getBirth_date());
		soapModel.setPosition(model.getPosition());
		soapModel.setEmployment_date(model.getEmployment_date());
		soapModel.setSalary(model.getSalary());
		soapModel.setWork_phone_num(model.getWork_phone_num());
		soapModel.setMobile_phone_num(model.getMobile_phone_num());
		soapModel.setBank(model.getBank());
		soapModel.setArchive(model.isArchive());

		return soapModel;
	}

	public static staff_rosterSoap[] toSoapModels(staff_roster[] models) {
		staff_rosterSoap[] soapModels = new staff_rosterSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static staff_rosterSoap[][] toSoapModels(staff_roster[][] models) {
		staff_rosterSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new staff_rosterSoap[models.length][models[0].length];
		}
		else {
			soapModels = new staff_rosterSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static staff_rosterSoap[] toSoapModels(List<staff_roster> models) {
		List<staff_rosterSoap> soapModels = new ArrayList<staff_rosterSoap>(
			models.size());

		for (staff_roster model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new staff_rosterSoap[soapModels.size()]);
	}

	public staff_rosterSoap() {
	}

	public int getPrimaryKey() {
		return _worker_id;
	}

	public void setPrimaryKey(int pk) {
		setWorker_id(pk);
	}

	public int getWorker_id() {
		return _worker_id;
	}

	public void setWorker_id(int worker_id) {
		_worker_id = worker_id;
	}

	public String getLast_name() {
		return _last_name;
	}

	public void setLast_name(String last_name) {
		_last_name = last_name;
	}

	public String getFirst_name() {
		return _first_name;
	}

	public void setFirst_name(String first_name) {
		_first_name = first_name;
	}

	public String getMiddle_name() {
		return _middle_name;
	}

	public void setMiddle_name(String middle_name) {
		_middle_name = middle_name;
	}

	public Date getBirth_date() {
		return _birth_date;
	}

	public void setBirth_date(Date birth_date) {
		_birth_date = birth_date;
	}

	public String getPosition() {
		return _position;
	}

	public void setPosition(String position) {
		_position = position;
	}

	public Date getEmployment_date() {
		return _employment_date;
	}

	public void setEmployment_date(Date employment_date) {
		_employment_date = employment_date;
	}

	public int getSalary() {
		return _salary;
	}

	public void setSalary(int salary) {
		_salary = salary;
	}

	public String getWork_phone_num() {
		return _work_phone_num;
	}

	public void setWork_phone_num(String work_phone_num) {
		_work_phone_num = work_phone_num;
	}

	public String getMobile_phone_num() {
		return _mobile_phone_num;
	}

	public void setMobile_phone_num(String mobile_phone_num) {
		_mobile_phone_num = mobile_phone_num;
	}

	public String getBank() {
		return _bank;
	}

	public void setBank(String bank) {
		_bank = bank;
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

	private int _worker_id;
	private String _last_name;
	private String _first_name;
	private String _middle_name;
	private Date _birth_date;
	private String _position;
	private Date _employment_date;
	private int _salary;
	private String _work_phone_num;
	private String _mobile_phone_num;
	private String _bank;
	private boolean _archive;

}