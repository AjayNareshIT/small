package LoginP;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BaseClass.Basics;
import regularusagemethods.Standard_methods;
//import GenericMethods.AllGenericMethods;
public class Login_Pag extends Basics{

	
	

	public static By Emailid=By.id("email");
	public static By Passwordid=By.xpath("//input[@id='pass']");
	public static By Sigin=By.name("login");


	public static void EnterEmailID(String email)
	{
		driver.findElement(Emailid).sendKeys(email);
	}

	public static void EnterPassword(String password)
	{
		driver.findElement(Passwordid).sendKeys(password);
	}

	public static void Sigin_login()
	{
		Standard_methods sm = new Standard_methods();
		WebElement Signlink= driver.findElement(Sigin);
		sm.JavaScript_ExecutorClick(Signlink);
//		GM.select_ByIndex("Credidit", Signlink);
		
		
	}



	}


