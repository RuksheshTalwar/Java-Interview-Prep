package interview.questions.generics;

class LegacyBox {
    private Object item;

    public void setItem(Object item) {
        this.item = item;
    }

    public Object getItem() {
        return item;
    }
}

public class GenericVSLegacy {

    public static void main(String[] args) {
        LegacyBox integerBox = new LegacyBox();
        integerBox.setItem("10");

        //Without casting, compiler doesn't know which data type is coming from getItem()
        //ClassCastException occurs because at compile time, developer doesn't know that this code has some error
        int value = (int) integerBox.getItem();
        System.out.println("Value : " + value);
    }
}
