import java.util.HashMap;
import java.util.Map;

public class Oopsbannerapp {

    // Function to create and return the pattern map
    public static Map<Character, String[]> createPatternMap() {

        Map<Character, String[]> patternMap = new HashMap<>();

        patternMap.put('O', new String[]{
                "  ***  ",
                " *   * ",
                "*     *",
                "*     *",
                "*     *",
                " *   * ",
                "  ***  "
        });

        patternMap.put('P', new String[]{
                "*****  ",
                "*    *",
                "*    *",
                "*****  ",
                "*      ",
                "*      ",
                "*      "
        });

        patternMap.put('S', new String[]{
                " ***** ",
                " *     ",
                " *     ",
                " ***** ",
                "     * ",
                "     * ",
                " ***** "
        });

        return patternMap;
    }

    // Function to render banner word
    public static void renderBanner(String word, Map<Character, String[]> patternMap) {

        int height = 7; // Number of rows in each character

        for (int row = 0; row < height; row++) {

            for (int i = 0; i < word.length(); i++) {

                char ch = word.charAt(i);

                if (patternMap.containsKey(ch)) {
                    System.out.print(patternMap.get(ch)[row] + "  ");
                } else {
                    System.out.print("        "); // space if char not found
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Map<Character, String[]> patternMap = createPatternMap();

        String word = "OOPS";

        renderBanner(word, patternMap);
    }
}