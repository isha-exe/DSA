
// importing the actusal main class
import com.sun.tools.javac.Main;


public class Sample {
    //main method
    public static void main(String[] args) {
        // greeting(); - error because a non-static method cannot be used inside a static method.

    }

    //greeting method - non static method
    void greeting(){
        System.out.println("Hello World");
        //calling non static method inside a non static method
        greeting2();  //NO ERROR

    }

    //another non static method
    public void greeting2(){
        System.out.println("Hello world 2");

        //calling non static method inside itself
        greeting2(); //NO ERROR
    }

    //static method
    static void hello() {
        System.out.println("Hello");
        //calling static method inside a static method
        hello2(); //NO ERROR
    }

    //another static method
    static void hello2() {
        System.out.println("Hello hello");
        // calling non static method inside a staic method

        // greeting2(); ERROR

        


        //calling static method inside a static method
        hello(); //NO ERROR
    }

}
