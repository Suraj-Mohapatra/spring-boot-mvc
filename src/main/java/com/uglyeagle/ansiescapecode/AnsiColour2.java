package com.uglyeagle.ansiescapecode;

public enum AnsiColour2 {
	
	BLACK_FG("\u001B[30m"),
    WHITE_FG("\u001B[37m"),
    RED_FG("\u001B[31m"),
    GREEN_FG("\u001B[32m"),
    BLUE_FG("\u001B[34m"),
    YELLOW_FG("\u001B[33m"),
    PURPLE_FG("\u001B[35m"),
    CYAN_FG("\u001B[36m"),
 
    BLACK_BG("\u001B[40m"),
    WHITE_BG("\u001B[47m"),
    RED_BG("\u001B[41m"),
    GREEN_BG("\u001B[42m"),
    BLUE_BG("\u001B[44m"),
    YELLOW_BG("\u001B[43m"),
    PURPLE_BG("\u001B[45m"),
    CYAN_BG("\u001B[46m"),
    
    RESET("\u001B[0m");
 
    private final String code;
 
    AnsiColour2(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
    
    public static String add(AnsiColour2 fgColor, AnsiColour2 bgColor) {
    	return fgColor.getCode()+bgColor.getCode();
    	//return "";
    }
 
    @Override
    public String toString() {
        return code;
    }
}