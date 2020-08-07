package com.springbook.ioc.injection;

import java.util.List;

public class CollectionBean {

	private List<String> addressList;

	// setter
	public void setAddressList(List<String> addressList) {
		System.out.println("set address list");
		this.addressList = addressList;
	}
	
	// getter
	public List<String> getAddressList() {
		return this.addressList;
	}
}
