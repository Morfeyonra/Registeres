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

import com.infosys.serviceBuilder.model.staff_roster;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing staff_roster in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class staff_rosterCacheModel
	implements CacheModel<staff_roster>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof staff_rosterCacheModel)) {
			return false;
		}

		staff_rosterCacheModel staff_rosterCacheModel =
			(staff_rosterCacheModel)object;

		if (worker_id == staff_rosterCacheModel.worker_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, worker_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{worker_id=");
		sb.append(worker_id);
		sb.append(", last_name=");
		sb.append(last_name);
		sb.append(", first_name=");
		sb.append(first_name);
		sb.append(", middle_name=");
		sb.append(middle_name);
		sb.append(", birth_date=");
		sb.append(birth_date);
		sb.append(", position=");
		sb.append(position);
		sb.append(", employment_date=");
		sb.append(employment_date);
		sb.append(", salary=");
		sb.append(salary);
		sb.append(", work_phone_num=");
		sb.append(work_phone_num);
		sb.append(", mobile_phone_num=");
		sb.append(mobile_phone_num);
		sb.append(", bank=");
		sb.append(bank);
		sb.append(", archive=");
		sb.append(archive);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public staff_roster toEntityModel() {
		staff_rosterImpl staff_rosterImpl = new staff_rosterImpl();

		staff_rosterImpl.setWorker_id(worker_id);

		if (last_name == null) {
			staff_rosterImpl.setLast_name("");
		}
		else {
			staff_rosterImpl.setLast_name(last_name);
		}

		if (first_name == null) {
			staff_rosterImpl.setFirst_name("");
		}
		else {
			staff_rosterImpl.setFirst_name(first_name);
		}

		if (middle_name == null) {
			staff_rosterImpl.setMiddle_name("");
		}
		else {
			staff_rosterImpl.setMiddle_name(middle_name);
		}

		if (birth_date == Long.MIN_VALUE) {
			staff_rosterImpl.setBirth_date(null);
		}
		else {
			staff_rosterImpl.setBirth_date(new Date(birth_date));
		}

		if (position == null) {
			staff_rosterImpl.setPosition("");
		}
		else {
			staff_rosterImpl.setPosition(position);
		}

		if (employment_date == Long.MIN_VALUE) {
			staff_rosterImpl.setEmployment_date(null);
		}
		else {
			staff_rosterImpl.setEmployment_date(new Date(employment_date));
		}

		staff_rosterImpl.setSalary(salary);

		if (work_phone_num == null) {
			staff_rosterImpl.setWork_phone_num("");
		}
		else {
			staff_rosterImpl.setWork_phone_num(work_phone_num);
		}

		if (mobile_phone_num == null) {
			staff_rosterImpl.setMobile_phone_num("");
		}
		else {
			staff_rosterImpl.setMobile_phone_num(mobile_phone_num);
		}

		if (bank == null) {
			staff_rosterImpl.setBank("");
		}
		else {
			staff_rosterImpl.setBank(bank);
		}

		staff_rosterImpl.setArchive(archive);

		staff_rosterImpl.resetOriginalValues();

		return staff_rosterImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		worker_id = objectInput.readInt();
		last_name = objectInput.readUTF();
		first_name = objectInput.readUTF();
		middle_name = objectInput.readUTF();
		birth_date = objectInput.readLong();
		position = objectInput.readUTF();
		employment_date = objectInput.readLong();

		salary = objectInput.readInt();
		work_phone_num = objectInput.readUTF();
		mobile_phone_num = objectInput.readUTF();
		bank = objectInput.readUTF();

		archive = objectInput.readBoolean();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeInt(worker_id);

		if (last_name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(last_name);
		}

		if (first_name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(first_name);
		}

		if (middle_name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(middle_name);
		}

		objectOutput.writeLong(birth_date);

		if (position == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(position);
		}

		objectOutput.writeLong(employment_date);

		objectOutput.writeInt(salary);

		if (work_phone_num == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(work_phone_num);
		}

		if (mobile_phone_num == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(mobile_phone_num);
		}

		if (bank == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bank);
		}

		objectOutput.writeBoolean(archive);
	}

	public int worker_id;
	public String last_name;
	public String first_name;
	public String middle_name;
	public long birth_date;
	public String position;
	public long employment_date;
	public int salary;
	public String work_phone_num;
	public String mobile_phone_num;
	public String bank;
	public boolean archive;

}