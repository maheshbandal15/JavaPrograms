package practice;

/**
 * Singleton class means you can create only one object for the given class.
 * You can create a singleton class by making its constructor as private,
 * so that you can restrict the creation of the object. Provide a static method to get instance of the object, 
 * wherein you can handle the object creation inside the class only.
 * In this example we are creating object by using static block.
*/
public class SingletonClassExample {

	private static SingletonClassExample myObj;
    
    static{
        myObj = new SingletonClassExample();
    }
     
    private SingletonClassExample(){
     
    }
     
    public static SingletonClassExample getInstance(){
        return myObj;
    }
     
    public void testMe(){
        System.out.println("Hey.... it is working!!!");
    }
     
    public static void main(String a[]){
        SingletonClassExample ms = getInstance();
        ms.testMe();
//        ---------------------------example 2---------------------------
        // instantiating Singleton class with variable x
        Singleton x = Singleton.getInstance();
 
        // instantiating Singleton class with variable y
        Singleton y = Singleton.getInstance();
 
        // instantiating Singleton class with variable z
        Singleton z = Singleton.getInstance();
 
        // changing variable of instance x
        x.s = (x.s).toUpperCase();
 
        System.out.println("String from x is " + x.s);
        System.out.println("String from y is " + y.s);
        System.out.println("String from z is " + z.s);
        System.out.println("\n");
 
        // changing variable of instance z
        z.s = (z.s).toLowerCase();
 
        System.out.println("String from x is " + x.s);
        System.out.println("String from y is " + y.s);
        System.out.println("String from z is " + z.s);
    }

}

//---------------------------------example 2------------------------------------------------

//Java program implementing Singleton class
//with getInstance() method
class Singleton
{
 // static variable single_instance of type Singleton
 private static Singleton single_instance = null;

 // variable of type String
 public String s;

 // private constructor restricted to this class itself
 private Singleton()
 {
     s = "Hello I am a string part of Singleton class";
 }

 // static method to create instance of Singleton class
 public static Singleton getInstance()
 {
     if (single_instance == null)
         single_instance = new Singleton();

     return single_instance;
 }
}

