package basic_04_objectOrient;

/*
笔记本电脑使用usb设备
定义usb接口具有基本开启和关闭功能，鼠标和键盘必须实现usb接口的功能

1. USB接口包含打开设备，关闭设备功能
2. 笔记本类，包含开机功能，关机功能，使用USB功能
3. 鼠标类，要实现USB接口，并具备点击方法
4. 键盘类，要实现USB接口，并具备敲击方法

 */

public class Demo24_4ClassPolymorphismExampleUSB {
    public static void main(String[] args) {
        // laptop
        Laptop laptop1 = new Laptop();
        laptop1.powerOn();
        laptop1.powerOff();

        // usb device
        Mouse mouse1 = new Mouse();
        Keyboard kb1 = new Keyboard();
        USB device1 = new Mouse();
        USB device2 = new Keyboard();

        // laptop use
        laptop1.useDevice(kb1);
        laptop1.useDevice(mouse1);
        laptop1.useDevice(device1);
        laptop1.useDevice(device2);
    }
}

interface USB {
    public abstract void open();

    public abstract void close();
}

class Laptop {

    public void powerOn() {
        System.out.println("Laptop power on!");
    }

    public void powerOff() {
        System.out.println("Laptop power off!");
    }

    public void useDevice(USB usb) {

        usb.open();

        if (usb instanceof Mouse) {
            ((Mouse) usb).click();
        } else if (usb instanceof Keyboard) {
            ((Keyboard) usb).type();
        }

        usb.close();
    }
}

class Mouse implements USB {
    @Override
    public void open() {
        System.out.println("Mouse open");
    }

    @Override
    public void close() {
        System.out.println("Mouse close");
    }

    public void click() {
        System.out.println("Mouse click!");
    }
}

class Keyboard implements USB {

    @Override
    public void open() {
        System.out.println("Keyboard open");
    }

    @Override
    public void close() {
        System.out.println("Keyboard close");
    }

    public void type() {
        System.out.println("Keyboard type!");
    }
}
