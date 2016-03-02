package ac.za.cput.cuanlee;

/**
 * Created by Cuan on 3/2/2016.
 */
public class Person {
    private String name;
    private String surname;
    private int age;
    private float salary;
    private int Numbers[];
    private boolean dependent;

    public Person() {
    }

    public Person(String name, String surname,int age, float salary, int[] numbers, boolean dependent) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.age = age;
        Numbers = numbers;
        this.dependent = dependent;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public float getSalary() {
        return salary;
    }

    public int[] getNumbers() {
        return Numbers;
    }

    public boolean isDependent() {
        return dependent;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void setNumbers(int[] numbers) {
        Numbers = numbers;
    }

    public void setDependent(boolean dependent) {
        this.dependent = dependent;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
