class A{
    public void show(){
        System.out.println("show");
    }
}
public class AnonymousClass {
    public static void main(String[] args) {
        A obj = new A(){

            public void show(){
                System.out.println("anonymous");
            }
        };
        obj.show();
    }
}
