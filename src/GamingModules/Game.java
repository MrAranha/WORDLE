package GamingModules;

import Enums.TerminalColors;
import TerminalFeatures.PrintConsole;

import java.util.Scanner;

public class Game {
    public static void startGame() {
        Scanner scanner = new Scanner(System.in);
        PrintConsole.Print("Nova palavra escolhida! Dê o seu palpite", TerminalColors.ANSI_WHITE);
        PrintConsole.Print(("Tentativas Restantes: " + "5"), TerminalColors.ANSI_WHITE);
        Boolean sucesso = false;

        String PALAVRA_ESCOLHIDA = SelectRandomWord.GetWord();
        for(int i = 0; i < 5; i++) {
            // 0 = errou, 1 = acertou posicao errada, 2 = acertou
            int[] acertos = new int[] { 0, 0, 0, 0, 0};
            String Palpite = "";
            while((Palpite.length() != 5)){
                String palpiteNaoVerificado = scanner.next();
                if(palpiteNaoVerificado.length() == 5) {
                    Palpite = palpiteNaoVerificado;
                }
            }
            for(int j = 0; j < 5; j++) {
                if(Palpite.equals(PALAVRA_ESCOLHIDA)) {
                    PrintConsole.Print("PARABÉNS GANHOU!!!", TerminalColors.ANSI_GREEN);
                    break;
                }
                if(Character.toString(Palpite.charAt(j)).equals(Character.toString(PALAVRA_ESCOLHIDA.charAt(j)))) {
                    acertos[j] = 2;
                    continue;
                };
                if(PALAVRA_ESCOLHIDA.contains(Character.toString(Palpite.charAt(j)))) {
                    acertos[j] = 1;
                    continue;
                }
                acertos[j] = 0;
            }
            PrintConsole.PrintSingleLine("Acertos: ", TerminalColors.ANSI_WHITE );
            for(int j = 0; j < 5; j++) {
                if(acertos[j] == 0){
                    PrintConsole.PrintSingleLine("_", TerminalColors.ANSI_WHITE);
                    continue;
                }
                if(acertos[j] == 1){
                    PrintConsole.PrintSingleLine(Character.toString(Palpite.charAt(j)), TerminalColors.ANSI_YELLOW);
                }
                if(acertos[j] == 2){
                    PrintConsole.PrintSingleLine(Character.toString(Palpite.charAt(j)), TerminalColors.ANSI_GREEN);
                }
            }
            System.out.print("\n");
        }
        PrintConsole.Print(("Palavra Certa: " + PALAVRA_ESCOLHIDA), TerminalColors.ANSI_WHITE);
    }
}
