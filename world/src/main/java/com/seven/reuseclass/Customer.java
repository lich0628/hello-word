package com.seven.reuseclass;

public class Customer {

	public static void main(String[] args) {
		ICoder coder = new JavaCoder("Zhang");
		ICoder proxy = new CoderProxy(coder);
		proxy.implDemands("Add user manageMent");
		proxy.implDemands("Update user manageMent");
	}

}
