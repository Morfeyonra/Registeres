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

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the banks service. Represents a row in the &quot;banks&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see banksModel
 * @generated
 */
@ImplementationClassName("com.infosys.serviceBuilder.model.impl.banksImpl")
@ProviderType
public interface banks extends banksModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.infosys.serviceBuilder.model.impl.banksImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<banks, String> BANK_NAME_ACCESSOR =
		new Accessor<banks, String>() {

			@Override
			public String get(banks banks) {
				return banks.getBank_name();
			}

			@Override
			public Class<String> getAttributeClass() {
				return String.class;
			}

			@Override
			public Class<banks> getTypeClass() {
				return banks.class;
			}

		};
	public static final Accessor<banks, String> BIK_ACCESSOR =
		new Accessor<banks, String>() {

			@Override
			public String get(banks banks) {
				return banks.getBik();
			}

			@Override
			public Class<String> getAttributeClass() {
				return String.class;
			}

			@Override
			public Class<banks> getTypeClass() {
				return banks.class;
			}

		};

}