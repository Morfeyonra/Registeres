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

package com.infosys.serviceBuilder.service.persistence;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;

import java.io.Serializable;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public class banksPK implements Comparable<banksPK>, Serializable {

	public String bank_name;
	public String bik;

	public banksPK() {
	}

	public banksPK(String bank_name, String bik) {
		this.bank_name = bank_name;
		this.bik = bik;
	}

	public String getBank_name() {
		return bank_name;
	}

	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}

	public String getBik() {
		return bik;
	}

	public void setBik(String bik) {
		this.bik = bik;
	}

	@Override
	public int compareTo(banksPK pk) {
		if (pk == null) {
			return -1;
		}

		int value = 0;

		value = bank_name.compareTo(pk.bank_name);

		if (value != 0) {
			return value;
		}

		value = bik.compareTo(pk.bik);

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof banksPK)) {
			return false;
		}

		banksPK pk = (banksPK)object;

		if (bank_name.equals(pk.bank_name) && bik.equals(pk.bik)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		int hashCode = 0;

		hashCode = HashUtil.hash(hashCode, bank_name);
		hashCode = HashUtil.hash(hashCode, bik);

		return hashCode;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(6);

		sb.append("{");

		sb.append("bank_name=");

		sb.append(bank_name);
		sb.append(", bik=");

		sb.append(bik);

		sb.append("}");

		return sb.toString();
	}

}