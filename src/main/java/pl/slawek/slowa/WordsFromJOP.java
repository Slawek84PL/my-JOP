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
        words.add(new Word(9, "programistą", 8, 10, "02:00"));
        words.add(new Word(7, "prostu", 9, 4, "03:17"));
        words.add(new Word(11, "świetnymi", 10, 7,"05:57"));
        words.add(new Word(1, "Każdy", 1, 2, "00:12"); //EAI
    }
}
