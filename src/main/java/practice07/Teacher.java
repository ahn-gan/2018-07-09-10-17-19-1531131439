package practice07;

public class Teacher extends Person{
    private Klass klass;

    public Teacher(String name, Integer age) {
        super(name, age);
    }

    public Teacher(String name, Integer age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        String result = super.introduce() + " I am a Teacher. ";
        if (this.getKlass() == null) {
            return result + "I teach No Class.";
        } else {
            return result + "I teach Class " + String.valueOf(this.getKlass().getNumber()) + ".";
        }
    }

    public String introduceWith(Student student) {
        String result = super.introduce() + " I am a Teacher. ";
        if (this.getKlass().getNumber() == student.getKlass().getNumber()) {
            result += "I teach " + student.getName() + ".";
        } else {
            result += "I don't teach " + student.getName() + ".";
        }
        return result;
    }
}
