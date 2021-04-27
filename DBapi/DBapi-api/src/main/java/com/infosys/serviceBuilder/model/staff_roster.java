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
 * The extended model interface for the staff_roster service. Represents a row in the &quot;staff_roster&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see staff_rosterModel
 * @generated
 */
@ImplementationClassName(
	"com.infosys.serviceBuilder.model.impl.staff_rosterImpl"
)
@ProviderType
public interface staff_roster extends PersistedModel, staff_rosterModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.infosys.serviceBuilder.model.impl.staff_rosterImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<staff_roster, Integer> WORKER_ID_ACCESSOR =
		new Accessor<staff_roster, Integer>() {

			@Override
			public Integer get(staff_roster staff_roster) {
				return staff_roster.getWorker_id();
			}

			@Override
			public Class<Integer> getAttributeClass() {
				return Integer.class;
			}

			@Override
			public Class<staff_roster> getTypeClass() {
				return staff_roster.class;
			}

		};

}