package pl.slawek.slowa;

import java.util.ArrayList;
import java.util.List;

public class WordsFromJOP {
    List<Word> words = new ArrayList<Word>();

    void addWordToList() {
        words.add(new Word(8,"",0,0,"00:00"));
        words.add(new Word(4, "programistą", 4, 2, "06:43"));
        words.add(new Word(12, "nawykami",3, 3, "00:00"));
        words.add(new Word(1, "Nie", 5, 2, "01:00"));
        words.add(new Word(10, "ze", 8, 7, "00:33"));
    }
}
