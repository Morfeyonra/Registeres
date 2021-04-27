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

package com.infosys.serviceBuilder.service.persistence.impl;

import com.infosys.serviceBuilder.exception.NoSuchjob_registerException;
import com.infosys.serviceBuilder.model.impl.job_registerImpl;
import com.infosys.serviceBuilder.model.impl.job_registerModelImpl;
import com.infosys.serviceBuilder.model.job_register;
import com.infosys.serviceBuilder.service.persistence.impl.constants.sbDBPersistenceConstants;
import com.infosys.serviceBuilder.service.persistence.job_registerPersistence;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.MapUtil;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import javax.sql.DataSource;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the job_register service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = job_registerPersistence.class)
public class job_registerPersistenceImpl
	extends BasePersistenceImpl<job_register>
	implements job_registerPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>job_registerUtil</code> to access the job_register persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		job_registerImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;

	public job_registerPersistenceImpl() {
		setModelClass(job_register.class);

		setModelImplClass(job_registerImpl.class);
		setModelPKClass(String.class);
	}

	/**
	 * Caches the job_register in the entity cache if it is enabled.
	 *
	 * @param job_register the job_register
	 */
	@Override
	public void cacheResult(job_register job_register) {
		entityCache.putResult(
			job_registerImpl.class, job_register.getPrimaryKey(), job_register);
	}

	/**
	 * Caches the job_registers in the entity cache if it is enabled.
	 *
	 * @param job_registers the job_registers
	 */
	@Override
	public void cacheResult(List<job_register> job_registers) {
		for (job_register job_register : job_registers) {
			if (entityCache.getResult(
					job_registerImpl.class, job_register.getPrimaryKey()) ==
						null) {

				cacheResult(job_register);
			}
		}
	}

	/**
	 * Clears the cache for all job_registers.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(job_registerImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the job_register.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(job_register job_register) {
		entityCache.removeResult(job_registerImpl.class, job_register);
	}

	@Override
	public void clearCache(List<job_register> job_registers) {
		for (job_register job_register : job_registers) {
			entityCache.removeResult(job_registerImpl.class, job_register);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(job_registerImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new job_register with the primary key. Does not add the job_register to the database.
	 *
	 * @param position the primary key for the new job_register
	 * @return the new job_register
	 */
	@Override
	public job_register create(String position) {
		job_register job_register = new job_registerImpl();

		job_register.setNew(true);
		job_register.setPrimaryKey(position);

		return job_register;
	}

	/**
	 * Removes the job_register with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param position the primary key of the job_register
	 * @return the job_register that was removed
	 * @throws NoSuchjob_registerException if a job_register with the primary key could not be found
	 */
	@Override
	public job_register remove(String position)
		throws NoSuchjob_registerException {

		return remove((Serializable)position);
	}

	/**
	 * Removes the job_register with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the job_register
	 * @return the job_register that was removed
	 * @throws NoSuchjob_registerException if a job_register with the primary key could not be found
	 */
	@Override
	public job_register remove(Serializable primaryKey)
		throws NoSuchjob_registerException {

		Session session = null;

		try {
			session = openSession();

			job_register job_register = (job_register)session.get(
				job_registerImpl.class, primaryKey);

			if (job_register == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchjob_registerException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(job_register);
		}
		catch (NoSuchjob_registerException noSuchEntityException) {
			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected job_register removeImpl(job_register job_register) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(job_register)) {
				job_register = (job_register)session.get(
					job_registerImpl.class, job_register.getPrimaryKeyObj());
			}

			if (job_register != null) {
				session.delete(job_register);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (job_register != null) {
			clearCache(job_register);
		}

		return job_register;
	}

	@Override
	public job_register updateImpl(job_register job_register) {
		boolean isNew = job_register.isNew();

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(job_register);
			}
			else {
				job_register = (job_register)session.merge(job_register);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			job_registerImpl.class, job_register, false, true);

		if (isNew) {
			job_register.setNew(false);
		}

		job_register.resetOriginalValues();

		return job_register;
	}

	/**
	 * Returns the job_register with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the job_register
	 * @return the job_register
	 * @throws NoSuchjob_registerException if a job_register with the primary key could not be found
	 */
	@Override
	public job_register findByPrimaryKey(Serializable primaryKey)
		throws NoSuchjob_registerException {

		job_register job_register = fetchByPrimaryKey(primaryKey);

		if (job_register == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchjob_registerException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return job_register;
	}

	/**
	 * Returns the job_register with the primary key or throws a <code>NoSuchjob_registerException</code> if it could not be found.
	 *
	 * @param position the primary key of the job_register
	 * @return the job_register
	 * @throws NoSuchjob_registerException if a job_register with the primary key could not be found
	 */
	@Override
	public job_register findByPrimaryKey(String position)
		throws NoSuchjob_registerException {

		return findByPrimaryKey((Serializable)position);
	}

	/**
	 * Returns the job_register with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param position the primary key of the job_register
	 * @return the job_register, or <code>null</code> if a job_register with the primary key could not be found
	 */
	@Override
	public job_register fetchByPrimaryKey(String position) {
		return fetchByPrimaryKey((Serializable)position);
	}

	/**
	 * Returns all the job_registers.
	 *
	 * @return the job_registers
	 */
	@Override
	public List<job_register> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the job_registers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>job_registerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of job_registers
	 * @param end the upper bound of the range of job_registers (not inclusive)
	 * @return the range of job_registers
	 */
	@Override
	public List<job_register> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the job_registers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>job_registerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of job_registers
	 * @param end the upper bound of the range of job_registers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of job_registers
	 */
	@Override
	public List<job_register> findAll(
		int start, int end, OrderByComparator<job_register> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the job_registers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>job_registerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of job_registers
	 * @param end the upper bound of the range of job_registers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of job_registers
	 */
	@Override
	public List<job_register> findAll(
		int start, int end, OrderByComparator<job_register> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<job_register> list = null;

		if (useFinderCache) {
			list = (List<job_register>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_JOB_REGISTER);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_JOB_REGISTER;

				sql = sql.concat(job_registerModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<job_register>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the job_registers from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (job_register job_register : findAll()) {
			remove(job_register);
		}
	}

	/**
	 * Returns the number of job_registers.
	 *
	 * @return the number of job_registers
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_JOB_REGISTER);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "position";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_JOB_REGISTER;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return job_registerModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the job_register persistence.
	 */
	@Activate
	public void activate(BundleContext bundleContext) {
		_bundleContext = bundleContext;

		_argumentsResolverServiceRegistration = _bundleContext.registerService(
			ArgumentsResolver.class, new job_registerModelArgumentsResolver(),
			MapUtil.singletonDictionary(
				"model.class.name", job_register.class.getName()));

		_finderPathWithPaginationFindAll = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathWithoutPaginationFindAll = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathCountAll = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0], new String[0], false);
	}

	@Deactivate
	public void deactivate() {
		entityCache.removeCache(job_registerImpl.class.getName());

		_argumentsResolverServiceRegistration.unregister();

		for (ServiceRegistration<FinderPath> serviceRegistration :
				_serviceRegistrations) {

			serviceRegistration.unregister();
		}
	}

	@Override
	@Reference(
		target = sbDBPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = sbDBPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = sbDBPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	private BundleContext _bundleContext;

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_JOB_REGISTER =
		"SELECT job_register FROM job_register job_register";

	private static final String _SQL_COUNT_JOB_REGISTER =
		"SELECT COUNT(job_register) FROM job_register job_register";

	private static final String _ORDER_BY_ENTITY_ALIAS = "job_register.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No job_register exists with the primary key ";

	private static final Log _log = LogFactoryUtil.getLog(
		job_registerPersistenceImpl.class);

	private FinderPath _createFinderPath(
		String cacheName, String methodName, String[] params,
		String[] columnNames, boolean baseModelResult) {

		FinderPath finderPath = new FinderPath(
			cacheName, methodName, params, columnNames, baseModelResult);

		if (!cacheName.equals(FINDER_CLASS_NAME_LIST_WITH_PAGINATION)) {
			_serviceRegistrations.add(
				_bundleContext.registerService(
					FinderPath.class, finderPath,
					MapUtil.singletonDictionary("cache.name", cacheName)));
		}

		return finderPath;
	}

	private Set<ServiceRegistration<FinderPath>> _serviceRegistrations =
		new HashSet<>();
	private ServiceRegistration<ArgumentsResolver>
		_argumentsResolverServiceRegistration;

	private static class job_registerModelArgumentsResolver
		implements ArgumentsResolver {

		@Override
		public Object[] getArguments(
			FinderPath finderPath, BaseModel<?> baseModel, boolean checkColumn,
			boolean original) {

			String[] columnNames = finderPath.getColumnNames();

			if ((columnNames == null) || (columnNames.length == 0)) {
				if (baseModel.isNew()) {
					return FINDER_ARGS_EMPTY;
				}

				return null;
			}

			job_registerModelImpl job_registerModelImpl =
				(job_registerModelImpl)baseModel;

			long columnBitmask = job_registerModelImpl.getColumnBitmask();

			if (!checkColumn || (columnBitmask == 0)) {
				return _getValue(job_registerModelImpl, columnNames, original);
			}

			Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
				finderPath);

			if (finderPathColumnBitmask == null) {
				finderPathColumnBitmask = 0L;

				for (String columnName : columnNames) {
					finderPathColumnBitmask |=
						job_registerModelImpl.getColumnBitmask(columnName);
				}

				_finderPathColumnBitmasksCache.put(
					finderPath, finderPathColumnBitmask);
			}

			if ((columnBitmask & finderPathColumnBitmask) != 0) {
				return _getValue(job_registerModelImpl, columnNames, original);
			}

			return null;
		}

		private Object[] _getValue(
			job_registerModelImpl job_registerModelImpl, String[] columnNames,
			boolean original) {

			Object[] arguments = new Object[columnNames.length];

			for (int i = 0; i < arguments.length; i++) {
				String columnName = columnNames[i];

				if (original) {
					arguments[i] = job_registerModelImpl.getColumnOriginalValue(
						columnName);
				}
				else {
					arguments[i] = job_registerModelImpl.getColumnValue(
						columnName);
				}
			}

			return arguments;
		}

		private static Map<FinderPath, Long> _finderPathColumnBitmasksCache =
			new ConcurrentHashMap<>();

	}

}