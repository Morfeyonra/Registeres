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

import com.infosys.serviceBuilder.model.banks;
import com.infosys.serviceBuilder.model.banksModel;
import com.infosys.serviceBuilder.service.persistence.banksPK;

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
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * The base model implementation for the banks service. Represents a row in the &quot;banks&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>banksModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link banksImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see banksImpl
 * @generated
 */
public class banksModelImpl extends BaseModelImpl<banks> implements banksModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a banks model instance should use the <code>banks</code> interface instead.
	 */
	public static final String TABLE_NAME = "banks";

	public static final Object[][] TABLE_COLUMNS = {
		{"uuid_", Types.VARCHAR}, {"bank_name", Types.VARCHAR},
		{"bik", Types.VARCHAR}, {"address", Types.VARCHAR}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("bank_name", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("bik", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("address", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE =
		"create table banks (uuid_ VARCHAR(75) null,bank_name VARCHAR(75) not null,bik VARCHAR(75) not null,address VARCHAR(75) null,primary key (bank_name, bik))";

	public static final String TABLE_SQL_DROP = "drop table banks";

	public static final String ORDER_BY_JPQL =
		" ORDER BY banks.id.bank_name ASC, banks.id.bik ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY banks.bank_name ASC, banks.bik ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)
	 */
	@Deprecated
	public static final long UUID_COLUMN_BITMASK = 1L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *		#getColumnBitmask(String)
	 */
	@Deprecated
	public static final long BANK_NAME_COLUMN_BITMASK = 2L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *		#getColumnBitmask(String)
	 */
	@Deprecated
	public static final long BIK_COLUMN_BITMASK = 4L;

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

	public banksModelImpl() {
	}

	@Override
	public banksPK getPrimaryKey() {
		return new banksPK(_bank_name, _bik);
	}

	@Override
	public void setPrimaryKey(banksPK primaryKey) {
		setBank_name(primaryKey.bank_name);
		setBik(primaryKey.bik);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return new banksPK(_bank_name, _bik);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((banksPK)primaryKeyObj);
	}

	@Override
	public Class<?> getModelClass() {
		return banks.class;
	}

	@Override
	public String getModelClassName() {
		return banks.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<banks, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<banks, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<banks, Object> attributeGetterFunction = entry.getValue();

			attributes.put(
				attributeName, attributeGetterFunction.apply((banks)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<banks, Object>> attributeSetterBiConsumers =
			getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<banks, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept((banks)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<banks, Object>> getAttributeGetterFunctions() {
		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<banks, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static Function<InvocationHandler, banks>
		_getProxyProviderFunction() {

		Class<?> proxyClass = ProxyUtil.getProxyClass(
			banks.class.getClassLoader(), banks.class, ModelWrapper.class);

		try {
			Constructor<banks> constructor =
				(Constructor<banks>)proxyClass.getConstructor(
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

	private static final Map<String, Function<banks, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<banks, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<banks, Object>> attributeGetterFunctions =
			new LinkedHashMap<String, Function<banks, Object>>();
		Map<String, BiConsumer<banks, ?>> attributeSetterBiConsumers =
			new LinkedHashMap<String, BiConsumer<banks, ?>>();

		attributeGetterFunctions.put("uuid", banks::getUuid);
		attributeSetterBiConsumers.put(
			"uuid", (BiConsumer<banks, String>)banks::setUuid);
		attributeGetterFunctions.put("bank_name", banks::getBank_name);
		attributeSetterBiConsumers.put(
			"bank_name", (BiConsumer<banks, String>)banks::setBank_name);
		attributeGetterFunctions.put("bik", banks::getBik);
		attributeSetterBiConsumers.put(
			"bik", (BiConsumer<banks, String>)banks::setBik);
		attributeGetterFunctions.put("address", banks::getAddress);
		attributeSetterBiConsumers.put(
			"address", (BiConsumer<banks, String>)banks::setAddress);

		_attributeGetterFunctions = Collections.unmodifiableMap(
			attributeGetterFunctions);
		_attributeSetterBiConsumers = Collections.unmodifiableMap(
			(Map)attributeSetterBiConsumers);
	}

	@Override
	public String getUuid() {
		if (_uuid == null) {
			return "";
		}
		else {
			return _uuid;
		}
	}

	@Override
	public void setUuid(String uuid) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_uuid = uuid;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public String getOriginalUuid() {
		return getColumnOriginalValue("uuid_");
	}

	@Override
	public String getBank_name() {
		if (_bank_name == null) {
			return "";
		}
		else {
			return _bank_name;
		}
	}

	@Override
	public void setBank_name(String bank_name) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_bank_name = bank_name;
	}

	@Override
	public String getBik() {
		if (_bik == null) {
			return "";
		}
		else {
			return _bik;
		}
	}

	@Override
	public void setBik(String bik) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_bik = bik;
	}

	@Override
	public String getAddress() {
		if (_address == null) {
			return "";
		}
		else {
			return _address;
		}
	}

	@Override
	public void setAddress(String address) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_address = address;
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
	public banks toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, banks>
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
		banksImpl banksImpl = new banksImpl();

		banksImpl.setUuid(getUuid());
		banksImpl.setBank_name(getBank_name());
		banksImpl.setBik(getBik());
		banksImpl.setAddress(getAddress());

		banksImpl.resetOriginalValues();

		return banksImpl;
	}

	@Override
	public int compareTo(banks banks) {
		banksPK primaryKey = banks.getPrimaryKey();

		return getPrimaryKey().compareTo(primaryKey);
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof banks)) {
			return false;
		}

		banks banks = (banks)object;

		banksPK primaryKey = banks.getPrimaryKey();

		if (getPrimaryKey().equals(primaryKey)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey().hashCode();
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
	public CacheModel<banks> toCacheModel() {
		banksCacheModel banksCacheModel = new banksCacheModel();

		banksCacheModel.banksPK = getPrimaryKey();

		banksCacheModel.uuid = getUuid();

		String uuid = banksCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			banksCacheModel.uuid = null;
		}

		banksCacheModel.bank_name = getBank_name();

		String bank_name = banksCacheModel.bank_name;

		if ((bank_name != null) && (bank_name.length() == 0)) {
			banksCacheModel.bank_name = null;
		}

		banksCacheModel.bik = getBik();

		String bik = banksCacheModel.bik;

		if ((bik != null) && (bik.length() == 0)) {
			banksCacheModel.bik = null;
		}

		banksCacheModel.address = getAddress();

		String address = banksCacheModel.address;

		if ((address != null) && (address.length() == 0)) {
			banksCacheModel.address = null;
		}

		return banksCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<banks, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(4 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<banks, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<banks, Object> attributeGetterFunction = entry.getValue();

			sb.append(attributeName);
			sb.append("=");
			sb.append(attributeGetterFunction.apply((banks)this));
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
		Map<String, Function<banks, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry<String, Function<banks, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<banks, Object> attributeGetterFunction = entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(attributeGetterFunction.apply((banks)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function<InvocationHandler, banks>
			_escapedModelProxyProviderFunction = _getProxyProviderFunction();

	}

	private String _uuid;
	private String _bank_name;
	private String _bik;
	private String _address;

	public <T> T getColumnValue(String columnName) {
		columnName = _attributeNames.getOrDefault(columnName, columnName);

		Function<banks, Object> function = _attributeGetterFunctions.get(
			columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((banks)this);
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

		_columnOriginalValues.put("uuid_", _uuid);
		_columnOriginalValues.put("bank_name", _bank_name);
		_columnOriginalValues.put("bik", _bik);
		_columnOriginalValues.put("address", _address);
	}

	private static final Map<String, String> _attributeNames;

	static {
		Map<String, String> attributeNames = new HashMap<>();

		attributeNames.put("uuid_", "uuid");

		_attributeNames = Collections.unmodifiableMap(attributeNames);
	}

	private transient Map<String, Object> _columnOriginalValues;

	public static long getColumnBitmask(String columnName) {
		return _columnBitmasks.get(columnName);
	}

	private static final Map<String, Long> _columnBitmasks;

	static {
		Map<String, Long> columnBitmasks = new HashMap<>();

		columnBitmasks.put("uuid_", 1L);

		columnBitmasks.put("bank_name", 2L);

		columnBitmasks.put("bik", 4L);

		columnBitmasks.put("address", 8L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private banks _escapedModel;

}