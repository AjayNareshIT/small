package Step_Definations;

import java.io.IOException;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import BaseClass.*;
import LoginP.Login_Pag;
import regularusagemethods.*;
public class screenshot extends Login_Pag{
	Standard_methods GM = new Standard_methods();
	@Given("user is on login page1")
	
	public void user_is_on_login_page1() throws IOException {
		application_launch();
		ExtentCucumberAdapter.addTestStepLog("Lanuched successfully");
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(GM.TakeScreencapture());
		

	}

	@When("^user enters valid username12\"([^\"]*)\"$")
	public void abc(String Emailid) throws IOException {
		EnterEmailID(Emailid);
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(GM.TakeScreencapture());
		ExtentCucumberAdapter.addTestStepLog("Entered username successfully "+ Emailid);
		                                                                                      
	}

	@When("^user enters valid password12\"([^\"]*)\"$")
	public void def(String password) throws IOException {
		EnterPassword(password);
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(GM.TakeScreencapture());
		ExtentCucumberAdapter.addTestStepLog("Entered password successfully "+ password);
	}

	@When("clicks on submit12")
	public void clicks_on_submit12() throws IOException {
		Sigin_login();
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(GM.TakeScreencapture());
		ExtentCucumberAdapter.addTestStepLog("CLick is done successfully");
	}

}
