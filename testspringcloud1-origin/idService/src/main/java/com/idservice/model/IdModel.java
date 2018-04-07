package com.idservice.model;

public class IdModel {

	@Override
	public String toString() {
		return "IdModel [serviceNowID=" + startID + ", consumerID=" + consumerID + "]";
	}

	public String getConsumerID() {
		return consumerID;
	}

	public void setConsumerID(String consumerID) {
		this.consumerID = consumerID;
	}

	public int getSelectFieldLength() {
		return selectFieldLength;
	}

	public void setSelectFieldLength(int selectFieldLength) {
		this.selectFieldLength = selectFieldLength;
	}

	public String getConsumerDesc() {
		return consumerDesc;
	}

	public void setConsumerDesc(String consumerDesc) {
		this.consumerDesc = consumerDesc;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public String getPermittedGroup() {
		return permittedGroup;
	}

	public void setPermittedGroup(String permittedGroup) {
		this.permittedGroup = permittedGroup;
	}

	public String getStartID() {
		return startID;
	}

	public void setStartID(String startID) {
		this.startID = startID;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getServiceNowID() {
		return serviceNowID;
	}

	public void setServiceNowID(String serviceNowID) {
		this.serviceNowID = serviceNowID;
	}

	private String startID;
	private String consumerDesc;
	private Boolean enabled;
	private String permittedGroup;
	private String consumerID;
	private int selectFieldLength;
	private String userID;
	private String serviceNowID;

}