/**
 * Created by KJH on 2016-10-12.
 */
public class Floor {

    public int floor(int num){
        int indices = -1;
        int under = 1;
        int count = 0;

        while(under <= num){
            indices++;
            under = under * 2;
            count++;
        }

        System.out.println("Normal floor한 값은 : " + indices);
        System.out.println("Normal 시행 횟수 : " + count);

        return indices;
    }

    public int floorBinary(int num){
        int indices = 1;
        long under = 2;
        int count = 0;

        while(under <= num){
            indices = indices * 2;
            under = under * under;
            count++;
        }

        int low = indices / 2;
        int high = indices;
        while(true){
            int mid = (low + high) / 2;
            if(Math.abs(low - high) <= 1) {
                indices = mid;
                break;
            }
            if(num < (int)Math.pow(2, mid))
                high = mid;
            else
                low = mid;
            count++;
        }

        System.out.println("Binary floor한 값은 : " + indices);
        System.out.println("Binary 시행 횟수 : " + count);

        return indices;
    }
}
