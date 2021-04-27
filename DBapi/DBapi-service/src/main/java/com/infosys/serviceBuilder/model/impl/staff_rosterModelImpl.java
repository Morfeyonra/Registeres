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

import com.infosys.serviceBuilder.model.staff_roster;
import com.infosys.serviceBuilder.model.staff_rosterModel;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.util.ProxyUtil;

import java.io.Serializable;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;

import java.sql.Types;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * The base model implementation for the staff_roster service. Represents a row in the &quot;staff_roster&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>staff_rosterModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link staff_rosterImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see staff_rosterImpl
 * @generated
 */
public class staff_rosterModelImpl
	extends BaseModelImpl<staff_roster> implements staff_rosterModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a staff_roster model instance should use the <code>staff_roster</code> interface instead.
	 */
	public static final String TABLE_NAME = "staff_roster";

	public static final Object[][] TABLE_COLUMNS = {
		{"worker_id", Types.INTEGER}, {"last_name", Types.VARCHAR},
		{"first_name", Types.VARCHAR}, {"middle_name", Types.VARCHAR},
		{"birth_date", Types.TIMESTAMP}, {"position", Types.VARCHAR},
		{"employment_date", Types.TIMESTAMP}, {"salary", Types.INTEGER},
		{"work_phone_num", Types.VARCHAR}, {"mobile_phone_num", Types.VARCHAR},
		{"bank", Types.VARCHAR}, {"archive", Types.BOOLEAN}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("worker_id", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("last_name", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("first_name", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("middle_name", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("birth_date", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("position", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("employment_date", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("salary", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("work_phone_num", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("mobile_phone_num", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("bank", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("archive", Types.BOOLEAN);
	}

	public static final String TABLE_SQL_CREATE =
		"create table staff_roster (worker_id INTEGER not null primary key,last_name VARCHAR(75) null,first_name VARCHAR(75) null,middle_name VARCHAR(75) null,birth_date DATE null,position VARCHAR(75) null,employment_date DATE null,salary INTEGER,work_phone_num VARCHAR(75) null,mobile_phone_num VARCHAR(75) null,bank VARCHAR(75) null,archive BOOLEAN)";

	public static final String TABLE_SQL_DROP = "drop table staff_roster";

	public static final String ORDER_BY_JPQL =
		" ORDER BY staff_roster.worker_id ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY staff_roster.worker_id ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *		#getColumnBitmask(String)
	 */
	@Deprecated
	public static final long WORKER_ID_COLUMN_BITMASK = 1L;

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static void setEntityCacheEnabled(boolean entityCacheEnabled) {
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static void setFinderCacheEnabled(boolean finderCacheEnabled) {
	}

	public staff_rosterModelImpl() {
	}

	@Override
	public int getPrimaryKey() {
		return _worker_id;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setWorker_id(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _worker_id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Class<?> getModelClass() {
		return staff_roster.class;
	}

	@Override
	public String getModelClassName() {
		return staff_roster.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<staff_roster, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<staff_roster, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<staff_roster, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((staff_roster)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<staff_roster, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<staff_roster, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(staff_roster)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<staff_roster, Object>>
		getAttributeGetterFunctions() {

		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<staff_roster, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static Function<InvocationHandler, staff_roster>
		_getProxyProviderFunction() {

		Class<?> proxyClass = ProxyUtil.getProxyClass(
			staff_roster.class.getClassLoader(), staff_roster.class,
			ModelWrapper.class);

		try {
			Constructor<staff_roster> constructor =
				(Constructor<staff_roster>)proxyClass.getConstructor(
					InvocationHandler.class);

			return invocationHandler -> {
				try {
					return constructor.newInstance(invocationHandler);
				}
				catch (ReflectiveOperationException
							reflectiveOperationException) {

					throw new InternalError(reflectiveOperationException);
				}
			};
		}
		catch (NoSuchMethodException noSuchMethodException) {
			throw new InternalError(noSuchMethodException);
		}
	}

	private static final Map<String, Function<staff_roster, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<staff_roster, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<staff_roster, Object>> attributeGetterFunctions =
			new LinkedHashMap<String, Function<staff_roster, Object>>();
		Map<String, BiConsumer<staff_roster, ?>> attributeSetterBiConsumers =
			new LinkedHashMap<String, BiConsumer<staff_roster, ?>>();

		attributeGetterFunctions.put("worker_id", staff_roster::getWorker_id);
		attributeSetterBiConsumers.put(
			"worker_id",
			(BiConsumer<staff_roster, Integer>)staff_roster::setWorker_id);
		attributeGetterFunctions.put("last_name", staff_roster::getLast_name);
		attributeSetterBiConsumers.put(
			"last_name",
			(BiConsumer<staff_roster, String>)staff_roster::setLast_name);
		attributeGetterFunctions.put("first_name", staff_roster::getFirst_name);
		attributeSetterBiConsumers.put(
			"first_name",
			(BiConsumer<staff_roster, String>)staff_roster::setFirst_name);
		attributeGetterFunctions.put(
			"middle_name", staff_roster::getMiddle_name);
		attributeSetterBiConsumers.put(
			"middle_name",
			(BiConsumer<staff_roster, String>)staff_roster::setMiddle_name);
		attributeGetterFunctions.put("birth_date", staff_roster::getBirth_date);
		attributeSetterBiConsumers.put(
			"birth_date",
			(BiConsumer<staff_roster, Date>)staff_roster::setBirth_date);
		attributeGetterFunctions.put("position", staff_roster::getPosition);
		attributeSetterBiConsumers.put(
			"position",
			(BiConsumer<staff_roster, String>)staff_roster::setPosition);
		attributeGetterFunctions.put(
			"employment_date", staff_roster::getEmployment_date);
		attributeSetterBiConsumers.put(
			"employment_date",
			(BiConsumer<staff_roster, Date>)staff_roster::setEmployment_date);
		attributeGetterFunctions.put("salary", staff_roster::getSalary);
		attributeSetterBiConsumers.put(
			"salary",
			(BiConsumer<staff_roster, Integer>)staff_roster::setSalary);
		attributeGetterFunctions.put(
			"work_phone_num", staff_roster::getWork_phone_num);
		attributeSetterBiConsumers.put(
			"work_phone_num",
			(BiConsumer<staff_roster, String>)staff_roster::setWork_phone_num);
		attributeGetterFunctions.put(
			"mobile_phone_num", staff_roster::getMobile_phone_num);
		attributeSetterBiConsumers.put(
			"mobile_phone_num",
			(BiConsumer<staff_roster, String>)
				staff_roster::setMobile_phone_num);
		attributeGetterFunctions.put("bank", staff_roster::getBank);
		attributeSetterBiConsumers.put(
			"bank", (BiConsumer<staff_roster, String>)staff_roster::setBank);
		attributeGetterFunctions.put("archive", staff_roster::getArchive);
		attributeSetterBiConsumers.put(
			"archive",
			(BiConsumer<staff_roster, Boolean>)staff_roster::setArchive);

		_attributeGetterFunctions = Collections.unmodifiableMap(
			attributeGetterFunctions);
		_attributeSetterBiConsumers = Collections.unmodifiableMap(
			(Map)attributeSetterBiConsumers);
	}

	@Override
	public int getWorker_id() {
		return _worker_id;
	}

	@Override
	public void setWorker_id(int worker_id) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_worker_id = worker_id;
	}

	@Override
	public String getLast_name() {
		if (_last_name == null) {
			return "";
		}
		else {
			return _last_name;
		}
	}

	@Override
	public void setLast_name(String last_name) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_last_name = last_name;
	}

	@Override
	public String getFirst_name() {
		if (_first_name == null) {
			return "";
		}
		else {
			return _first_name;
		}
	}

	@Override
	public void setFirst_name(String first_name) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_first_name = first_name;
	}

	@Override
	public String getMiddle_name() {
		if (_middle_name == null) {
			return "";
		}
		else {
			return _middle_name;
		}
	}

	@Override
	public void setMiddle_name(String middle_name) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_middle_name = middle_name;
	}

	@Override
	public Date getBirth_date() {
		return _birth_date;
	}

	@Override
	public void setBirth_date(Date birth_date) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_birth_date = birth_date;
	}

	@Override
	public String getPosition() {
		if (_position == null) {
			return "";
		}
		else {
			return _position;
		}
	}

	@Override
	public void setPosition(String position) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_position = position;
	}

	@Override
	public Date getEmployment_date() {
		return _employment_date;
	}

	@Override
	public void setEmployment_date(Date employment_date) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_employment_date = employment_date;
	}

	@Override
	public int getSalary() {
		return _salary;
	}

	@Override
	public void setSalary(int salary) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_salary = salary;
	}

	@Override
	public String getWork_phone_num() {
		if (_work_phone_num == null) {
			return "";
		}
		else {
			return _work_phone_num;
		}
	}

	@Override
	public void setWork_phone_num(String work_phone_num) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_work_phone_num = work_phone_num;
	}

	@Override
	public String getMobile_phone_num() {
		if (_mobile_phone_num == null) {
			return "";
		}
		else {
			return _mobile_phone_num;
		}
	}

	@Override
	public void setMobile_phone_num(String mobile_phone_num) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_mobile_phone_num = mobile_phone_num;
	}

	@Override
	public String getBank() {
		if (_bank == null) {
			return "";
		}
		else {
			return _bank;
		}
	}

	@Override
	public void setBank(String bank) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_bank = bank;
	}

	@Override
	public boolean getArchive() {
		return _archive;
	}

	@Override
	public boolean isArchive() {
		return _archive;
	}

	@Override
	public void setArchive(boolean archive) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_archive = archive;
	}

	public long getColumnBitmask() {
		if (_columnBitmask > 0) {
			return _columnBitmask;
		}

		if ((_columnOriginalValues == null) ||
			(_columnOriginalValues == Collections.EMPTY_MAP)) {

			return 0;
		}

		for (Map.Entry<String, Object> entry :
				_columnOriginalValues.entrySet()) {

			if (entry.getValue() != getColumnValue(entry.getKey())) {
				_columnBitmask |= _columnBitmasks.get(entry.getKey());
			}
		}

		return _columnBitmask;
	}

	@Override
	public staff_roster toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, staff_roster>
				escapedModelProxyProviderFunction =
					EscapedModelProxyProviderFunctionHolder.
						_escapedModelProxyProviderFunction;

			_escapedModel = escapedModelProxyProviderFunction.apply(
				new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		staff_rosterImpl staff_rosterImpl = new staff_rosterImpl();

		staff_rosterImpl.setWorker_id(getWorker_id());
		staff_rosterImpl.setLast_name(getLast_name());
		staff_rosterImpl.setFirst_name(getFirst_name());
		staff_rosterImpl.setMiddle_name(getMiddle_name());
		staff_rosterImpl.setBirth_date(getBirth_date());
		staff_rosterImpl.setPosition(getPosition());
		staff_rosterImpl.setEmployment_date(getEmployment_date());
		staff_rosterImpl.setSalary(getSalary());
		staff_rosterImpl.setWork_phone_num(getWork_phone_num());
		staff_rosterImpl.setMobile_phone_num(getMobile_phone_num());
		staff_rosterImpl.setBank(getBank());
		staff_rosterImpl.setArchive(isArchive());

		staff_rosterImpl.resetOriginalValues();

		return staff_rosterImpl;
	}

	@Override
	public int compareTo(staff_roster staff_roster) {
		int primaryKey = staff_roster.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof staff_roster)) {
			return false;
		}

		staff_roster staff_roster = (staff_roster)object;

		int primaryKey = staff_roster.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey();
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	@Override
	public boolean isEntityCacheEnabled() {
		return true;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	@Override
	public boolean isFinderCacheEnabled() {
		return true;
	}

	@Override
	public void resetOriginalValues() {
		_columnOriginalValues = Collections.emptyMap();

		_columnBitmask = 0;
	}

	@Override
	public CacheModel<staff_roster> toCacheModel() {
		staff_rosterCacheModel staff_rosterCacheModel =
			new staff_rosterCacheModel();

		staff_rosterCacheModel.worker_id = getWorker_id();

		staff_rosterCacheModel.last_name = getLast_name();

		String last_name = staff_rosterCacheModel.last_name;

		if ((last_name != null) && (last_name.length() == 0)) {
			staff_rosterCacheModel.last_name = null;
		}

		staff_rosterCacheModel.first_name = getFirst_name();

		String first_name = staff_rosterCacheModel.first_name;

		if ((first_name != null) && (first_name.length() == 0)) {
			staff_rosterCacheModel.first_name = null;
		}

		staff_rosterCacheModel.middle_name = getMiddle_name();

		String middle_name = staff_rosterCacheModel.middle_name;

		if ((middle_name != null) && (middle_name.length() == 0)) {
			staff_rosterCacheModel.middle_name = null;
		}

		Date birth_date = getBirth_date();

		if (birth_date != null) {
			staff_rosterCacheModel.birth_date = birth_date.getTime();
		}
		else {
			staff_rosterCacheModel.birth_date = Long.MIN_VALUE;
		}

		staff_rosterCacheModel.position = getPosition();

		String position = staff_rosterCacheModel.position;

		if ((position != null) && (position.length() == 0)) {
			staff_rosterCacheModel.position = null;
		}

		Date employment_date = getEmployment_date();

		if (employment_date != null) {
			staff_rosterCacheModel.employment_date = employment_date.getTime();
		}
		else {
			staff_rosterCacheModel.employment_date = Long.MIN_VALUE;
		}

		staff_rosterCacheModel.salary = getSalary();

		staff_rosterCacheModel.work_phone_num = getWork_phone_num();

		String work_phone_num = staff_rosterCacheModel.work_phone_num;

		if ((work_phone_num != null) && (work_phone_num.length() == 0)) {
			staff_rosterCacheModel.work_phone_num = null;
		}

		staff_rosterCacheModel.mobile_phone_num = getMobile_phone_num();

		String mobile_phone_num = staff_rosterCacheModel.mobile_phone_num;

		if ((mobile_phone_num != null) && (mobile_phone_num.length() == 0)) {
			staff_rosterCacheModel.mobile_phone_num = null;
		}

		staff_rosterCacheModel.bank = getBank();

		String bank = staff_rosterCacheModel.bank;

		if ((bank != null) && (bank.length() == 0)) {
			staff_rosterCacheModel.bank = null;
		}

		staff_rosterCacheModel.archive = isArchive();

		return staff_rosterCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<staff_roster, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(4 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<staff_roster, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<staff_roster, Object> attributeGetterFunction =
				entry.getValue();

			sb.append(attributeName);
			sb.append("=");
			sb.append(attributeGetterFunction.apply((staff_roster)this));
			sb.append(", ");
		}

		if (sb.index() > 1) {
			sb.setIndex(sb.index() - 1);
		}

		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		Map<String, Function<staff_roster, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry<String, Function<staff_roster, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<staff_roster, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(attributeGetterFunction.apply((staff_roster)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function<InvocationHandler, staff_roster>
			_escapedModelProxyProviderFunction = _getProxyProviderFunction();

	}

	private int _worker_id;
	private String _last_name;
	private String _first_name;
	private String _middle_name;
	private Date _birth_date;
	private String _position;
	private Date _employment_date;
	private int _salary;
	private String _work_phone_num;
	private String _mobile_phone_num;
	private String _bank;
	private boolean _archive;

	public <T> T getColumnValue(String columnName) {
		Function<staff_roster, Object> function = _attributeGetterFunctions.get(
			columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((staff_roster)this);
	}

	public <T> T getColumnOriginalValue(String columnName) {
		if (_columnOriginalValues == null) {
			return null;
		}

		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		return (T)_columnOriginalValues.get(columnName);
	}

	private void _setColumnOriginalValues() {
		_columnOriginalValues = new HashMap<String, Object>();

		_columnOriginalValues.put("worker_id", _worker_id);
		_columnOriginalValues.put("last_name", _last_name);
		_columnOriginalValues.put("first_name", _first_name);
		_columnOriginalValues.put("middle_name", _middle_name);
		_columnOriginalValues.put("birth_date", _birth_date);
		_columnOriginalValues.put("position", _position);
		_columnOriginalValues.put("employment_date", _employment_date);
		_columnOriginalValues.put("salary", _salary);
		_columnOriginalValues.put("work_phone_num", _work_phone_num);
		_columnOriginalValues.put("mobile_phone_num", _mobile_phone_num);
		_columnOriginalValues.put("bank", _bank);
		_columnOriginalValues.put("archive", _archive);
	}

	private transient Map<String, Object> _columnOriginalValues;

	public static long getColumnBitmask(String columnName) {
		return _columnBitmasks.get(columnName);
	}

	private static final Map<String, Long> _columnBitmasks;

	static {
		Map<String, Long> columnBitmasks = new HashMap<>();

		columnBitmasks.put("worker_id", 1L);

		columnBitmasks.put("last_name", 2L);

		columnBitmasks.put("first_name", 4L);

		columnBitmasks.put("middle_name", 8L);

		columnBitmasks.put("birth_date", 16L);

		columnBitmasks.put("position", 32L);

		columnBitmasks.put("employment_date", 64L);

		columnBitmasks.put("salary", 128L);

		columnBitmasks.put("work_phone_num", 256L);

		columnBitmasks.put("mobile_phone_num", 512L);

		columnBitmasks.put("bank", 1024L);

		columnBitmasks.put("archive", 2048L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private staff_roster _escapedModel;

}