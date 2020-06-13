package two;

public class User {
    private String name;
    private String lastName;
    private boolean isAdmin;

    public User() {
    }

    public User(String name, String lastName, boolean isAdmin) {
        this.name = name;
        this.lastName = lastName;
        this.isAdmin = isAdmin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }
}
