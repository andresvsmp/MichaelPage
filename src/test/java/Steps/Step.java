package Steps;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.NewContact;
import com.crm.qa.pages.NewCustomer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

public class Step extends TestBase {

    // (//d+) IS A INTEGER
    // (.+) IS A STRING
    @Given("^Hago log in en la pagina$")
    public void sendGETrequest(){
               setUp();
    }

    //Contac
    @Then("^Realizo el formulario de contacto$")
    public void contact(){
        NewContact contact = new NewContact(driver);
        contact.newContact();
    }

    //Customers
    @Then("^Realizo el formulario de cliente$")
    public void customer(){
        NewCustomer customer = new NewCustomer(driver);
        customer.createCustomer();
        closedBrowser();
    }

    //Close browser
    @Then("^Cierro el browser$")
    public void browser(){
        closedBrowser();
    }

}
