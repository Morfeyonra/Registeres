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

import com.infosys.serviceBuilder.exception.NoSuchbanksException;
import com.infosys.serviceBuilder.model.banks;
import com.infosys.serviceBuilder.service.persistence.banksPK;
import com.infosys.serviceBuilder.service.persistence.banksPersistence;
import com.infosys.serviceBuilder.service.persistence.banksUtil;

import com.liferay.arquillian.extension.junit.bridge.junit.Arquillian;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ProjectionFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.test.rule.AggregateTestRule;
import com.liferay.portal.kernel.test.util.RandomTestUtil;
import com.liferay.portal.kernel.transaction.Propagation;
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
public class banksPersistenceTest {

	@ClassRule
	@Rule
	public static final AggregateTestRule aggregateTestRule =
		new AggregateTestRule(
			new LiferayIntegrationTestRule(), PersistenceTestRule.INSTANCE,
			new TransactionalTestRule(
				Propagation.REQUIRED, "com.infosys.serviceBuilder.service"));

	@Before
	public void setUp() {
		_persistence = banksUtil.getPersistence();

		Class<?> clazz = _persistence.getClass();

		_dynamicQueryClassLoader = clazz.getClassLoader();
	}

	@After
	public void tearDown() throws Exception {
		Iterator<banks> iterator = _bankses.iterator();

		while (iterator.hasNext()) {
			_persistence.remove(iterator.next());

			iterator.remove();
		}
	}

	@Test
	public void testCreate() throws Exception {
		banksPK pk = new banksPK(
			RandomTestUtil.randomString(), RandomTestUtil.randomString());

		banks banks = _persistence.create(pk);

		Assert.assertNotNull(banks);

		Assert.assertEquals(banks.getPrimaryKey(), pk);
	}

	@Test
	public void testRemove() throws Exception {
		banks newbanks = addbanks();

		_persistence.remove(newbanks);

		banks existingbanks = _persistence.fetchByPrimaryKey(
			newbanks.getPrimaryKey());

		Assert.assertNull(existingbanks);
	}

	@Test
	public void testUpdateNew() throws Exception {
		addbanks();
	}

	@Test
	public void testUpdateExisting() throws Exception {
		banksPK pk = new banksPK(
			RandomTestUtil.randomString(), RandomTestUtil.randomString());

		banks newbanks = _persistence.create(pk);

		newbanks.setUuid(RandomTestUtil.randomString());

		newbanks.setAddress(RandomTestUtil.randomString());

		_bankses.add(_persistence.update(newbanks));

		banks existingbanks = _persistence.findByPrimaryKey(
			newbanks.getPrimaryKey());

		Assert.assertEquals(existingbanks.getUuid(), newbanks.getUuid());
		Assert.assertEquals(
			existingbanks.getBank_name(), newbanks.getBank_name());
		Assert.assertEquals(existingbanks.getBik(), newbanks.getBik());
		Assert.assertEquals(existingbanks.getAddress(), newbanks.getAddress());
	}

	@Test
	public void testCountByUuid() throws Exception {
		_persistence.countByUuid("");

		_persistence.countByUuid("null");

		_persistence.countByUuid((String)null);
	}

	@Test
	public void testFindByPrimaryKeyExisting() throws Exception {
		banks newbanks = addbanks();

		banks existingbanks = _persistence.findByPrimaryKey(
			newbanks.getPrimaryKey());

		Assert.assertEquals(existingbanks, newbanks);
	}

	@Test(expected = NoSuchbanksException.class)
	public void testFindByPrimaryKeyMissing() throws Exception {
		banksPK pk = new banksPK(
			RandomTestUtil.randomString(), RandomTestUtil.randomString());

		_persistence.findByPrimaryKey(pk);
	}

	@Test
	public void testFetchByPrimaryKeyExisting() throws Exception {
		banks newbanks = addbanks();

		banks existingbanks = _persistence.fetchByPrimaryKey(
			newbanks.getPrimaryKey());

		Assert.assertEquals(existingbanks, newbanks);
	}

	@Test
	public void testFetchByPrimaryKeyMissing() throws Exception {
		banksPK pk = new banksPK(
			RandomTestUtil.randomString(), RandomTestUtil.randomString());

		banks missingbanks = _persistence.fetchByPrimaryKey(pk);

		Assert.assertNull(missingbanks);
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereAllPrimaryKeysExist()
		throws Exception {

		banks newbanks1 = addbanks();
		banks newbanks2 = addbanks();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newbanks1.getPrimaryKey());
		primaryKeys.add(newbanks2.getPrimaryKey());

		Map<Serializable, banks> bankses = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertEquals(2, bankses.size());
		Assert.assertEquals(newbanks1, bankses.get(newbanks1.getPrimaryKey()));
		Assert.assertEquals(newbanks2, bankses.get(newbanks2.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereNoPrimaryKeysExist()
		throws Exception {

		banksPK pk1 = new banksPK(
			RandomTestUtil.randomString(), RandomTestUtil.randomString());

		banksPK pk2 = new banksPK(
			RandomTestUtil.randomString(), RandomTestUtil.randomString());

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(pk1);
		primaryKeys.add(pk2);

		Map<Serializable, banks> bankses = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertTrue(bankses.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereSomePrimaryKeysExist()
		throws Exception {

		banks newbanks = addbanks();

		banksPK pk = new banksPK(
			RandomTestUtil.randomString(), RandomTestUtil.randomString());

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newbanks.getPrimaryKey());
		primaryKeys.add(pk);

		Map<Serializable, banks> bankses = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertEquals(1, bankses.size());
		Assert.assertEquals(newbanks, bankses.get(newbanks.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithNoPrimaryKeys() throws Exception {
		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		Map<Serializable, banks> bankses = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertTrue(bankses.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithOnePrimaryKey() throws Exception {
		banks newbanks = addbanks();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newbanks.getPrimaryKey());

		Map<Serializable, banks> bankses = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertEquals(1, bankses.size());
		Assert.assertEquals(newbanks, bankses.get(newbanks.getPrimaryKey()));
	}

	@Test
	public void testDynamicQueryByPrimaryKeyExisting() throws Exception {
		banks newbanks = addbanks();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			banks.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"id.bank_name", newbanks.getBank_name()));
		dynamicQuery.add(
			RestrictionsFactoryUtil.eq("id.bik", newbanks.getBik()));

		List<banks> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		banks existingbanks = result.get(0);

		Assert.assertEquals(existingbanks, newbanks);
	}

	@Test
	public void testDynamicQueryByPrimaryKeyMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			banks.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"id.bank_name", RandomTestUtil.randomString()));
		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"id.bik", RandomTestUtil.randomString()));

		List<banks> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testDynamicQueryByProjectionExisting() throws Exception {
		banks newbanks = addbanks();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			banks.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(
			ProjectionFactoryUtil.property("id.bank_name"));

		Object newBank_name = newbanks.getBank_name();

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"id.bank_name", new Object[] {newBank_name}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Object existingBank_name = result.get(0);

		Assert.assertEquals(existingBank_name, newBank_name);
	}

	@Test
	public void testDynamicQueryByProjectionMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			banks.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(
			ProjectionFactoryUtil.property("id.bank_name"));

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"id.bank_name", new Object[] {RandomTestUtil.randomString()}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	protected banks addbanks() throws Exception {
		banksPK pk = new banksPK(
			RandomTestUtil.randomString(), RandomTestUtil.randomString());

		banks banks = _persistence.create(pk);

		banks.setUuid(RandomTestUtil.randomString());

		banks.setAddress(RandomTestUtil.randomString());

		_bankses.add(_persistence.update(banks));

		return banks;
	}

	private List<banks> _bankses = new ArrayList<banks>();
	private banksPersistence _persistence;
	private ClassLoader _dynamicQueryClassLoader;

}