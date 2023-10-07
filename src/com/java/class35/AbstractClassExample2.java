package com.java.class35;

abstract class Engineer { //can have abstract and concrete classes
    //changing to abstract class if you have at least  1 abstract method
    //abstract mens INCOMPLETE
    //Abstract class has to be a PARENT class

    //Abstract method
    public abstract  void work(); //instead of }{ ---> ()

//        public void work() {
//        System.out.println(""); //when we don't know what to write exactly
//        depends of subclass
//    }
    //Concrete method - has a body, complete
    public void sleep(){
        System.out.println("No sleep!");
    }
}
abstract class ComputerEngineer extends Engineer{ //can't create object of abstract

}
class Programmer extends ComputerEngineer{
    public void work(){
    System.out.println("Coding without any idea how it works!");
}
}
class ElectronicsEngineer extends Engineer{ //exist
    public void work() {
        System.out.println("Work with wires and get shocked");
    }
}

public class AbstractClassExample2 {
    public static void main(String[] args) {
        Programmer chirag = new Programmer();
        chirag.sleep(); //No sleep!
        chirag.work(); //"Coding without any idea how it works!"

        ElectronicsEngineer maria = new ElectronicsEngineer();
        maria.sleep();//No sleep!
        maria.work(); //Work with wires and get shocked
    }
}

//        Engineer e = new Engineer();
//        e.work();
//        will ask implement method, but abstract class doesn't have a body
//
//        !!! We can't create Object of abstract class !!!
