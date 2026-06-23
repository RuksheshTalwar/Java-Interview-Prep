package interview.questions.comparable;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortingExamples {
    public static void main(String[] args) {
//        Integer[] arr = {17, 18, 23, 28, 4, 6, 9};
//        Arrays.sort(arr, (val1, val2) -> val1 - val2);
//        Arrays.sort(arr);

        Car[] carArray = new Car[3];
        carArray[0] = new Car("suv", "petrol");
        carArray[1] = new Car("sedan", "diesel");
        carArray[2] = new Car("hatchback", "electric");

        Arrays.sort(carArray, (Car obj1, Car obj2) -> obj1.carName.compareTo(obj2.carName)); //Ascending lexicographical order for String
        for (Car car : carArray) {
            System.out.println(car.carName + ".." + car.carType);
        }
    }

    static class Car {
        private String carName;
        private String carType;

        public Car(String carName, String carType) {
            this.carName = carName;
            this.carType = carType;
        }
    }



}
