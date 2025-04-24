package com.uglyeagle.ansiescapecode;

public class AnsiColour {
	// did not choose enum for simplicity
	public static final String BLACK_FG = "\u001B[30m";
	public static final String WHITE_FG = "\u001B[37m";
	public static final String RED_FG = "\u001B[31m";
	public static final String GREEN_FG = "\u001B[32m";
	public static final String BLUE_FG = "\u001B[34m";
	public static final String YELLOW_FG = "\u001B[33m";
	public static final String PURPLE_FG = "\u001B[35m";
	public static final String CYAN_FG = "\u001B[36m";

	public static final String BLACK_BG = "\u001B[40m";
	public static final String WHITE_BG = "\u001B[47m";
	public static final String RED_BG = "\u001B[41m";
	public static final String GREEN_BG = "\u001B[42m";
	public static final String BLUE_BG = "\u001B[44m";
	public static final String YELLOW_BG = "\u001B[43m";
	public static final String PURPLE_BG = "\u001B[45m";
	public static final String CYAN_BG = "\u001B[46m";

	public static final String RESET = "\u001B[0m";

	public static String colourPair(String fgColour, String bgColour) {
		return fgColour + bgColour;
	}

}