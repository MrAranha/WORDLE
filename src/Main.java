import Enums.TerminalColors;
import GamingModules.Game;
import GamingModules.Tutorial;
import TerminalFeatures.PrintConsole;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        PrintConsole.Print("Bem-vindo ao Wordle! Escolha uma opção para começar.", TerminalColors.ANSI_GREEN);
        Scanner scanner = new Scanner(System.in);
        String Selected = "";
        PrintConsole.Print("1 -> Tutorial", TerminalColors.ANSI_WHITE);
        PrintConsole.Print("2 -> Jogar", TerminalColors.ANSI_BLUE);
        while(!Selected.equals("1") && !Selected.equals("2") && !Selected.equals("3")){
            Selected = scanner.nextLine().trim();
        }

        switch(Selected){
            case "1":
                Tutorial.comecarTutorial();
                break;
            case "2":
                Game.startGame();
                break;
            default:
                break;
        }
    }
}