package helloworld;
/*
    Design a array to store 3 intance from Person()

 */


public class Demo11_8ArrayInstance {
    public static void main(String[] args) {
        // generate an array with length 3, to store instance from Person()
        StandardPerson[] arrayPerson = new StandardPerson[3];

        StandardPerson p1 = new StandardPerson("Roger", 18);
        StandardPerson p2 = new StandardPerson("Francesca", 18);
        StandardPerson p3 = new StandardPerson("Keka", 18);

        // 将p1, p2, p3的地址值储存到数组的元素中
        arrayPerson[0] = p1;
        arrayPerson[1] = p2;
        arrayPerson[2] = p3;

        System.out.println(arrayPerson[0]);         //address
        System.out.println(arrayPerson[1]);         //address
        System.out.println(arrayPerson[2]);         //address

        System.out.println(arrayPerson[1].getName());   // Francesca

    }


}
