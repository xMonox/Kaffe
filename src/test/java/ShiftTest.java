import logic.Controller;
import logic.entity.Shift;

import java.time.LocalDateTime;

public class ShiftTest {
    public void testShiftToString(){
        Controller controller = new Controller();
        Shift shift = controller.createShift(1, LocalDateTime.now(), LocalDateTime.now().plusHours(1));
        System.out.println(shift);
    }
}
