package stepdefinition;

import com.pages.SearchBox;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchBoxTest {
		SearchBox sb;
	@When("user clicks on searchbox")
	public void user_clicks_on_searchbox() {
	   sb = new SearchBox();
	   sb.search();
	}

	@And("^user enters a movie name(.+)$")
    public void user_enters_a_movie_name(String mName) {
        sb.search(mName);
    }

	@Then("movie appears successfully")
	public void movie_appears_successfully() {
	    System.out.println(sb.driver.getTitle());
	    sb.teardown();
	}

}
