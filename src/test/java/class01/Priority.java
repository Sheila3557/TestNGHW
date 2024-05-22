package class01;

import org.testng.annotations.Test;

public class Priority {

    @Test (priority =3)
    public  void AtestCase(){
        System.out.println("i am test case A");
    }
    @Test(priority = 2)
    public  void BtestCase(){
        System.out.println("i am test case B");
    }

    @Test (priority =1)
    public  void CtestCase(){
        System.out.println("i am test case C");
    }
    @Test // this is the highest priority by default
    public void DtestCase(){
        System.out.println("i am test case D");

    }
}
//the order is ABC but if we put priority