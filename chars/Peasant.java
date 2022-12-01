package chars;
import java.util.ArrayList;
import java.util.List;

public class Peasant extends Base {

    public Peasant(List<Base> list, int x, int y) {
        super(1, 1, 0, new int[]{1,1}, 1, 3, true, false, "Peasant");
        super.group = list;
        super.position = new Vector2(x, y);
    }

    @Override
    public void step(ArrayList<Base> group) {

        
    }
}