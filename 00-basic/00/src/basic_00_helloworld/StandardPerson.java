package basic_00_helloworld;

public class StandardPerson {
    /*
            member variable
     */

    private String name;
    private int age;

    /*
            constructor
     */

    public StandardPerson() {
    }

    public StandardPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /*
            getter and setter
     */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /*
            member method
     */

    public void show() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

}
