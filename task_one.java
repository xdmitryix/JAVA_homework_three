import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

// Пусть дан произвольный список целых чисел, удалить из него чётные числа


public class task_one {

    public static void main(String[] args) {
        
        ArrayList<Integer> userList = new ArrayList<>(Arrays.asList(10 , 4, 3, 5, 6, 75, 32, 51));
        Iterator<Integer> iter = userList.iterator();
        while (iter.hasNext()) {
            Integer x = iter.next();
            if ((x % 2) == 0) {
                iter.remove();
            } 
        }
        System.out.println(userList);
    }
}
