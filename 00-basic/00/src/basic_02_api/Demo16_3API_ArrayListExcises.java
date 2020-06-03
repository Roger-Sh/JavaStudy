package basic_02_api;

import java.util.ArrayList;
import java.util.Random;

public class Demo16_3API_ArrayListExcises {
    public static void main(String[] args) {
        // excise1: generate 6 random integers, with range [1,33], add to ArrayList, and iterate the ArrayList
        RandomWithArrayList();
        System.out.println("======================");

        // excise2: 自定义学生对象，添加到集合， 并遍历
        StudentWithArrayList();
        System.out.println("======================");

        // excise3: print ArrayList with certain format, {element1@element2@element3@element4}
        ArrayList<Integer> listInt = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            listInt.add(i);
        }
        System.out.println("Original way: ");
        System.out.println(listInt);
        System.out.println("New format way: ");
        printArrayList(listInt);
        System.out.println("======================");

        // excise4: 得到一个大集合包含20个随机数字，筛选其中的偶数元素放到小集合中
        ArrayList<Integer> listRandom = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            listRandom.add(r.nextInt(100));
        }
        System.out.println("Random list: " + listRandom);

        ArrayList<Integer> listEven = new ArrayList<>();
        listEven = filterEvenFromArrayList(listRandom);
        System.out.println("Even list: " + listEven);
        System.out.println("======================");
    }

    /*
        generate 6 random integers, with range [1,33], add to ArrayList, and iterate the ArrayList
     */
    public static void RandomWithArrayList() {
        // init
        int iterate = 6;
        Random r = new Random();
        int randomNumber;
        ArrayList<Integer> listRandom = new ArrayList<>();

        // generate random numbers
        for (int i = 0; i < iterate; i++) {
            randomNumber = r.nextInt(33) + 1;
            listRandom.add(randomNumber);
        }

        // iterate ArrayList
        for (int i = 0; i < listRandom.size(); i++) {
            System.out.println(listRandom.get(i));
        }
    }

    /*
    自定义学生对象，添加到集合， 并遍历
        1. 自定义学生类， member variable, constructor, getter, setter, method()
        2. 创建集合，用于储存学生对象，使用template <StudentForArrayList>
        3. ArrayList.add()
        4. iterate ArrayList
     */
    public static void StudentWithArrayList() {
        // init ArrayList with template StudentForArrayList
        ArrayList<StudentForArrayList> studentList = new ArrayList<>();

        // instance for StudentForArrayList
        StudentForArrayList stu1 = new StudentForArrayList("Roger", 18);
        StudentForArrayList stu2 = new StudentForArrayList("Francesca", 18);
        StudentForArrayList stu3 = new StudentForArrayList("Keka", 18);

        // add student instance to ArrayList
        studentList.add(stu1);
        studentList.add(stu2);
        studentList.add(stu3);

        // iterate ArrayList
        for (int i = 0; i < studentList.size(); i++) {
            StudentForArrayList stu = studentList.get(i);
            stu.show();
        }
    }

    /*
            print ArrayList with certain format, {element1@element2@element3@element4}
     */
    public static void printArrayList(ArrayList<Integer> list) {
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i != list.size() - 1) {
                System.out.print("@");
            }
        }
        System.out.print("}\n");
    }

    /*
            得到一个大集合包含20个随机数字，筛选其中的偶数元素放到小集合中
     */
    public static ArrayList<Integer> filterEvenFromArrayList(ArrayList<Integer> listRandom) {
        ArrayList<Integer> listEven = new ArrayList<>();

        for (int i = 0; i < listRandom.size(); i++) {
            if (listRandom.get(i) % 2 == 0) {
                listEven.add(listRandom.get(i));
            }
        }

        return listEven;
    }
}

class StudentForArrayList {
    private String name;
    private int age;

    /*
            constructor
     */

    public StudentForArrayList() {
    }

    public StudentForArrayList(String name, int age) {
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
            method
     */
    public void show() {
        System.out.println("Name: " + this.name + " Age: " + this.age);
    }
}

