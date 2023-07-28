package pl.slawek.slowa;

import java.util.ArrayList;
import java.util.List;

public class WordsFromJOP {
    List<Word> words = new ArrayList<Word>();

    void addWordToList() {
        words.add(new Word(4, "programistą", 4, 2, "06:43"));
        words.add(new Word(12, "nawykami",3, 3, "00:00"));
    }
}
