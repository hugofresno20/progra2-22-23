package Poo;

public class Student {
    private String name;

    public Student() {
        this.name = "John";
    }
    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
