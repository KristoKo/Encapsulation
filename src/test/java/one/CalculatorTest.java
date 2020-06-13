package one;

import org.junit.*;

import java.sql.SQLOutput;

import static org.junit.Assert.*;

public class CalculatorTest {


    // We can also call the calculator before the test to just create one instance.

    private Calculator calculator;

    @Before
    public void setUp() throws Exception {
        System.out.println("Running...");
        calculator = new Calculator();
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Running before test...");
    }





    //(test)(method name)(condition)(result)
    @Test
    public void testAddFirst2Second3Returns5() { //test method

        // = means assignment (equal signs mean assign)

        // Arrange
        //Calculator calculator = new Calculator(); //create a new instance
        int firstNumber = 2;
        int secondNumber = 3;
        int expectedResult = 5;


        // Act
        int result = calculator.add(firstNumber,secondNumber);

        // Assert
        // (we have ready made methods to use . )
        // String x = "Feride";
        // x.

        assertEquals(expectedResult, result);

    }

    @Test
    public void testDivideFirst10Second5Returns2(){
        //public-access modifier
        //Arrange
        //Calculator calculator = new Calculator();
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 2;
        //Act
        int result = calculator.divide(firstNumber,secondNumber);
        //Assert
        assertEquals(expectedResult, result);

    }

    @After
    public void tearDown() throws Exception {
        System.out.println("runs after test method");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("runs after everything...");
    }
}