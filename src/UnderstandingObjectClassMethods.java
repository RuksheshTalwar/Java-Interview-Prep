public class UnderstandingObjectClassMethods {
    public static void main(String[] args) {
        Laptop obj = new Laptop();
        obj.model = "Lenovo Yoga";
        obj.price = 1000;

        System.out.println(obj);
    }
}

class Laptop {
    int price;
    String model;
}
