package annotations;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners (TestListeners.class)

public class dataProvider {

    @Test (dataProvider = "getData")
    public void firstTest (String username, String password) {
        System.out.println("Test logowania");
        System.out.println("UserName: " +username);
        System.out.println("Password: " +password);
    }

    @DataProvider
    public Object[][] getData() {
        return new Object[][]{{"test1","test2"},{"test2","test2"},{"test3","test3"}};
    }
}
