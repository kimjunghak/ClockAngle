/**
 * Created by kjh on 16. 10. 11.
 */
public class ClockAngle {

    private double hourHand(int hour, int minute){
        double hourAngle = ((hour * 30) + (minute * 0.5))%360;
        return hourAngle;
    }

    private double minuteHand(int minute){
        double minuteAngle = (minute * 6)%360;
        return minuteAngle;
    }

    public double clockAngle(int hour, int minute){
        double hourAngle = hourHand(hour, minute);
        double minuteAngle = minuteHand(minute);
        double angle;

        if(hourAngle > minuteAngle)
            angle = hourAngle - minuteAngle;
        else
            angle = minuteAngle - hourAngle;

        if(angle > 180) {
            angle = angle - 180;
            return angle;
        }

        return angle;
    }
}
