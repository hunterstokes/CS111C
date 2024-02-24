

package MultipleChoice;

import java.util.*;

public class M2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(7);
        numbers.add(6);
        numbers.add(9);
        numbers.add(8);
        numbers.add(4);
        
        Iterator<Integer> iterator = numbers.iterator();
        while(iterator.hasNext()) {
           int number = iterator.next();
           if(number%2==0) {
              iterator.remove();
           }
        }
        System.out.println(numbers.size());
    }
}