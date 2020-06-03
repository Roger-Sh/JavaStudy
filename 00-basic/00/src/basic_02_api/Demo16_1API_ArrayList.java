package basic_02_api;

/*
array length can't be changed
arrayList can be changed

ArrayList 用法：
1. import java.util
2. ArrayList<E>, E 为储存在集合中的元素类型，该类型只能是引用类型，不能是基本类型

notice:
对于ArrayList, 直接打印得到的不是地址值，而是内容，如果内容为空，得到的是空的中括号：[]

ArrayList 常用 method
    public boolean add(E e):
                            //  add element in ArrayList, datatype should  be same with template,
                            //  return true or false
    public E get(int index):
                            //  get element from ArrayList, index shows the position of the element
    public E remove(int index):
                            //  remove element from ArrayList, return the removed element
    public int size():
                            //  get length of the ArrayList, return the number of the elements

 */


import java.util.ArrayList;

public class Demo16_1API_ArrayList {
    public static void main(String[] args) {
        // generate a ArrayList collection,  name is list, element type is String
        ArrayList<String> list = new ArrayList<>(3);  // from JDK1.7+, <>可以不写内容，但<>本身要写
        System.out.println(list);   // 空的ArrayList 打印输出：[]

        /*
            ArrayList.add()
         */

        // 向集合内添加数据，需要add(), 返回 true or false
        boolean isSuccess1 = list.add("Roger");
        boolean isSuccess2 = list.add("Francesca");
        boolean isSuccess3 = list.add("Keka");
        System.out.println(list);   // [Hello, world, !!!]

        System.out.println("1. Add is success? " + isSuccess1); // true
        System.out.println("2. Add is success? " + isSuccess2); // true
        System.out.println("3. Add is success? " + isSuccess3); // true

        //list.add(100)     // wrong datatype, should be String, same with <String>

        /*
            ArrayList.get()
         */
        String name = list.get(1);
        System.out.println("1. element in ArrayList is " + name); // Francesca, index start from 0

        /*
            ArrayList.remove()
         */
        String removeName = list.remove(2);
        System.out.println("Removed name is " + removeName);    // Keka
        System.out.println(list);   // [Roger, Francesca]

        /*
            ArrayList.size()
         */
        int size = list.size();
        System.out.println(size);   // 2

        /*
            ArrayList excises
         */
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("person1");
        list2.add("person2");
        list2.add("person3");

        // iterate ArrayList
        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i));
        }


    }
}
