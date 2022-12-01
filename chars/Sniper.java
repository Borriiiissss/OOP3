package chars;
import java.util.ArrayList;
import java.util.List;

public class Sniper extends Base {
    public Sniper(List<Base> list, int x, int y) {
        super(12, 10, 32, new int[]{8,10}, 15, 9, false, false, "Sniper");
        super.group = list;
        super.position = new Vector2(x, y);
    }

    @Override
    public void step(ArrayList<Base> group) {

        
    }
}