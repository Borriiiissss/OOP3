import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import chars.Base;
import chars.Monk;
import chars.Peasant;
import chars.Robber;
import chars.Sniper;
import chars.Spearman;
import chars.Wizard;
import chars.Xbowman;
import java.lang.Math;
public class Main {
    
    public static List<Base> listLightSide;
    public static List<Base> listDarkSide;
    
    public static void main(String[] args) {
              
        
        listLightSide = init(1);  
        listDarkSide = init(2);

        ConsoleView.view();
        
        Scanner scanner = new Scanner(System.in);
        while (true){
            ConsoleView.view();
            System.out.println("Press ENTER");
            scanner.nextLine();
        }
                
    }
    public static List<Base> init(int side) {
        List<Base> list = new ArrayList<>();
        list = new ArrayList<>();
        int typeOFHero;
        int x;
        int y;
        for (int i = 0; i < 10; i++) {
            if (side == 1){ 
                typeOFHero = (int) (Math.ceil(Math.random() * 4));
                x = 1;
                y = 1;
            }
            else {
                typeOFHero = (int) ((Math.ceil(Math.random() * 4) + 3));
                x = 10;
                y = 1;
            }

            switch (typeOFHero) {
                case 1:
                    list.add(new Monk(list, x++, y));
                    break;
                case 2:
                    list.add(new Sniper(list, x++, y));
                    break;
                case 3:
                    list.add(new Robber(list, x++, y));
                    break;   
                case 4:
                    list.add(new Peasant(list, x++, y));
                    break;   
                case 5:
                    list.add(new Spearman(list, x++, y));
                    break;  
                case 6:
                    list.add(new Wizard(list, x++, y));
                    break; 
                case 7:
                    list.add(new Xbowman(list, x++, y));
                    break;  
                default:
                    break;
            }           
        }
        System.out.println("сторона " + side);
        list.forEach(System.out::println); // list.forEach(n -> System.out.println(n));
        // String classOfHero = "Monk";
        // printParamsOfHero(list, classOfHero);
        return list;
}

    public static void printParamsOfHero(ArrayList<Base> list, String classOfHero) {
        for (Base s : list) {
            if (s.getName() == classOfHero) {
                System.out.println(s.toString());
            }
        }
    }
    //     Monk monk00 = new Monk();
    //     monk00.getPlayerID();   
}