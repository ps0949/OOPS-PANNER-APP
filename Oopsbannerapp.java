
public class Oopsbannerapp {

    // Method to generate the pattern for letter O
    public static String[] getOPattern() {
        return new String[]{
            "  ***  ",
            " *   * ",
            "*     *",
            "*     *",
            "*     *",
            " *   * ",
            "  ***  "
        };
    }

    // Method to generate the pattern for letter P
    public static String[] getPPattern() {
        return new String[]{
            "*****  ",
            "*    * ",
            "*    * ",
            "*****  ",
            "*      ",
            "*      ",
            "*      "
        };
    }

    // Method to generate the pattern for letter S
    public static String[] getSPattern() {
        return new String[]{
            " ***** ",
            " *     ",
            " *     ",
            " ***** ",
            "     * ",
            "     * ",
            " ***** "
        };
    }

    public static void main(String[] args) {

        // Arrays to hold patterns
        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        // Display banner line by line
        for (int i = 0; i < 7; i++) {
            System.out.println(
                oPattern[i] + "   " +
                oPattern[i] + "   " +
                pPattern[i] + "   " +
                sPattern[i]
            );
        }
    }
}