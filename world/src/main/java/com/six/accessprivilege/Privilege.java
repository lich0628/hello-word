package com.six.accessprivilege;

public class Privilege {

	public void publicPrivilege() {
		System.out.println("public");
	}

	protected void protectedPrivilege() {
		System.out.println("protected");
	}

	void defaultPrivilege() {
		System.out.println("default");
	}

	@SuppressWarnings("unused")
	private void privatePrivilege() {
		System.out.println("private");
	}
}
