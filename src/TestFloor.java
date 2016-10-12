import java.util.Scanner;

/**
 * Created by KJH on 2016-10-12.
 */
public class TestFloor {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        Floor f = new Floor();

        System.out.println("숫자를 입력하세요");
        int num = scan.nextInt();

        f.floor(num);
    }
}
