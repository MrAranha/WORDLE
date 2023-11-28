package GamingModules;

import DTO.AllWords;

import java.util.Random;

public class SelectRandomWord {
    public static String GetWord() {
        String[] allWords = AllWords.getAllWords();
        Random rand = new Random();
        int n = rand.nextInt(5008);
        return allWords[n];
    }
}
