package advanced;

public class Person {

    private String firstName;
    private String lastName;





    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //private because we can keep control of it
    //encapsulation-- we are accessing private variables through public classes
    //encapsulation-- using getters and setters example
    //we can use (final String firstName) if we do not want to change it any time in the program.
    public void setFirstName(String firstName) {
        this.firstName = firstName;

        //we can also change the String to firstName1 and use firstname1 = firstName (if we use a different var name)
        //this goes through this java (file)
    }

    public void setLastName(String lastName) {
        if (lastName.isEmpty()) {
            this.lastName = lastName;
        }
        this.lastName = lastName;
    }



    public String getFirstName() {
        return firstName;
    }


}
