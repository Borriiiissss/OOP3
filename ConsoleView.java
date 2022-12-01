import java.util.Collections;
import chars.Vector2;

public class ConsoleView {
    public static int step = 0;
    private static final String top10 = formatDiv("a") + String.join("", Collections.nCopies(9, formatDiv("-b"))) + formatDiv("-c");
    private static final String mid10 = formatDiv("d") + String.join("", Collections.nCopies(9, formatDiv("-e"))) + formatDiv("-f");
    private static final String bottom10 = formatDiv("g") + String.join("", Collections.nCopies(9, formatDiv("-h"))) + formatDiv("-i");
    
    public static void view(){
        if (step++ == 0) {
            System.out.println(AnsiColors.ANSI_RED + "First step!" + AnsiColors.ANSI_RESET);
        } else {
            System.out.println(AnsiColors.ANSI_RED + "Step: " + step + AnsiColors.ANSI_RESET);
        }
        System.out.println(ConsoleView.top10);
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(getChar(new Vector2(i, j)));
            }
            System.out.println("\u2502 ");
            System.out.println(ConsoleView.mid10);
        }
        for (int j = 1; j <= 10; j++) {
            System.out.print(getChar(new Vector2(10, j)));
        }
        System.out.println("\u2502");
        System.out.println(ConsoleView.bottom10);      
    }

    private static String getChar(Vector2 position){
        String str = "\u2502 ";
        for (int i = 0; i < 10; i++) {
            if (Main.listDarkSide.get(i).getPosition().isEqual(position)) str ="\u2502" + AnsiColors.ANSI_GREEN+Main.listDarkSide.get(i).getName().toUpperCase().charAt(0) + AnsiColors.ANSI_RESET;

            if (Main.listLightSide.get(i).getPosition().isEqual(position)) str ="\u2502" + AnsiColors.ANSI_BLUE+Main.listLightSide.get(i).getName().toUpperCase().charAt(0) + AnsiColors.ANSI_RESET;

        }
        return str;
    }

    private static String formatDiv(String str){
        return str.replace('a', '\u250c')
                .replace('b', '\u252c')
                .replace('c', '\u2510')
                .replace('d', '\u251c')
                .replace('e', '\u253c')
                .replace('f', '\u2524')
                .replace('g', '\u2514')
                .replace('h', '\u2534')
                .replace('i', '\u2518')
                .replace('-', '\u2500');
    }
}
