class Person {
    private String name;
    private int age;

    // Getter and setter methods for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and setter methods for age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class DataBinding{
    public static void main(String[] args) {
        // Creating a person object
        Person person = new Person();

        // Setting data using setter methods
        person.setName("Sreenandha");
        person.setAge(21);

        // Getting data using getter methods and displaying the result
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}
