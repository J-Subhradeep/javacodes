class A{
    A(){
        System.out.println("Object is created");
    }
    public void show(){
        System.out.println("Show method");
    }
}
public class AnonymousObj {
    public static void main(String[] args) {
        // A obj = new A();

        new A(); // anonymous object

    }
}
