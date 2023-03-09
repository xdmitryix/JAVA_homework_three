import java.util.Iterator;
import java.util.List;

// Пусть дан произвольный список целых чисел, удалить из него чётные числа


public class task_one {

    public static void main(String[] args) {
        
        List<Integer> userList = List.of(20,1,4,54,3,46,7,5);
        Iterator<Integer> iter = userList.iterator();
        while (iter.hasNext()) {
            iter.next();
            if ((iter.next() % 2) == 0) {
                iter.remove();
            } 
        }
        System.out.println(userList);
    }
}
