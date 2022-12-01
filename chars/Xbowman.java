package chars;
import java.util.ArrayList;
import java.util.List;

public class Xbowman extends Base {
    public Xbowman(List<Base> list, int x, int y) {
        super(6, 3, 16, new int[]{2,3}, 10, 4, false, false, "Xbowman");
        super.group = list;
        super.position = new Vector2(x, y);
    }

    @Override
    public void step(ArrayList<Base> group) {       
    }
}