package TerminalFeatures;

import Enums.TerminalColors;

public class PrintConsole {
    public static void Print(String mensagem, TerminalColors color) {
        System.out.println(getColor(color) + mensagem + "\u001B[0m");
    }
    public static void PrintSingleLine(String mensagem, TerminalColors color) {
        System.out.print(getColor(color) + mensagem + "\u001B[0m");
    }
    private static String getColor(TerminalColors color) {
        switch(color) {
            case ANSI_BLACK:
                return "\u001B[30m";
            case ANSI_RED:
                return "\u001B[31m";
            case ANSI_GREEN:
                return "\u001B[32m";
            case ANSI_YELLOW:
                return "\u001B[33m";
            case ANSI_BLUE:
                return "\u001B[34m";
            case ANSI_PURPLE:
                return "\u001B[35m";
            case ANSI_CYAN:
                return "\u001B[36m";
            case ANSI_WHITE:
                return "\u001B[37m";
            default:
                return "";
        }
    }
}
