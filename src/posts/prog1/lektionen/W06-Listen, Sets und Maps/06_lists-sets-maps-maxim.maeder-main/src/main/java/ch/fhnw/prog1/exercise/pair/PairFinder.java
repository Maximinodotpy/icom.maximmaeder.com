package ch.fhnw.prog1.exercise.pair;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;

public class PairFinder {

    public boolean hasSum(int goal, String path) {
        var main_reader = openFile(path);
        var nextInt = nextInt(main_reader);
        while (nextInt != null) {
            var second_reader = openFile(path);
            var nextIntSecondReader = nextInt(second_reader);

            while (nextIntSecondReader != null) {
                if (nextInt + nextIntSecondReader == goal) {
                    return true;
                }

                nextIntSecondReader = nextInt(second_reader);
            }

            nextInt = nextInt(main_reader);
        }

        return false;
    }

    private BufferedReader openFile(String path) {
        try {
            return Files.newBufferedReader(Path.of(ClassLoader.getSystemResource(path).toURI()));
        } catch (Exception e) {
            throw new RuntimeException("Can't open file: " + path, e);
        }
    }

    private Integer nextInt(BufferedReader reader) {
        try {
            String line = reader.readLine();
            if (line != null) return Integer.parseInt(line);
            else return null;
        } catch (Exception e) {
            return null;
        }
    }
}
