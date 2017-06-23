import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SnowWave on 2017/6/23.
 */
public class Output {
    public static void print(List<Object> list){
        for (Object output: list
             ) {
            System.out.println(output);
        }
    }

    @Test
    public  void testPrint(){
        ArrayList<Object> list = new ArrayList<>();
        list.add(1);
        list.add("Fizz");
        list.add("Buzz");
        list.add(1);
        list.add("FizzBuzzWhizz");
        print(list);
    }
}
