package annotations;

import org.testng.annotations.*;

public class FirstTest {

    @BeforeSuite
    public void beforeSuite() {System.out.println("Before Suite " +this.getClass().getName());}

    @BeforeClass
    public void beforeClass() {System.out.println("Before Class " + this.getClass().getName());}

    @BeforeTest
    public void beforeTest() {System.out.println("Before Test " +this.getClass().getName());}

    @BeforeMethod
    public void beforeMethod() {System.out.println("Before Method " + this.getClass().getName());}

    @Test
    public void firstTest() {
        System.out.println("first test +" +this.getClass().getName());
    }
}
