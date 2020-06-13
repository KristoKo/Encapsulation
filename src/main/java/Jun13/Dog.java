package Jun13;

public class Dog {
    private String name;
    private int age;
    private String gender;
    private String race;
    private int weight;

    public Dog(String name, int age, String gender, String race, int weight) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.race = race;
        this.weight = weight;
    }

    public Dog(String gender, String race) {
        super();
    }

    public Dog() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0) {
            System.out.println("Can't be, please fix the age!");
        }
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight <= 0) {
            System.out.println("Weightless? Please fix that, sir!");
        }
        this.weight = weight;
    }

}

