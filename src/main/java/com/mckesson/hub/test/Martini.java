package com.mckesson.hub.test;

/**
 * Martini takes a size paraemeter and generates a Martini glass in ascii art.
 *
 */
public class Martini implements Glass {

    private final int size;
    private final int calculatedWidth;

    public Martini(int size) {
        if (size < 1) {
            throw new RuntimeException("A Martini must be of size 1 or greater");
        }

        this.size = size;
        calculatedWidth = calculateWidth(size);
    }

    /**
     * Prints the entire glass
     */
    public String generateGlass() {

        return printBowl(size, 0, '0') +
            printStem(size, size - 1, '|') +
            buildLine('=', calculatedWidth, 0);
    }

    /**
     * Prints a vertical character simulating the stem of a martini glass
     * @param rows - determines the number of rows
     * @param spaces - how many spaces are generated to center the stem
     * @param character - the character used to depict the stem
     * @return String
     */
    private String printStem(int rows, int spaces, char character) {

        StringBuilder stem = new StringBuilder();

        stem.append(buildLine(character, 1, spaces) + "\n");
        if (rows - 1 >= 1) {
            stem.append(printStem(rows - 1, spaces, character));
        }

        return stem.toString();
    }

    /**
     * Prints your character in a descending V shape simulating the bowl of a martini glass
     * @param rows - determines the number of rows
     * @param spaces - how many spaces are prefixed to center the graphic
     * @param character - the character used to depict the bowl
     * @return String
     */
    private String printBowl(int rows, int spaces, char character) {

        StringBuilder glass = new StringBuilder();
        glass.append(buildLine(character, calculateWidth(rows), spaces) + "\n");

        if (rows - 1 >= 1) {
            glass.append(printBowl(rows - 1, spaces + 1, character));
        }

        return glass.toString();
    }

    /**
     * Builds a single line of text
     * @param character - character to print
     * @param columns - number of times to print the character consecutively
     * @param spaces - whitespace prefixing the character
     * @return String
     */
    private String buildLine(char character, int columns, int spaces) {

        StringBuilder row = new StringBuilder();

        for (int s = 0; s < spaces; s++) {
            row.append(' ');
        }

        for (int x = 0; x < columns; x++) {
            row.append(character);
        }

//        row.append("\n");
        return row.toString();
    }

    private int calculateWidth(int size) {
        return (size * 2) - 1;
    }

    public static void main(String[] args) {

        if (args.length == 0) {
            throw new RuntimeException("Please pass the size of the martini glass as an interger argument.");
        }

        Martini martini = new Martini(Integer.parseInt(args[0]));
        System.out.println(martini.generateGlass());
    }

}