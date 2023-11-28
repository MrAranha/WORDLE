package GamingModules;

import Enums.TerminalColors;
import TerminalFeatures.PrintConsole;

public class Tutorial {

    public static void comecarTutorial() {
        PrintConsole.Print("O Wordle ou 'Jogo do Termo' é um jogo na qual o jogador terá 5 tentativas para tentar acertar uma palavra de 5 letras exatas, recebendo um feedback de seus acertos, sendo esses, letras amarelas como letras certas porém na posição errada, e letras verdes para letras verdes na posição certa, o jogo informa quais letras foram desclassificadas!", TerminalColors.ANSI_WHITE);
    }
}
