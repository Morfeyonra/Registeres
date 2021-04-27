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

import com.infosys.serviceBuilder.model.job_register;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing job_register in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class job_registerCacheModel
	implements CacheModel<job_register>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof job_registerCacheModel)) {
			return false;
		}

		job_registerCacheModel job_registerCacheModel =
			(job_registerCacheModel)object;

		if (position.equals(job_registerCacheModel.position)) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, position);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{position=");
		sb.append(position);
		sb.append(", archive=");
		sb.append(archive);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public job_register toEntityModel() {
		job_registerImpl job_registerImpl = new job_registerImpl();

		if (position == null) {
			job_registerImpl.setPosition("");
		}
		else {
			job_registerImpl.setPosition(position);
		}

		job_registerImpl.setArchive(archive);

		job_registerImpl.resetOriginalValues();

		return job_registerImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		position = objectInput.readUTF();

		archive = objectInput.readBoolean();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (position == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(position);
		}

		objectOutput.writeBoolean(archive);
	}

	public String position;
	public boolean archive;

}