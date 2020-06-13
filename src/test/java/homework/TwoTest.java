package homework;

import org.junit.Test;
import tree.FizzBuzz;

import static org.junit.Assert.*;

public class TwoTest {

    @Test
    public void testIfSpeedUnderLimitResult0() {
        //Arrange

        int speed = 40;
        int points = 0;

        //Act
        int result = Two.print(speed);

        //Assert
        assertEquals(points,result);

    }

    @Test
    public void testIfSpeedStillUnderLimitResult0() {
        //Arrange

        int speed = 69;
        int points = 0;

        //Act
        int result = Two.print(speed);

        //Assert
        assertEquals(points,result);

    }

    @Test
    public void testIfSpeed5_OverLimitResult1() {
        //Arrange
        int speed = 70;
        int points = 1;

        //Act
        int result = Two.print(speed);

        //Assert
        assertEquals(points,result);

    }
    @Test
    public void testIfSpeed10_OverLimitResult2() {
        //Arrange
        int speed = 75;
        int points = 2;

        //Act
        int result = Two.print(speed);

        //Assert
        assertEquals(points,result);

    }

    @Test
    public void testIfSpeed30_OverLimitResult6() {
        //Arrange
        int speed = 95;
        int points = 6;

        //Act
        int result = Two.print(speed);

        //Assert
        assertEquals(points,result);

    }
    @Test
    public void testIfSpeed71Result1() {
        //Arrange
        int speed = 74;
        int points = 1;

        //Act
        int result = Two.print(speed);

        //Assert
        assertEquals(points,result);

    }
}