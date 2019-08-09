package com.hrms.groups;


	import org.testng.annotations.Test;
	public class TC_S02{
	@Test(groups="Regression")
	public void meth1() {
	System.out.println("This is meth1() in TC_S02");
	}
	@Test(groups="Regression")
	public void meth2() {
	System.out.println("This is meth2() in TC_S02");
	}
	@Test(groups="Sanity")
	public void meth3() {
	System.out.println("This is meth3() in TC_S02");
	}
	@Test(groups="Functional")
	public void meth4() {
	System.out.println("This is meth4() in TC_S02"); }
	}

