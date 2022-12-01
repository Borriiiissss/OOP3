package chars;
import java.util.ArrayList;
import java.util.List;

public class Robber extends Base{
    public Robber(List<Base> list, int x, int y) {
        super(8, 3, 0, new int[]{2,4}, 10, 6, false, false, "Robber");
        super.group = list;
        super.position = new Vector2(x, y);
    }

    @Override
    public void step(ArrayList<Base> group) {

        
    }
}