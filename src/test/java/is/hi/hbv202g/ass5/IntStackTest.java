package is.hi.hbv202g.ass5;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class IntStackTest {
private IntStack empty;
    @Before
    public void constructStackTestObjects(){
        empty=new IntStack();
    }

    @Test
    public void testNewStackIsNotFull() {
        IntStack stack= empty;
        assertFalse(stack.isFull());
    }
    @Test
    public void testFullStackIsFull(){
        IntStack stack= empty;
        for (int i=1;i< stack.getCapacity();i++){
            stack.push(1);
        }
        assertTrue(stack.isFull());
    }

    @Test
    public void testPopReturnsPushedValue(){
        IntStack stack=empty;
        int expected= 1;
        stack.push(1);
        assertEquals(expected,stack.pop());
    }

    @Test(expected=ArithmeticException.class)
    public  void testPopIsAllowed(){
        IntStack stack =empty;
        stack.pop();
    }
    @Test(expected=ArithmeticException.class)
    public  void testPushIsAllowed(){
        IntStack stack =empty;
        for (int i=1;i<= stack.getCapacity();i++){
            stack.push(1);
        }
    }

}
