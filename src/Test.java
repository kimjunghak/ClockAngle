import java.util.Scanner;

/**
 * Created by kjh on 16. 10. 11.
 */
public class Test {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        ClockAngle ca = new ClockAngle();

        while(true){
            System.out.println("시간을 입력 하시오 : 시 분");
            int hour = scan.nextInt();
            int minute = scan.nextInt();
            if(hour<0 && hour>12) {
                System.out.println("잘못된 \"시간\" 값");
                break;
            }
            if(minute<0 && minute>60){
                System.out.println("잘못된 \"분\" 값");
                break;
            }

            System.out.println(ca.clockAngle(hour,minute) + "도");
        }
    }
}
