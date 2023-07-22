enum Mobile{
    Samsung(22000), Realme(19000) , Nokia;

    private double price;
    private Mobile(){
        price = 0;
    }
    private Mobile(double price) {
        this.price = price;
    }
    public String getName(){
        return this.name();
    }
    public double getPrice(){
        return this.price;
    }
}

public class EnumClass {
    public static void main(String[] args) {
        Mobile m1 = Mobile.Samsung;
        System.out.println(m1.getPrice());
        for (Mobile mobile : Mobile.values()) {
            System.out.println(mobile.getName()+":"+mobile.getPrice());
        }
    }
}
