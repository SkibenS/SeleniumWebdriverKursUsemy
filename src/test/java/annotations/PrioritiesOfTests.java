package annotations;

import org.testng.annotations.Test;

public class PrioritiesOfTests {

    @Test (priority = 0)
            //(priority = 0)
    public void firstTest() {System.out.println("First test " + this.getClass().getName());}

    @Test (priority = 1)
            //(groups = {"secondGroup"})
    public void secondTest() {System.out.println("Second test " + this.getClass().getName());}

    @Test (priority = 2)
            //(dependsOnGroups = {"firstGroup", "secondGroup"},priority = 1)
    public void thirdTest() {System.out.println("Third test " + this.getClass().getName());}

    @Test (priority = 3)
    public void fourthTest() {System.out.println("Fourth test " + this.getClass().getName());}
}
