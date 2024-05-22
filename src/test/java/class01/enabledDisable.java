package class01;

import org.testng.annotations.Test;

public class enabledDisable {
    @Test
    public void ATest(){
        System.out.println("i am a test");
    }

    //failing
    @Test (enabled = false)
    public void BTest(){
        System.out.println("i am B test");
    }
}
