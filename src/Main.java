import java.util.ArrayList;
/**
 * Created by SnowWave on 2017/6/23.
 */
public class Main {
    public static void main(String[] args) {
        int[] threeNumber = Input.getThreeNumber();
        ArrayList<Object> list =say(threeNumber);
        Output.print(list);
    }

    /**
     * 本题的真正逻辑判断
     * @param threeNumber
     * @return 作为答案的ArrayList
     */
    public static ArrayList<Object> say(int[] threeNumber){
        ArrayList<Object> res = new ArrayList<>(100);
        for(int i = 1 ; i <= 100;i++){

            if(String.valueOf(i).contains(String.valueOf(threeNumber[0]))){
                res.add("Fizz");
            }
            else if(i % threeNumber[0] == 0 && i % threeNumber[1] == 0 && i % threeNumber[2] == 0){
                res.add("FizzBuzzWhizz");
            }else if(i % threeNumber[0] == 0 && i % threeNumber[1] == 0){
                res.add("FizzBuzz");
            }else if(i % threeNumber[0] == 0 && i % threeNumber[2] == 0){
                res.add("FizzWhizz");
            }else if(i % threeNumber[1] == 0 && i % threeNumber[2] == 0){
                res.add("BuzzWhizz");
            }else if(i % threeNumber[0] == 0){
                res.add("Fizz");
            }else if(i % threeNumber[1] == 0){
                res.add("Buzz");
            }else if(i % threeNumber[2] == 0){
                res.add("Whizz");
            }else {
                res.add(i);
            }
        }
        return res;
    }

}
