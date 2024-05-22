package class01;

import org.testng.annotations.Test;

public class dependsOn {

    @Test
    public void login(){
        System.out.println(10/0);
        //System.out.println("i am login");
    }
    @Test (dependsOnMethods = {"login"})
    public void dashBoard(){
        System.out.println("i am dashboard");
    }
}
//everything is ok and it pass but when we changes the login like we put 10/0 it failed