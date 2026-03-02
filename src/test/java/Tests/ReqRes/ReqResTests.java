package Tests.ReqRes;

import io.qameta.allure.*;
import org.testng.annotations.Test;
import static Common.CoomonTestData.*;
import static Common.RequestBuilder.*;
import static org.hamcrest.Matchers.*;

@Feature("ReqRes")
@Story("Create new employee")
public class ReqResTests {

    @Test
    @Description("As an api user i want to create a new employee")
    @Severity(SeverityLevel.CRITICAL)
    public void createEmployeeTests() {
        createEmployeeResponse().
                then().
                assertThat().
                statusCode(Create_Success_Status_Code);
    }

    @Test
    @Description("As an api user i want to get employee details")
    @Severity(SeverityLevel.CRITICAL)
    public void getEmployeeTests() {
        getEmployeedetailsResponse().
                then().
                assertThat().
                statusCode(Success_Status_Code);
    }
}
