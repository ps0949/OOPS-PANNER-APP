public class Oopsbannerapp{

    // Static Inner Class
    static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        // Constructor
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter
        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        // Store patterns
        CharacterPatternMap[] patterns = {
            new CharacterPatternMap('O', new String[]{
                "  ***  ",
                " *   * ",
                "*     *",
                "*     *",
                "*     *",
                " *   * ",
                "  ***  "
            }),
            new CharacterPatternMap('P', new String[]{
                "*****  ",
                "*    * ",
                "*    * ",
                "*****  ",
                "*      ",
                "*      ",
                "*      "
            }),
            new CharacterPatternMap('S', new String[]{
                "***** ",
                "*     ",
                "*     ",
                "***** ", 
                "    * ",
                "    * ",
                "***** "
            })
        };

        String word = "OOPS";

        // Print banner
        for (int row = 0; row < 7; row++) {
            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {
                for (CharacterPatternMap map : patterns) {
                    if (map.getCharacter() == ch) {
                        line.append(map.getPattern()[row]).append("  ");
                    }
                }
            }
            System.out.println(line);
        }
    }
}