
import java.util.Scanner;

/**
 * Created by SnowWave on 2017/6/23.
 */
public class Input {
    private static int[] threeNumber = new int[3];
    public static void  getThreeNumber(){
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        if(legalInput(n1)){
            threeNumber[0] = n1;
        }else {
            System.out.println("不合法输入");
        }
        if(legalInput(n2)){
            threeNumber[1] = n2;
        }else {
            System.out.println("不合法输入");
        }
        if(legalInput(n3)){
            threeNumber[2] = n3;
        }else {
            System.out.println("不合法输入");
        }

    }
    public static boolean legalInput(int n){
        if(n>0 && n<10){
            return true;
        }else
            return false;
    }

}
