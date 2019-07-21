package com.six.accessprivilege.control;

import com.six.accessprivilege.Privilege;

public class PrivilegeProtected extends Privilege {

	public static void main(String[] args) {
		PrivilegeProtected p = new PrivilegeProtected();
		p.publicPrivilege();
		p.protectedPrivilege();
	}

}
