package interview.questions.design_patterns;

public class SingletonDesignPattern {


}

class SingletonImpl {
    //Since this Object obj is static,
    static SingletonImpl obj = new SingletonImpl();

    private SingletonImpl() {

    }

    /**
     * Question. Why the Singleton class object is static?
     * Answer. Because we are referencing the obj variable inside a static method and we can't reference instance variables inside static methods.
     * Therefore, the obj variable is static in nature.
     * Also, the idea of Singleton design pattern is to have one and only one instance at all times running
     */
    public static SingletonImpl getInstance() {
        return obj;
    }
}
