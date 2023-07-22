class A{ // by default every class extends Object class
    public A(){
        System.out.println("A constructor");
    }

}

class B extends A{
    public B(){
         // by default there is super() even if u dont write it;
        this(12);
        System.out.println("B constructor");
    }
    public B(int a){
        super();
        System.out.println("INt constructor");
    }
}
public class ThisAndSuper{
    public static void main(String[] args) {
        /*
         * 
         * now we are creating object of B class
         * it will first call the constructor of A class for the super method
         * then the rest code will be executed
         * if we want to call the parameterized constructor of B class from Default constructor of B class
         * we have to use this() method like line 11
         * 
         */
        B b = new B();

        /*
         * 
         *  A constructor
            INt constructor
            B constructor

            this is output.
         */
    }
}