import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка.

public class task_two {

    public static void main(String[] args) {
        ArrayList<Integer> userArray = new ArrayList<>(Arrays.asList(4 , 11, 3, 5, 6, 33, 75, 32, 88, 9));
        maximum(userArray);
        minimum(userArray);
        arithmeticMean(userArray);
    }



    public static void maximum(ArrayList<Integer> arr){
        Iterator<Integer> iter = arr.iterator();
        int max = arr.get(0);
        while (iter.hasNext()) {
            Integer number = iter.next();
            if (number > max) {
                max = number;
            } 
        }
        System.out.println("максимальное чесло в массиве: " + max);
    }

    public static void minimum(ArrayList<Integer> arr){
        Iterator<Integer> iter = arr.iterator();
        int min = arr.get(0);
        while (iter.hasNext()) {
            Integer number = iter.next();
            if (number < min) {
                min = number;
            } 
        }
        System.out.println("минимальное чесло в массиве: " + min);
    }

    public static void arithmeticMean(ArrayList<Integer> arr){
        Iterator<Integer> iter = arr.iterator();
        Integer sum = 0;
        Integer count = 0;
        while (iter.hasNext()) {
            Integer number = iter.next();
            sum = sum + number; 
            count++;
        }
        Integer result = sum / count;
        System.out.println("среднее арифметическое чесло в массиве: " + result);
    }
}