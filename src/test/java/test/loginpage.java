package test;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.Basicsclass;

public class loginpage extends Basicsclass
{
	@Test
	public void Login()
	{
		Reporter.log("login page is opend sucessfully", true);
	}
}
