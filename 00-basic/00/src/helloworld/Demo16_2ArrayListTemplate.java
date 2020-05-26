package helloworld;

/*
如果要在ArrayList中储存基本类型数据，必须使用基本类型对应的“包装类”

基本类型      包装类（引用类型，包装类都位于java.lang包下）
byte        Byte
short       Short
int         Integer     // *
long        Long
float       Float
double      Double
char        Character   // *
boolean     Boolean

 from JDK 1.5+, 支持自动装箱，自动拆箱
 自动装箱： 基本类型 --> 包装类型
 自动拆箱： 包装类型 --> 基本类型

 */

import java.util.ArrayList;

public class Demo16_2ArrayListTemplate {
    public static void main(String[] args) {
        ArrayList<String> listA = new ArrayList<>();

        //ArrayList<int> listB = new ArrayList<>();     // wrong, ArrayList can not use basic datatype, only refer type

        ArrayList<Integer> listC = new ArrayList<>();
        listC.add(100);
        listC.add(200);
        listC.add(300);

        System.out.println(listC);  //[100, 200, 300]
        System.out.println("1. element is " + listC.get(1));
    }
}
