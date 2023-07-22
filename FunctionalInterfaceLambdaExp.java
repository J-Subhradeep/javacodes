@FunctionalInterface
/**
 * functional interface only have one methond inside it
 */
interface A {

    public int add(int a,int b);
    // void hide();
}

class FunctionalInterfaceLambdaExp{
    public static void main(String[] args) {
        // A obj = new A(){
        //     public int add(int a,int b){
        //         return a+b;
        //     }
        // };

        // lambda expression
        A obj = (a,b)-> a+b;
        System.out.println(obj.add(5,6));
    }
}