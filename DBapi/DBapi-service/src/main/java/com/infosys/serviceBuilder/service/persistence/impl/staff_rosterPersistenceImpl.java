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

import com.infosys.serviceBuilder.exception.NoSuchstaff_rosterException;
import com.infosys.serviceBuilder.model.impl.staff_rosterImpl;
import com.infosys.serviceBuilder.model.impl.staff_rosterModelImpl;
import com.infosys.serviceBuilder.model.staff_roster;
import com.infosys.serviceBuilder.service.persistence.impl.constants.sbDBPersistenceConstants;
import com.infosys.serviceBuilder.service.persistence.staff_rosterPersistence;

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
 * The persistence implementation for the staff_roster service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = staff_rosterPersistence.class)
public class staff_rosterPersistenceImpl
	extends BasePersistenceImpl<staff_roster>
	implements staff_rosterPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>staff_rosterUtil</code> to access the staff_roster persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		staff_rosterImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;

	public staff_rosterPersistenceImpl() {
		setModelClass(staff_roster.class);

		setModelImplClass(staff_rosterImpl.class);
		setModelPKClass(int.class);
	}

	/**
	 * Caches the staff_roster in the entity cache if it is enabled.
	 *
	 * @param staff_roster the staff_roster
	 */
	@Override
	public void cacheResult(staff_roster staff_roster) {
		entityCache.putResult(
			staff_rosterImpl.class, staff_roster.getPrimaryKey(), staff_roster);
	}

	/**
	 * Caches the staff_rosters in the entity cache if it is enabled.
	 *
	 * @param staff_rosters the staff_rosters
	 */
	@Override
	public void cacheResult(List<staff_roster> staff_rosters) {
		for (staff_roster staff_roster : staff_rosters) {
			if (entityCache.getResult(
					staff_rosterImpl.class, staff_roster.getPrimaryKey()) ==
						null) {

				cacheResult(staff_roster);
			}
		}
	}

	/**
	 * Clears the cache for all staff_rosters.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(staff_rosterImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the staff_roster.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(staff_roster staff_roster) {
		entityCache.removeResult(staff_rosterImpl.class, staff_roster);
	}

	@Override
	public void clearCache(List<staff_roster> staff_rosters) {
		for (staff_roster staff_roster : staff_rosters) {
			entityCache.removeResult(staff_rosterImpl.class, staff_roster);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(staff_rosterImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new staff_roster with the primary key. Does not add the staff_roster to the database.
	 *
	 * @param worker_id the primary key for the new staff_roster
	 * @return the new staff_roster
	 */
	@Override
	public staff_roster create(int worker_id) {
		staff_roster staff_roster = new staff_rosterImpl();

		staff_roster.setNew(true);
		staff_roster.setPrimaryKey(worker_id);

		return staff_roster;
	}

	/**
	 * Removes the staff_roster with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param worker_id the primary key of the staff_roster
	 * @return the staff_roster that was removed
	 * @throws NoSuchstaff_rosterException if a staff_roster with the primary key could not be found
	 */
	@Override
	public staff_roster remove(int worker_id)
		throws NoSuchstaff_rosterException {

		return remove((Serializable)worker_id);
	}

	/**
	 * Removes the staff_roster with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the staff_roster
	 * @return the staff_roster that was removed
	 * @throws NoSuchstaff_rosterException if a staff_roster with the primary key could not be found
	 */
	@Override
	public staff_roster remove(Serializable primaryKey)
		throws NoSuchstaff_rosterException {

		Session session = null;

		try {
			session = openSession();

			staff_roster staff_roster = (staff_roster)session.get(
				staff_rosterImpl.class, primaryKey);

			if (staff_roster == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchstaff_rosterException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(staff_roster);
		}
		catch (NoSuchstaff_rosterException noSuchEntityException) {
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
	protected staff_roster removeImpl(staff_roster staff_roster) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(staff_roster)) {
				staff_roster = (staff_roster)session.get(
					staff_rosterImpl.class, staff_roster.getPrimaryKeyObj());
			}

			if (staff_roster != null) {
				session.delete(staff_roster);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (staff_roster != null) {
			clearCache(staff_roster);
		}

		return staff_roster;
	}

	@Override
	public staff_roster updateImpl(staff_roster staff_roster) {
		boolean isNew = staff_roster.isNew();

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(staff_roster);
			}
			else {
				staff_roster = (staff_roster)session.merge(staff_roster);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			staff_rosterImpl.class, staff_roster, false, true);

		if (isNew) {
			staff_roster.setNew(false);
		}

		staff_roster.resetOriginalValues();

		return staff_roster;
	}

	/**
	 * Returns the staff_roster with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the staff_roster
	 * @return the staff_roster
	 * @throws NoSuchstaff_rosterException if a staff_roster with the primary key could not be found
	 */
	@Override
	public staff_roster findByPrimaryKey(Serializable primaryKey)
		throws NoSuchstaff_rosterException {

		staff_roster staff_roster = fetchByPrimaryKey(primaryKey);

		if (staff_roster == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchstaff_rosterException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return staff_roster;
	}

	/**
	 * Returns the staff_roster with the primary key or throws a <code>NoSuchstaff_rosterException</code> if it could not be found.
	 *
	 * @param worker_id the primary key of the staff_roster
	 * @return the staff_roster
	 * @throws NoSuchstaff_rosterException if a staff_roster with the primary key could not be found
	 */
	@Override
	public staff_roster findByPrimaryKey(int worker_id)
		throws NoSuchstaff_rosterException {

		return findByPrimaryKey((Serializable)worker_id);
	}

	/**
	 * Returns the staff_roster with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param worker_id the primary key of the staff_roster
	 * @return the staff_roster, or <code>null</code> if a staff_roster with the primary key could not be found
	 */
	@Override
	public staff_roster fetchByPrimaryKey(int worker_id) {
		return fetchByPrimaryKey((Serializable)worker_id);
	}

	/**
	 * Returns all the staff_rosters.
	 *
	 * @return the staff_rosters
	 */
	@Override
	public List<staff_roster> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the staff_rosters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>staff_rosterModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of staff_rosters
	 * @param end the upper bound of the range of staff_rosters (not inclusive)
	 * @return the range of staff_rosters
	 */
	@Override
	public List<staff_roster> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the staff_rosters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>staff_rosterModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of staff_rosters
	 * @param end the upper bound of the range of staff_rosters (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of staff_rosters
	 */
	@Override
	public List<staff_roster> findAll(
		int start, int end, OrderByComparator<staff_roster> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the staff_rosters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>staff_rosterModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of staff_rosters
	 * @param end the upper bound of the range of staff_rosters (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of staff_rosters
	 */
	@Override
	public List<staff_roster> findAll(
		int start, int end, OrderByComparator<staff_roster> orderByComparator,
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

		List<staff_roster> list = null;

		if (useFinderCache) {
			list = (List<staff_roster>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_STAFF_ROSTER);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_STAFF_ROSTER;

				sql = sql.concat(staff_rosterModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<staff_roster>)QueryUtil.list(
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
	 * Removes all the staff_rosters from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (staff_roster staff_roster : findAll()) {
			remove(staff_roster);
		}
	}

	/**
	 * Returns the number of staff_rosters.
	 *
	 * @return the number of staff_rosters
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_STAFF_ROSTER);

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
		return "worker_id";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_STAFF_ROSTER;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return staff_rosterModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the staff_roster persistence.
	 */
	@Activate
	public void activate(BundleContext bundleContext) {
		_bundleContext = bundleContext;

		_argumentsResolverServiceRegistration = _bundleContext.registerService(
			ArgumentsResolver.class, new staff_rosterModelArgumentsResolver(),
			MapUtil.singletonDictionary(
				"model.class.name", staff_roster.class.getName()));

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
		entityCache.removeCache(staff_rosterImpl.class.getName());

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

	private static final String _SQL_SELECT_STAFF_ROSTER =
		"SELECT staff_roster FROM staff_roster staff_roster";

	private static final String _SQL_COUNT_STAFF_ROSTER =
		"SELECT COUNT(staff_roster) FROM staff_roster staff_roster";

	private static final String _ORDER_BY_ENTITY_ALIAS = "staff_roster.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No staff_roster exists with the primary key ";

	private static final Log _log = LogFactoryUtil.getLog(
		staff_rosterPersistenceImpl.class);

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

	private static class staff_rosterModelArgumentsResolver
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

			staff_rosterModelImpl staff_rosterModelImpl =
				(staff_rosterModelImpl)baseModel;

			long columnBitmask = staff_rosterModelImpl.getColumnBitmask();

			if (!checkColumn || (columnBitmask == 0)) {
				return _getValue(staff_rosterModelImpl, columnNames, original);
			}

			Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
				finderPath);

			if (finderPathColumnBitmask == null) {
				finderPathColumnBitmask = 0L;

				for (String columnName : columnNames) {
					finderPathColumnBitmask |=
						staff_rosterModelImpl.getColumnBitmask(columnName);
				}

				_finderPathColumnBitmasksCache.put(
					finderPath, finderPathColumnBitmask);
			}

			if ((columnBitmask & finderPathColumnBitmask) != 0) {
				return _getValue(staff_rosterModelImpl, columnNames, original);
			}

			return null;
		}

		private Object[] _getValue(
			staff_rosterModelImpl staff_rosterModelImpl, String[] columnNames,
			boolean original) {

			Object[] arguments = new Object[columnNames.length];

			for (int i = 0; i < arguments.length; i++) {
				String columnName = columnNames[i];

				if (original) {
					arguments[i] = staff_rosterModelImpl.getColumnOriginalValue(
						columnName);
				}
				else {
					arguments[i] = staff_rosterModelImpl.getColumnValue(
						columnName);
				}
			}

			return arguments;
		}

		private static Map<FinderPath, Long> _finderPathColumnBitmasksCache =
			new ConcurrentHashMap<>();

	}

}