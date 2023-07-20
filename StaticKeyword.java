

class Student{
    String name;
    int roll;
    static String college ;


    // to initialize static variable we have static block;
    static{
        college = "MSIT";
        System.out.println("static block is loaded");
    }
    public void show(){
        System.out.println(name+":"+roll+":"+college);
    }
}
public class StaticKeyword {
    public static void main (String[] args) throws ClassNotFoundException {
        // Student st1 = new Student();
        // Student st2 = new Student();
        // st1.name = "Ajay";st1.roll =1;
        // st2.name = "Sujoy";st2.roll=2;
        // st1.college = "BPPIMT";
        // st1.show();
        // st2.show();

        /// when we create a object of a class
        // the class is loaded first then object is created;
        // class is loaded only once irrespective of number of objects is created;
        // to load a class without creating object we have to use
        Class.forName("Student"); 
    }
}
