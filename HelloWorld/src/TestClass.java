import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestClass {

    Class2 runTest = new Class2();

    @Test
    public void blackJackTest(){


        assertEquals(10, runTest.blackJack(10, 22));
        assertEquals(0, runTest.blackJack(22,32));



    }
    @Test
    public void uniqueSumTest(){
        assertEquals(1, runTest.uniqueSum(1,2,2));
        assertEquals(6, runTest.uniqueSum(1,2,3));

    }

    @Test
    public void tooHotTest(){

        assertEquals(true, runTest.tooHot(90, false));
        assertEquals(false, runTest.tooHot(101, true));


    }

}
