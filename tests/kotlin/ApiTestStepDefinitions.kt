import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import org.testng.Assert.assertTrue

class ApiTestStepDefinitions {

    @Given("user is logged in")
    fun testStep() {
        assertTrue(true)
    }

    @Then("user can {word} a file")
    fun `user can perform CRUD on an item`(action: String) {
       val result = when(action) {
            "create" -> true
            "update" -> true
            "view" -> false
            "delete" -> true
           else -> throw NotImplementedError()
       }
        assertTrue(result)
    }

}