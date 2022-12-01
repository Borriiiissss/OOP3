package chars;
import java.util.List;

public class Monk extends Base {
    public Monk(List<Base> list, int x, int y) {
        super(12, 7, 0, new int[]{-4,-4}, 30, 5, false, true, "Monk");
        super.group = list;
        super.position = new Vector2(x, y);
    }

    // @Override
    // public void step(ArrayList<Base> group) {
    //     // for (Base player : group) {
    //     //     if (player.getHealth() < 30){
    //     //         player.setHealth(getHealth() - getDamage()[0]);
    //     //     }           
    //     // }
    //     for (int i = 0; i < group.size(); i++) {
    //         if (group.get(i).getHealth() < 30){
                
    //         }           
    //     }
        
    // }
}