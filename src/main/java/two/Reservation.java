package two;

public class Reservation {
    private User madeBy;


    public Reservation(){

    }
    public Reservation(User madeBy) {
        this.madeBy = madeBy;
    }

    public User getMadeBy() {
        return madeBy;
    }

    public void setMadeBy(User madeBy) {
        this.madeBy = madeBy;
    }

    public boolean canBeCancelledBy(User user) {
        if (user.isAdmin()) {
            return true;
        }

        if (madeBy.equals(user)) {
            return true;
        }
        return false;
    }




}
