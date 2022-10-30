import java.util.*;

interface firstInterface {
    public void fmethod1();

    public void fmethod2();
}

interface secondInterface {
    public void smethod1();

    public void smethod2();
}

interface thirdInterface {
    public void tmethod1();

    public void tmethod2();
}

interface fourthInterface extends thirdInterface {
    public void fomethod1();

    public void fomethod2();
}

interface fifthInterface extends firstInterface, secondInterface, fourthInterface {
}

abstract class abstractClass implements fifthInterface {
    abstract void abstractMethod1();

    abstract void abstractMethod2();
}

class ConcreteClass extends abstractClass {
    @Override
    public void fmethod1() {
        System.out.println("Method 1 of First Interface");
    }

    @Override
    public void fmethod2() {
        System.out.println("Method 2 of First Interface");
    }

    @Override
    public void smethod1() {
        System.out.println("Method 1 of Second Interface");
    }

    @Override
    public void smethod2() {
        System.out.println("Method 2 of Second Interface");
    }

    @Override
    public void tmethod1() {
        System.out.println("Method 1 of Third Interface");
    }

    @Override
    public void tmethod2() {
        System.out.println("Method 2 of Third Interface");

    }

    @Override
    public void fomethod1() {
        System.out.println("Method 1 of Fourth Interface");
    }

    @Override
    public void fomethod2() {
        System.out.println("Method 2 of Fourth Interface");

    }

    @Override
    void abstractMethod1() {
        System.out.println("Abstract method 1 of Abstract Class");

    }

    @Override
    void abstractMethod2() {
        System.out.println("Abstract method 2 of Abstract Class");
    }

}

public class Main1 {
    public static void firstInterfaceTest(firstInterface interaface1) {
        interaface1.fmethod1();
        interaface1.fmethod2();
    }

    public static void secondInterfaceTest(secondInterface interface2) {

        interface2.smethod1();
        interface2.smethod2();
    }

    public static void fourthInterfaceTest(fourthInterface interface4) {
        interface4.tmethod1();
        interface4.tmethod2();
        interface4.fomethod1();
        interface4.fomethod2();

    }

    public static void main(String[] args) {
        ConcreteClass classObj = new ConcreteClass();
        classObj.abstractMethod1();
        classObj.abstractMethod2();
        firstInterfaceTest(classObj);
        secondInterfaceTest(classObj);
        fourthInterfaceTest(classObj);
    }

}