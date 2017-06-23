
import java.util.Scanner;

/**
 * Created by SnowWave on 2017/6/23.
 */
public class Input {

    public static int[]  getThreeNumber(){
        int[] threeNumber = new int[3];
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        if(legalInput(n1)){
            threeNumber[0] = n1;
        }else {
           throw new IllegalArgumentException("第一个数是不合法输入");
        }
        if(legalInput(n2)){
            threeNumber[1] = n2;
        }else {
            throw new IllegalArgumentException("第二个数是不合法输入");
        }
        if(legalInput(n3)){
            threeNumber[2] = n3;
        }else {
            throw new IllegalArgumentException("第三个数是不合法输入");
        }
        return threeNumber;
    }

    public static boolean legalInput(int n){
        if(n>0 && n<10){
            return true;
        }else
            return false;
    }

}
