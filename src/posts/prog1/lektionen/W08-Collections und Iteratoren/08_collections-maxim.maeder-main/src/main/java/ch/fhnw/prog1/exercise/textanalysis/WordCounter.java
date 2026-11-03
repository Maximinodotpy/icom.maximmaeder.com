package ch.fhnw.prog1.exercise.textanalysis;

import java.util.HashMap;

public class WordCounter {
    HashMap wordsCounted = new HashMap();

    public void add(String word) {
        // TODO: add `word` to your data structure
        if (this.wordsCounted.containsKey(word)) {
            this.wordsCounted.put(word, this.wordsCounted.get(word));
        } else {
            this.wordsCounted.put(word, 1);
        }
    }

    public String topWord() {
        // TODO: return the word most frequently occurring in your data structure

        int maxNum = 0;
        String maxWord = "";
        for (var word: this.wordsCounted.keySet().toArray(new String[0])) {
            IO.println(word);
        }

        return "";
    }
}
