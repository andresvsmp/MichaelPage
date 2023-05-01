package Steps;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.NewContact;
import com.crm.qa.pages.NewCustomer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Step extends TestBase {

    // (//d+) IS A INTEGER
    // (.+) IS A STRING
    @BeforeMethod
    @Given("^Hago log in en la pagina$")
    public void config(){
               setUp();
    }

    //Contac
    @Test
    @Then("^Realizo el formulario de contacto$")
    public void contact(){
        NewContact contact = new NewContact(driver);
        contact.newContact();
    }


    //Customers
    @Test
    @Then("^Realizo el formulario de cliente$")
    public void customer(){
        NewCustomer customer = new NewCustomer(driver);
        customer.createCustomer();
        closedBrowser();
    }


}
