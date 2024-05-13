public class UnderstandingObjectCloning {

    public static void main(String[] args) {
        A obj = new A();
        obj.i = 5;
        obj.j = 6;

        /**
         Shallow Copy - if the instance variables change in 1 object, it will change in the second object as well
         */
        A obj1 = obj;
        //Before changing instance variable value
        System.out.println(obj1);
        System.out.println(obj);
        obj1.i = 7;
        //After changing instance variable value in 1 object
        System.out.println(obj);
        System.out.println(obj1);

        A ob2 = new A();
    }
}

class A {
    int i;
    int j;

    @Override
    public String toString() {
        return "A{" +
                "i=" + i +
                ", j=" + j +
                '}';
    }


}
