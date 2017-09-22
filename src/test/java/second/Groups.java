package second;

import org.testng.annotations.Test;
public class Groups {
    
    @Test(dependsOnMethods = {"secondTest"})
    public void firstTest() {
            System.out.println("I am in first TestNG test");
    }
    @Test
    public void secondTest() {
            System.out.println("I am in second TestNG test");
            
    }
    @Test(enabled=false)
    public void thirdTest() {
            System.out.println("I am in third TestNG test");
    }
}