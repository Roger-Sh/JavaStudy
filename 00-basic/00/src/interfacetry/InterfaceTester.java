package interfacetry;


public class InterfaceTester implements Say, Talk {


    @Override
    public void say(int num) {
        System.out.println(1);
    }

    @Override
    public int returnNum(int num) {
        return 0;
    }

    @Override
    public void talk() {
        System.out.println("111");
    }

    public void saySth() {
        System.out.println("from Interface tester");
    }

}
