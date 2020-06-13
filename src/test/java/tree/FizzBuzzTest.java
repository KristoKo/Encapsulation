package tree;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {


    /*
    * Assertj
    * doc: assertj.github.io/doc/
    * assertThat();
    * */

    @Test
    public void testPrintInput1Return1(){
        //Arrange
        int input = 1;
        String expected = "1";

        //Act
        String result = FizzBuzz.print(input);

        //Assert
        assertEquals(expected,result);
    }

    @Test
    public void testPrintInput2Return2(){
        //Arrange
        int input = 2;
        String expected = "2";

        //Act
        String result = FizzBuzz.print(input);

        //Assert
        assertEquals(expected,result);
    }

    @Test
    public void testPrintInput3ReturnFizz(){
        //Arrange
        int input = 3;
        String expected = "Fizz";

        //Act
        String result = FizzBuzz.print(input);

        //Assert
        assertEquals(expected,result);
    }

    @Test
    public void testPrintInput5ReturnBuzz(){
        //Arrange
        int input = 5;
        String expected = "Buzz";

        //Act
        String result = FizzBuzz.print(input);

        //Assert
        assertEquals(expected,result);
    }
    @Test
    public void testPrintInput6ReturnFizz(){
        //Arrange
        int input = 6;
        String expected = "Fizz";

        //Act
        String result = FizzBuzz.print(input);

        //Assert
        assertEquals(expected,result);
    }
    @Test
    public void testPrintInput10ReturnBuzz(){
        //Arrange
        int input = 10;
        String expected = "Buzz";

        //Act
        String result = FizzBuzz.print(input);

        //Assert
        assertEquals(expected,result);
    }
    @Test
    public void testPrintInput15ReturnFizzBuzz(){
        //Arrange
        int input = 15;
        String expected = "FizzBuzz";

        //Act
        String result = FizzBuzz.print(input);

        //Assert
        assertEquals(expected,result);
    }
}


//assertThat();