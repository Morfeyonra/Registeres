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

import com.infosys.serviceBuilder.exception.NoSuchstaff_rosterException;
import com.infosys.serviceBuilder.model.staff_roster;
import com.infosys.serviceBuilder.service.persistence.staff_rosterPersistence;
import com.infosys.serviceBuilder.service.persistence.staff_rosterUtil;
import com.infosys.serviceBuilder.service.staff_rosterLocalServiceUtil;

import com.liferay.arquillian.extension.junit.bridge.junit.Arquillian;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ProjectionFactoryUtil;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.test.rule.AggregateTestRule;
import com.liferay.portal.kernel.test.util.RandomTestUtil;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.util.IntegerWrapper;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.OrderByComparatorFactoryUtil;
import com.liferay.portal.kernel.util.Time;
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
public class staff_rosterPersistenceTest {

	@ClassRule
	@Rule
	public static final AggregateTestRule aggregateTestRule =
		new AggregateTestRule(
			new LiferayIntegrationTestRule(), PersistenceTestRule.INSTANCE,
			new TransactionalTestRule(
				Propagation.REQUIRED, "com.infosys.serviceBuilder.service"));

	@Before
	public void setUp() {
		_persistence = staff_rosterUtil.getPersistence();

		Class<?> clazz = _persistence.getClass();

		_dynamicQueryClassLoader = clazz.getClassLoader();
	}

	@After
	public void tearDown() throws Exception {
		Iterator<staff_roster> iterator = _staff_rosters.iterator();

		while (iterator.hasNext()) {
			_persistence.remove(iterator.next());

			iterator.remove();
		}
	}

	@Test
	public void testCreate() throws Exception {
		int pk = RandomTestUtil.nextInt();

		staff_roster staff_roster = _persistence.create(pk);

		Assert.assertNotNull(staff_roster);

		Assert.assertEquals(staff_roster.getPrimaryKey(), pk);
	}

	@Test
	public void testRemove() throws Exception {
		staff_roster newstaff_roster = addstaff_roster();

		_persistence.remove(newstaff_roster);

		staff_roster existingstaff_roster = _persistence.fetchByPrimaryKey(
			newstaff_roster.getPrimaryKey());

		Assert.assertNull(existingstaff_roster);
	}

	@Test
	public void testUpdateNew() throws Exception {
		addstaff_roster();
	}

	@Test
	public void testUpdateExisting() throws Exception {
		int pk = RandomTestUtil.nextInt();

		staff_roster newstaff_roster = _persistence.create(pk);

		newstaff_roster.setLast_name(RandomTestUtil.randomString());

		newstaff_roster.setFirst_name(RandomTestUtil.randomString());

		newstaff_roster.setMiddle_name(RandomTestUtil.randomString());

		newstaff_roster.setBirth_date(RandomTestUtil.nextDate());

		newstaff_roster.setPosition(RandomTestUtil.randomString());

		newstaff_roster.setEmployment_date(RandomTestUtil.nextDate());

		newstaff_roster.setSalary(RandomTestUtil.nextInt());

		newstaff_roster.setWork_phone_num(RandomTestUtil.randomString());

		newstaff_roster.setMobile_phone_num(RandomTestUtil.randomString());

		newstaff_roster.setBank(RandomTestUtil.randomString());

		newstaff_roster.setArchive(RandomTestUtil.randomBoolean());

		_staff_rosters.add(_persistence.update(newstaff_roster));

		staff_roster existingstaff_roster = _persistence.findByPrimaryKey(
			newstaff_roster.getPrimaryKey());

		Assert.assertEquals(
			existingstaff_roster.getWorker_id(),
			newstaff_roster.getWorker_id());
		Assert.assertEquals(
			existingstaff_roster.getLast_name(),
			newstaff_roster.getLast_name());
		Assert.assertEquals(
			existingstaff_roster.getFirst_name(),
			newstaff_roster.getFirst_name());
		Assert.assertEquals(
			existingstaff_roster.getMiddle_name(),
			newstaff_roster.getMiddle_name());
		Assert.assertEquals(
			Time.getShortTimestamp(existingstaff_roster.getBirth_date()),
			Time.getShortTimestamp(newstaff_roster.getBirth_date()));
		Assert.assertEquals(
			existingstaff_roster.getPosition(), newstaff_roster.getPosition());
		Assert.assertEquals(
			Time.getShortTimestamp(existingstaff_roster.getEmployment_date()),
			Time.getShortTimestamp(newstaff_roster.getEmployment_date()));
		Assert.assertEquals(
			existingstaff_roster.getSalary(), newstaff_roster.getSalary());
		Assert.assertEquals(
			existingstaff_roster.getWork_phone_num(),
			newstaff_roster.getWork_phone_num());
		Assert.assertEquals(
			existingstaff_roster.getMobile_phone_num(),
			newstaff_roster.getMobile_phone_num());
		Assert.assertEquals(
			existingstaff_roster.getBank(), newstaff_roster.getBank());
		Assert.assertEquals(
			existingstaff_roster.isArchive(), newstaff_roster.isArchive());
	}

	@Test
	public void testFindByPrimaryKeyExisting() throws Exception {
		staff_roster newstaff_roster = addstaff_roster();

		staff_roster existingstaff_roster = _persistence.findByPrimaryKey(
			newstaff_roster.getPrimaryKey());

		Assert.assertEquals(existingstaff_roster, newstaff_roster);
	}

	@Test(expected = NoSuchstaff_rosterException.class)
	public void testFindByPrimaryKeyMissing() throws Exception {
		int pk = RandomTestUtil.nextInt();

		_persistence.findByPrimaryKey(pk);
	}

	@Test
	public void testFindAll() throws Exception {
		_persistence.findAll(
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, getOrderByComparator());
	}

	protected OrderByComparator<staff_roster> getOrderByComparator() {
		return OrderByComparatorFactoryUtil.create(
			"staff_roster", "worker_id", true, "last_name", true, "first_name",
			true, "middle_name", true, "birth_date", true, "position", true,
			"employment_date", true, "salary", true, "work_phone_num", true,
			"mobile_phone_num", true, "bank", true, "archive", true);
	}

	@Test
	public void testFetchByPrimaryKeyExisting() throws Exception {
		staff_roster newstaff_roster = addstaff_roster();

		staff_roster existingstaff_roster = _persistence.fetchByPrimaryKey(
			newstaff_roster.getPrimaryKey());

		Assert.assertEquals(existingstaff_roster, newstaff_roster);
	}

	@Test
	public void testFetchByPrimaryKeyMissing() throws Exception {
		int pk = RandomTestUtil.nextInt();

		staff_roster missingstaff_roster = _persistence.fetchByPrimaryKey(pk);

		Assert.assertNull(missingstaff_roster);
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereAllPrimaryKeysExist()
		throws Exception {

		staff_roster newstaff_roster1 = addstaff_roster();
		staff_roster newstaff_roster2 = addstaff_roster();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newstaff_roster1.getPrimaryKey());
		primaryKeys.add(newstaff_roster2.getPrimaryKey());

		Map<Serializable, staff_roster> staff_rosters =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(2, staff_rosters.size());
		Assert.assertEquals(
			newstaff_roster1,
			staff_rosters.get(newstaff_roster1.getPrimaryKey()));
		Assert.assertEquals(
			newstaff_roster2,
			staff_rosters.get(newstaff_roster2.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereNoPrimaryKeysExist()
		throws Exception {

		int pk1 = RandomTestUtil.nextInt();

		int pk2 = RandomTestUtil.nextInt();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(pk1);
		primaryKeys.add(pk2);

		Map<Serializable, staff_roster> staff_rosters =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(staff_rosters.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereSomePrimaryKeysExist()
		throws Exception {

		staff_roster newstaff_roster = addstaff_roster();

		int pk = RandomTestUtil.nextInt();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newstaff_roster.getPrimaryKey());
		primaryKeys.add(pk);

		Map<Serializable, staff_roster> staff_rosters =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, staff_rosters.size());
		Assert.assertEquals(
			newstaff_roster,
			staff_rosters.get(newstaff_roster.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithNoPrimaryKeys() throws Exception {
		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		Map<Serializable, staff_roster> staff_rosters =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(staff_rosters.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithOnePrimaryKey() throws Exception {
		staff_roster newstaff_roster = addstaff_roster();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newstaff_roster.getPrimaryKey());

		Map<Serializable, staff_roster> staff_rosters =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, staff_rosters.size());
		Assert.assertEquals(
			newstaff_roster,
			staff_rosters.get(newstaff_roster.getPrimaryKey()));
	}

	@Test
	public void testActionableDynamicQuery() throws Exception {
		final IntegerWrapper count = new IntegerWrapper();

		ActionableDynamicQuery actionableDynamicQuery =
			staff_rosterLocalServiceUtil.getActionableDynamicQuery();

		actionableDynamicQuery.setPerformActionMethod(
			new ActionableDynamicQuery.PerformActionMethod<staff_roster>() {

				@Override
				public void performAction(staff_roster staff_roster) {
					Assert.assertNotNull(staff_roster);

					count.increment();
				}

			});

		actionableDynamicQuery.performActions();

		Assert.assertEquals(count.getValue(), _persistence.countAll());
	}

	@Test
	public void testDynamicQueryByPrimaryKeyExisting() throws Exception {
		staff_roster newstaff_roster = addstaff_roster();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			staff_roster.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"worker_id", newstaff_roster.getWorker_id()));

		List<staff_roster> result = _persistence.findWithDynamicQuery(
			dynamicQuery);

		Assert.assertEquals(1, result.size());

		staff_roster existingstaff_roster = result.get(0);

		Assert.assertEquals(existingstaff_roster, newstaff_roster);
	}

	@Test
	public void testDynamicQueryByPrimaryKeyMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			staff_roster.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq("worker_id", RandomTestUtil.nextInt()));

		List<staff_roster> result = _persistence.findWithDynamicQuery(
			dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testDynamicQueryByProjectionExisting() throws Exception {
		staff_roster newstaff_roster = addstaff_roster();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			staff_roster.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(ProjectionFactoryUtil.property("worker_id"));

		Object newWorker_id = newstaff_roster.getWorker_id();

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"worker_id", new Object[] {newWorker_id}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Object existingWorker_id = result.get(0);

		Assert.assertEquals(existingWorker_id, newWorker_id);
	}

	@Test
	public void testDynamicQueryByProjectionMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			staff_roster.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(ProjectionFactoryUtil.property("worker_id"));

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"worker_id", new Object[] {RandomTestUtil.nextInt()}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	protected staff_roster addstaff_roster() throws Exception {
		int pk = RandomTestUtil.nextInt();

		staff_roster staff_roster = _persistence.create(pk);

		staff_roster.setLast_name(RandomTestUtil.randomString());

		staff_roster.setFirst_name(RandomTestUtil.randomString());

		staff_roster.setMiddle_name(RandomTestUtil.randomString());

		staff_roster.setBirth_date(RandomTestUtil.nextDate());

		staff_roster.setPosition(RandomTestUtil.randomString());

		staff_roster.setEmployment_date(RandomTestUtil.nextDate());

		staff_roster.setSalary(RandomTestUtil.nextInt());

		staff_roster.setWork_phone_num(RandomTestUtil.randomString());

		staff_roster.setMobile_phone_num(RandomTestUtil.randomString());

		staff_roster.setBank(RandomTestUtil.randomString());

		staff_roster.setArchive(RandomTestUtil.randomBoolean());

		_staff_rosters.add(_persistence.update(staff_roster));

		return staff_roster;
	}

	private List<staff_roster> _staff_rosters = new ArrayList<staff_roster>();
	private staff_rosterPersistence _persistence;
	private ClassLoader _dynamicQueryClassLoader;

}