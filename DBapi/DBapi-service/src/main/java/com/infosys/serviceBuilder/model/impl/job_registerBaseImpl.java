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
import com.infosys.serviceBuilder.service.job_registerLocalServiceUtil;

/**
 * The extended model base implementation for the job_register service. Represents a row in the &quot;job_register&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link job_registerImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see job_registerImpl
 * @see job_register
 * @generated
 */
public abstract class job_registerBaseImpl
	extends job_registerModelImpl implements job_register {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a job_register model instance should use the <code>job_register</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			job_registerLocalServiceUtil.addjob_register(this);
		}
		else {
			job_registerLocalServiceUtil.updatejob_register(this);
		}
	}

}