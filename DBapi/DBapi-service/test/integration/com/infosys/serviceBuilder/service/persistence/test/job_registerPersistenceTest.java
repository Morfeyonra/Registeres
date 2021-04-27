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

package com.infosys.serviceBuilder.service.persistence.test;

import com.infosys.serviceBuilder.exception.NoSuchjob_registerException;
import com.infosys.serviceBuilder.model.job_register;
import com.infosys.serviceBuilder.service.persistence.job_registerPersistence;
import com.infosys.serviceBuilder.service.persistence.job_registerUtil;

import com.liferay.arquillian.extension.junit.bridge.junit.Arquillian;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ProjectionFactoryUtil;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.test.rule.AggregateTestRule;
import com.liferay.portal.kernel.test.util.RandomTestUtil;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.OrderByComparatorFactoryUtil;
import com.liferay.portal.test.rule.LiferayIntegrationTestRule;
import com.liferay.portal.test.rule.PersistenceTestRule;
import com.liferay.portal.test.rule.TransactionalTestRule;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * @generated
 */
@RunWith(Arquillian.class)
public class job_registerPersistenceTest {

	@ClassRule
	@Rule
	public static final AggregateTestRule aggregateTestRule =
		new AggregateTestRule(
			new LiferayIntegrationTestRule(), PersistenceTestRule.INSTANCE,
			new TransactionalTestRule(
				Propagation.REQUIRED, "com.infosys.serviceBuilder.service"));

	@Before
	public void setUp() {
		_persistence = job_registerUtil.getPersistence();

		Class<?> clazz = _persistence.getClass();

		_dynamicQueryClassLoader = clazz.getClassLoader();
	}

	@After
	public void tearDown() throws Exception {
		Iterator<job_register> iterator = _job_registers.iterator();

		while (iterator.hasNext()) {
			_persistence.remove(iterator.next());

			iterator.remove();
		}
	}

	@Test
	public void testCreate() throws Exception {
		String pk = RandomTestUtil.randomString();

		job_register job_register = _persistence.create(pk);

		Assert.assertNotNull(job_register);

		Assert.assertEquals(job_register.getPrimaryKey(), pk);
	}

	@Test
	public void testRemove() throws Exception {
		job_register newjob_register = addjob_register();

		_persistence.remove(newjob_register);

		job_register existingjob_register = _persistence.fetchByPrimaryKey(
			newjob_register.getPrimaryKey());

		Assert.assertNull(existingjob_register);
	}

	@Test
	public void testUpdateNew() throws Exception {
		addjob_register();
	}

	@Test
	public void testUpdateExisting() throws Exception {
		String pk = RandomTestUtil.randomString();

		job_register newjob_register = _persistence.create(pk);

		newjob_register.setArchive(RandomTestUtil.randomBoolean());

		_job_registers.add(_persistence.update(newjob_register));

		job_register existingjob_register = _persistence.findByPrimaryKey(
			newjob_register.getPrimaryKey());

		Assert.assertEquals(
			existingjob_register.getPosition(), newjob_register.getPosition());
		Assert.assertEquals(
			existingjob_register.isArchive(), newjob_register.isArchive());
	}

	@Test
	public void testFindByPrimaryKeyExisting() throws Exception {
		job_register newjob_register = addjob_register();

		job_register existingjob_register = _persistence.findByPrimaryKey(
			newjob_register.getPrimaryKey());

		Assert.assertEquals(existingjob_register, newjob_register);
	}

	@Test(expected = NoSuchjob_registerException.class)
	public void testFindByPrimaryKeyMissing() throws Exception {
		String pk = RandomTestUtil.randomString();

		_persistence.findByPrimaryKey(pk);
	}

	@Test
	public void testFindAll() throws Exception {
		_persistence.findAll(
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, getOrderByComparator());
	}

	protected OrderByComparator<job_register> getOrderByComparator() {
		return OrderByComparatorFactoryUtil.create(
			"job_register", "position", true, "archive", true);
	}

	@Test
	public void testFetchByPrimaryKeyExisting() throws Exception {
		job_register newjob_register = addjob_register();

		job_register existingjob_register = _persistence.fetchByPrimaryKey(
			newjob_register.getPrimaryKey());

		Assert.assertEquals(existingjob_register, newjob_register);
	}

	@Test
	public void testFetchByPrimaryKeyMissing() throws Exception {
		String pk = RandomTestUtil.randomString();

		job_register missingjob_register = _persistence.fetchByPrimaryKey(pk);

		Assert.assertNull(missingjob_register);
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereAllPrimaryKeysExist()
		throws Exception {

		job_register newjob_register1 = addjob_register();
		job_register newjob_register2 = addjob_register();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newjob_register1.getPrimaryKey());
		primaryKeys.add(newjob_register2.getPrimaryKey());

		Map<Serializable, job_register> job_registers =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(2, job_registers.size());
		Assert.assertEquals(
			newjob_register1,
			job_registers.get(newjob_register1.getPrimaryKey()));
		Assert.assertEquals(
			newjob_register2,
			job_registers.get(newjob_register2.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereNoPrimaryKeysExist()
		throws Exception {

		String pk1 = RandomTestUtil.randomString();

		String pk2 = RandomTestUtil.randomString();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(pk1);
		primaryKeys.add(pk2);

		Map<Serializable, job_register> job_registers =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(job_registers.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereSomePrimaryKeysExist()
		throws Exception {

		job_register newjob_register = addjob_register();

		String pk = RandomTestUtil.randomString();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newjob_register.getPrimaryKey());
		primaryKeys.add(pk);

		Map<Serializable, job_register> job_registers =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, job_registers.size());
		Assert.assertEquals(
			newjob_register,
			job_registers.get(newjob_register.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithNoPrimaryKeys() throws Exception {
		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		Map<Serializable, job_register> job_registers =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(job_registers.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithOnePrimaryKey() throws Exception {
		job_register newjob_register = addjob_register();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newjob_register.getPrimaryKey());

		Map<Serializable, job_register> job_registers =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, job_registers.size());
		Assert.assertEquals(
			newjob_register,
			job_registers.get(newjob_register.getPrimaryKey()));
	}

	@Test
	public void testDynamicQueryByPrimaryKeyExisting() throws Exception {
		job_register newjob_register = addjob_register();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			job_register.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"position", newjob_register.getPosition()));

		List<job_register> result = _persistence.findWithDynamicQuery(
			dynamicQuery);

		Assert.assertEquals(1, result.size());

		job_register existingjob_register = result.get(0);

		Assert.assertEquals(existingjob_register, newjob_register);
	}

	@Test
	public void testDynamicQueryByPrimaryKeyMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			job_register.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"position", RandomTestUtil.randomString()));

		List<job_register> result = _persistence.findWithDynamicQuery(
			dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testDynamicQueryByProjectionExisting() throws Exception {
		job_register newjob_register = addjob_register();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			job_register.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(ProjectionFactoryUtil.property("position"));

		Object newPosition = newjob_register.getPosition();

		dynamicQuery.add(
			RestrictionsFactoryUtil.in("position", new Object[] {newPosition}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Object existingPosition = result.get(0);

		Assert.assertEquals(existingPosition, newPosition);
	}

	@Test
	public void testDynamicQueryByProjectionMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			job_register.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(ProjectionFactoryUtil.property("position"));

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"position", new Object[] {RandomTestUtil.randomString()}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	protected job_register addjob_register() throws Exception {
		String pk = RandomTestUtil.randomString();

		job_register job_register = _persistence.create(pk);

		job_register.setArchive(RandomTestUtil.randomBoolean());

		_job_registers.add(_persistence.update(job_register));

		return job_register;
	}

	private List<job_register> _job_registers = new ArrayList<job_register>();
	private job_registerPersistence _persistence;
	private ClassLoader _dynamicQueryClassLoader;

}