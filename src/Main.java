import org.w3c.dom.ls.LSOutput;

import java.lang.invoke.StringConcatFactory;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Application started");
    }
    abstract class test1{
        public abstract void method1();
        public abstract void method2();
    }
    abstract class test2{
        public abstract void method3();
        public void method4(){
            System.out.println(" ");
        }
        public test2(){

        }
    }
    class A extends test2{
        public  void method3(){
            System.out.println("Hey there!");
            super.method4();
        }

//        public void method4(){
//
//        }
//
    }
    class B extends test1{

    }
}
