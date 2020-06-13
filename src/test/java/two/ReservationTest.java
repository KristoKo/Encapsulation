package two;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReservationTest {

    @Test
    public void testCanBeCancelledByAdminCancellingReturnsTrue() {
        //Arrange
        Reservation reservation = new Reservation();
        User adminUser = new User("Feride", "Celik", true);

        //Act
        boolean result = reservation.canBeCancelledBy(adminUser);

        //Assert
        assertEquals(true, result);
        assertTrue(result);
    }

    @Test
    public void testCanBeCancelledBySameUserCancellingReturnTrue() {
        //Arrange

        User user = new User("Feride", "Celik", false);
        Reservation reservation = new Reservation();
        //Act
        boolean result = reservation.canBeCancelledBy(user);

        //Assert
        assertEquals(true, result);
        assertTrue(result);
    }

    @Test
    public void testCanBeCancelledByAnotherUserCancellingReturnFalse() {
        //Arrange
        User madeBy = new User("Feride", "Celik", false);
        User anotherUser = new User("Some", "Other Person", false);
        Reservation reservation = new Reservation(madeBy);
        boolean result = reservation.canBeCancelledBy(anotherUser);

        assertEquals(false, result);
        assertFalse(result);

    }


}