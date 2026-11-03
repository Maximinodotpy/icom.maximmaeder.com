package ch.fhnw.prog1.exercise.textanalysis;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;

class TextAnalyzer {
    void main(String[] args) throws IOException, URISyntaxException {
        if (args.length != 1) {
            System.err.println("Usage: java textanalysis.ch.fhnw.prog1.exercise.TextAnalyzer <file>");
            return;
        }
        var file = Path.of(ClassLoader.getSystemResource(args[0]).toURI());

        var counter = new WordCounter();
        try (var reader = Files.newBufferedReader(file)) {
            var line = reader.readLine();
            while (line != null) {
                var parts = line.split("[^A-Za-z0-9-]+");
                for (var part : parts) {
                    if (!part.isEmpty()) {
                        counter.add(part);
                    }
                }
                line = reader.readLine();
            }
        }

        IO.println("Results for " + file + ":");
        IO.println("Most frequent word: \"" + counter.topWord() + "\"");
    }
}
