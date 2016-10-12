/**
 * Created by KJH on 2016-10-12.
 */
public class Floor {

    public void floor(int num){
        int indices = -1;
        int under = 1;
        int count = 0;

        while(under <= num){
            indices++;
            under = under * 2;
            count++;
        }
        System.out.print("시행 횟수 : " + count);
    }
}
