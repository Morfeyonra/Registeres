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

package com.infosys.serviceBuilder.service.base;

import com.infosys.serviceBuilder.model.banks;
import com.infosys.serviceBuilder.service.banksLocalService;
import com.infosys.serviceBuilder.service.persistence.banksPK;
import com.infosys.serviceBuilder.service.persistence.banksPersistence;
import com.infosys.serviceBuilder.service.persistence.job_registerPersistence;
import com.infosys.serviceBuilder.service.persistence.staff_rosterPersistence;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalServiceImpl;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PortalUtil;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the banks local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.infosys.serviceBuilder.service.impl.banksLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.infosys.serviceBuilder.service.impl.banksLocalServiceImpl
 * @generated
 */
public abstract class banksLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, banksLocalService, IdentifiableOSGiService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>banksLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.infosys.serviceBuilder.service.banksLocalServiceUtil</code>.
	 */

	/**
	 * Adds the banks to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect banksLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param banks the banks
	 * @return the banks that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public banks addbanks(banks banks) {
		banks.setNew(true);

		return banksPersistence.update(banks);
	}

	/**
	 * Creates a new banks with the primary key. Does not add the banks to the database.
	 *
	 * @param banksPK the primary key for the new banks
	 * @return the new banks
	 */
	@Override
	@Transactional(enabled = false)
	public banks createbanks(banksPK banksPK) {
		return banksPersistence.create(banksPK);
	}

	/**
	 * Deletes the banks with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect banksLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param banksPK the primary key of the banks
	 * @return the banks that was removed
	 * @throws PortalException if a banks with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public banks deletebanks(banksPK banksPK) throws PortalException {
		return banksPersistence.remove(banksPK);
	}

	/**
	 * Deletes the banks from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect banksLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param banks the banks
	 * @return the banks that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public banks deletebanks(banks banks) {
		return banksPersistence.remove(banks);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(
			banks.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return banksPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.infosys.serviceBuilder.model.impl.banksModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return banksPersistence.findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.infosys.serviceBuilder.model.impl.banksModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return banksPersistence.findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return banksPersistence.countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		DynamicQuery dynamicQuery, Projection projection) {

		return banksPersistence.countWithDynamicQuery(dynamicQuery, projection);
	}

	@Override
	public banks fetchbanks(banksPK banksPK) {
		return banksPersistence.fetchByPrimaryKey(banksPK);
	}

	/**
	 * Returns the banks with the primary key.
	 *
	 * @param banksPK the primary key of the banks
	 * @return the banks
	 * @throws PortalException if a banks with the primary key could not be found
	 */
	@Override
	public banks getbanks(banksPK banksPK) throws PortalException {
		return banksPersistence.findByPrimaryKey(banksPK);
	}

	/**
	 * @throws PortalException
	 */
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return banksPersistence.create((banksPK)primaryKeyObj);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {

		return banksLocalService.deletebanks((banks)persistedModel);
	}

	public BasePersistence<banks> getBasePersistence() {
		return banksPersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return banksPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the bankses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.infosys.serviceBuilder.model.impl.banksModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of bankses
	 * @param end the upper bound of the range of bankses (not inclusive)
	 * @return the range of bankses
	 */
	@Override
	public List<banks> getbankses(int start, int end) {
		return banksPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of bankses.
	 *
	 * @return the number of bankses
	 */
	@Override
	public int getbanksesCount() {
		return banksPersistence.countAll();
	}

	/**
	 * Updates the banks in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect banksLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param banks the banks
	 * @return the banks that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public banks updatebanks(banks banks) {
		return banksPersistence.update(banks);
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			banksLocalService.class, IdentifiableOSGiService.class,
			PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		banksLocalService = (banksLocalService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return banksLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return banks.class;
	}

	protected String getModelClassName() {
		return banks.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = banksPersistence.getDataSource();

			DB db = DBManagerUtil.getDB();

			sql = db.buildSQL(sql);
			sql = PortalUtil.transformSQL(sql);

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(
				dataSource, sql);

			sqlUpdate.update();
		}
		catch (Exception exception) {
			throw new SystemException(exception);
		}
	}

	protected banksLocalService banksLocalService;

	@Reference
	protected banksPersistence banksPersistence;

	@Reference
	protected job_registerPersistence job_registerPersistence;

	@Reference
	protected staff_rosterPersistence staff_rosterPersistence;

	@Reference
	protected com.liferay.counter.kernel.service.CounterLocalService
		counterLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.ClassNameLocalService
		classNameLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.ResourceLocalService
		resourceLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.UserLocalService
		userLocalService;

}