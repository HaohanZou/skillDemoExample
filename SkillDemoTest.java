import static org.junit.Assert.*;
import org.junit.*;


public class SkillDemoTest{
    // Here we need to add several tests to make sure method multiply can work properly

    @Test
    public void test1(){
        assertEquals(2, SkillDemo.multiply(1,2)); //A test that fails
    }


}