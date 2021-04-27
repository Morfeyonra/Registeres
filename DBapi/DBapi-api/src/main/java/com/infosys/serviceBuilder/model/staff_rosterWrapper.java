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

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link staff_roster}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see staff_roster
 * @generated
 */
public class staff_rosterWrapper
	extends BaseModelWrapper<staff_roster>
	implements ModelWrapper<staff_roster>, staff_roster {

	public staff_rosterWrapper(staff_roster staff_roster) {
		super(staff_roster);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("worker_id", getWorker_id());
		attributes.put("last_name", getLast_name());
		attributes.put("first_name", getFirst_name());
		attributes.put("middle_name", getMiddle_name());
		attributes.put("birth_date", getBirth_date());
		attributes.put("position", getPosition());
		attributes.put("employment_date", getEmployment_date());
		attributes.put("salary", getSalary());
		attributes.put("work_phone_num", getWork_phone_num());
		attributes.put("mobile_phone_num", getMobile_phone_num());
		attributes.put("bank", getBank());
		attributes.put("archive", isArchive());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer worker_id = (Integer)attributes.get("worker_id");

		if (worker_id != null) {
			setWorker_id(worker_id);
		}

		String last_name = (String)attributes.get("last_name");

		if (last_name != null) {
			setLast_name(last_name);
		}

		String first_name = (String)attributes.get("first_name");

		if (first_name != null) {
			setFirst_name(first_name);
		}

		String middle_name = (String)attributes.get("middle_name");

		if (middle_name != null) {
			setMiddle_name(middle_name);
		}

		Date birth_date = (Date)attributes.get("birth_date");

		if (birth_date != null) {
			setBirth_date(birth_date);
		}

		String position = (String)attributes.get("position");

		if (position != null) {
			setPosition(position);
		}

		Date employment_date = (Date)attributes.get("employment_date");

		if (employment_date != null) {
			setEmployment_date(employment_date);
		}

		Integer salary = (Integer)attributes.get("salary");

		if (salary != null) {
			setSalary(salary);
		}

		String work_phone_num = (String)attributes.get("work_phone_num");

		if (work_phone_num != null) {
			setWork_phone_num(work_phone_num);
		}

		String mobile_phone_num = (String)attributes.get("mobile_phone_num");

		if (mobile_phone_num != null) {
			setMobile_phone_num(mobile_phone_num);
		}

		String bank = (String)attributes.get("bank");

		if (bank != null) {
			setBank(bank);
		}

		Boolean archive = (Boolean)attributes.get("archive");

		if (archive != null) {
			setArchive(archive);
		}
	}

	/**
	 * Returns the archive of this staff_roster.
	 *
	 * @return the archive of this staff_roster
	 */
	@Override
	public boolean getArchive() {
		return model.getArchive();
	}

	/**
	 * Returns the bank of this staff_roster.
	 *
	 * @return the bank of this staff_roster
	 */
	@Override
	public String getBank() {
		return model.getBank();
	}

	/**
	 * Returns the birth_date of this staff_roster.
	 *
	 * @return the birth_date of this staff_roster
	 */
	@Override
	public Date getBirth_date() {
		return model.getBirth_date();
	}

	/**
	 * Returns the employment_date of this staff_roster.
	 *
	 * @return the employment_date of this staff_roster
	 */
	@Override
	public Date getEmployment_date() {
		return model.getEmployment_date();
	}

	/**
	 * Returns the first_name of this staff_roster.
	 *
	 * @return the first_name of this staff_roster
	 */
	@Override
	public String getFirst_name() {
		return model.getFirst_name();
	}

	/**
	 * Returns the last_name of this staff_roster.
	 *
	 * @return the last_name of this staff_roster
	 */
	@Override
	public String getLast_name() {
		return model.getLast_name();
	}

	/**
	 * Returns the middle_name of this staff_roster.
	 *
	 * @return the middle_name of this staff_roster
	 */
	@Override
	public String getMiddle_name() {
		return model.getMiddle_name();
	}

	/**
	 * Returns the mobile_phone_num of this staff_roster.
	 *
	 * @return the mobile_phone_num of this staff_roster
	 */
	@Override
	public String getMobile_phone_num() {
		return model.getMobile_phone_num();
	}

	/**
	 * Returns the position of this staff_roster.
	 *
	 * @return the position of this staff_roster
	 */
	@Override
	public String getPosition() {
		return model.getPosition();
	}

	/**
	 * Returns the primary key of this staff_roster.
	 *
	 * @return the primary key of this staff_roster
	 */
	@Override
	public int getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the salary of this staff_roster.
	 *
	 * @return the salary of this staff_roster
	 */
	@Override
	public int getSalary() {
		return model.getSalary();
	}

	/**
	 * Returns the work_phone_num of this staff_roster.
	 *
	 * @return the work_phone_num of this staff_roster
	 */
	@Override
	public String getWork_phone_num() {
		return model.getWork_phone_num();
	}

	/**
	 * Returns the worker_id of this staff_roster.
	 *
	 * @return the worker_id of this staff_roster
	 */
	@Override
	public int getWorker_id() {
		return model.getWorker_id();
	}

	/**
	 * Returns <code>true</code> if this staff_roster is archive.
	 *
	 * @return <code>true</code> if this staff_roster is archive; <code>false</code> otherwise
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
	 * Sets whether this staff_roster is archive.
	 *
	 * @param archive the archive of this staff_roster
	 */
	@Override
	public void setArchive(boolean archive) {
		model.setArchive(archive);
	}

	/**
	 * Sets the bank of this staff_roster.
	 *
	 * @param bank the bank of this staff_roster
	 */
	@Override
	public void setBank(String bank) {
		model.setBank(bank);
	}

	/**
	 * Sets the birth_date of this staff_roster.
	 *
	 * @param birth_date the birth_date of this staff_roster
	 */
	@Override
	public void setBirth_date(Date birth_date) {
		model.setBirth_date(birth_date);
	}

	/**
	 * Sets the employment_date of this staff_roster.
	 *
	 * @param employment_date the employment_date of this staff_roster
	 */
	@Override
	public void setEmployment_date(Date employment_date) {
		model.setEmployment_date(employment_date);
	}

	/**
	 * Sets the first_name of this staff_roster.
	 *
	 * @param first_name the first_name of this staff_roster
	 */
	@Override
	public void setFirst_name(String first_name) {
		model.setFirst_name(first_name);
	}

	/**
	 * Sets the last_name of this staff_roster.
	 *
	 * @param last_name the last_name of this staff_roster
	 */
	@Override
	public void setLast_name(String last_name) {
		model.setLast_name(last_name);
	}

	/**
	 * Sets the middle_name of this staff_roster.
	 *
	 * @param middle_name the middle_name of this staff_roster
	 */
	@Override
	public void setMiddle_name(String middle_name) {
		model.setMiddle_name(middle_name);
	}

	/**
	 * Sets the mobile_phone_num of this staff_roster.
	 *
	 * @param mobile_phone_num the mobile_phone_num of this staff_roster
	 */
	@Override
	public void setMobile_phone_num(String mobile_phone_num) {
		model.setMobile_phone_num(mobile_phone_num);
	}

	/**
	 * Sets the position of this staff_roster.
	 *
	 * @param position the position of this staff_roster
	 */
	@Override
	public void setPosition(String position) {
		model.setPosition(position);
	}

	/**
	 * Sets the primary key of this staff_roster.
	 *
	 * @param primaryKey the primary key of this staff_roster
	 */
	@Override
	public void setPrimaryKey(int primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the salary of this staff_roster.
	 *
	 * @param salary the salary of this staff_roster
	 */
	@Override
	public void setSalary(int salary) {
		model.setSalary(salary);
	}

	/**
	 * Sets the work_phone_num of this staff_roster.
	 *
	 * @param work_phone_num the work_phone_num of this staff_roster
	 */
	@Override
	public void setWork_phone_num(String work_phone_num) {
		model.setWork_phone_num(work_phone_num);
	}

	/**
	 * Sets the worker_id of this staff_roster.
	 *
	 * @param worker_id the worker_id of this staff_roster
	 */
	@Override
	public void setWorker_id(int worker_id) {
		model.setWorker_id(worker_id);
	}

	@Override
	protected staff_rosterWrapper wrap(staff_roster staff_roster) {
		return new staff_rosterWrapper(staff_roster);
	}

}