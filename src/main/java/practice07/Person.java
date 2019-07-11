package practice07;

public class Person {
    private String name;

    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String introduce () {
        return "My name is " + this.getName() + ". I am " + String.valueOf(this.getAge()) + " years old.";
    }
}
