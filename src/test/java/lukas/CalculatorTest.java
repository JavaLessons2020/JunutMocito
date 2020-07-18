package lukas;


import lukas.calc.Calculator;
import org.junit.Test;
import org.junit.*;

import static org.junit.Assert.*;


public class CalculatorTest {
    static Calculator calculator;
    int a;
    int b;

    @BeforeClass
    public static void beforeClass() {
        calculator = new Calculator();
        System.out.println("BeforeClass test");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("AfterClass test");
    }

    @After
    public void after() {
        System.out.println("After test");
    }

    @Before
    public void before() {
         a = 10;
         b = 20;
        System.out.println("Before test");
    }

    @Test(timeout = 1500)
    public void sum() {
        int res = calculator.sum(a, b);
        int exp = 30;
        System.out.println("exp = " + exp);
       assertEquals(exp, res);
    }

    @Test(expected = NullPointerException.class)
    public void div() {
        int res = calculator.div(a, b);
        int exp = -10;
        System.out.println("exp = " + exp);
       assertEquals(exp, res);
    }

    @Test
    public void testEx() {
        boolean b = calculator.testEx(a);
        assertFalse(b);
    }
}
