import java.time.LocalDate;

public class Person {
    public enum Sex {
        MALE, FEMALE
    }

    String name;
    LocalDate birthday;
    int age;
    Sex gender;
    String emailAddress;

    public Person(String name, LocalDate birthday, int age, Sex gender, String emailAddress) {
        this.name = name;
        this.birthday = birthday;
        this.age = age;
        this.gender = gender;
        this.emailAddress = emailAddress;
    }

    public int getAge() {
        return age;
    }

    public void printPerson() {
        System.out.println("Name: " + name + ", age: " + age + "\n");
    }
}
