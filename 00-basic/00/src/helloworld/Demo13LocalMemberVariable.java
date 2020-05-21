package helloworld;

/*
                                    local variable VS member variable

                        local variable                      member variable

position                inside method                       inside class, outside method

working area            inside method                       in class

default value           no default                          default if no valuation

memory address          in stack                            heap

life cycle              born when into stack (进展)          born when instance was generated (创建对象)
                        die when out stack (出栈)            die when instance was recycled (对象回收)


 */


public class Demo13LocalMemberVariable {
    String name;            // member variable

    public void methodA() {
        int num = 20;        // local variable
        System.out.println(num);
    }

    public void methodB(int param) {
        System.out.println(param);  // right, because when method was called, param must have value

        int age;
        // System.out.println(age); // wrong without valuation
        // System.out.println(num); // wrong with local variable
        System.out.println(name);   // right with member variable
    }

    public static void main(String[] args) {

    }

}
