/**
 * Created by Jaycon Systems on 08/01/15.
 * Copyright @ 2014 Jaycon Systems. All rights reserved.
 */

package com.hiroapp.model;

public class OperationModel {

	private int id;
	private int operationRefId;
	private int charRefId;
	private String operation;
	private String value;
	private String expectedValue;
	private String charUUID;
	private String serviceUUID;
	private String operationName;
	private String charName;
	private String charReturnType;


	private String failValue;
	

	public String getFailValue() {
		return failValue;
	}

	public void setFailValue(String failValue) {
		this.failValue = failValue;
	}

	public String getCharName() {
		return charName;
	}
	
	public String getCharReturnType() {
		return charReturnType;
	}

	public void setCharReturnType(String charReturnType) {
		this.charReturnType = charReturnType;
	}

	public void setCharName(String charName) {
		this.charName = charName;
	}
	public String getOperationName() {
		return operationName;
	}
	public void setOperationName(String operationName) {
		this.operationName = operationName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getOperationRefId() {
		return operationRefId;
	}
	public void setOperationRefId(int operationRefId) {
		this.operationRefId = operationRefId;
	}
	public int getCharRefId() {
		return charRefId;
	}
	public void setCharRefId(int charRefId) {
		this.charRefId = charRefId;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getExpectedValue() {
		return expectedValue;
	}
	public void setExpectedValue(String expectedValue) {
		this.expectedValue = expectedValue;
	}
	public String getCharUUID() {
		return charUUID;
	}
	public void setCharUUID(String charUUID) {
		this.charUUID = charUUID;
	}
	public String getServiceUUID() {
		return serviceUUID;
	}
	public void setServiceUUID(String serviceUUID) {
		this.serviceUUID = serviceUUID;
	}
	
}
