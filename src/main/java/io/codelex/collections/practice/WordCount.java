package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WordCount {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/lear.txt";

    public static void countWords(String input) {
        if (input == null || input.isEmpty()) {
            return;
        }
        String[] words = input.split("\\s+");
        System.out.println("Words = " + words.length);
    }

    public static void countLines(Path input) {
        Path path = Path.of(input.toUri());

        long lines = 0;
        try {
            lines = Files.lines(path).count();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Lines = " + lines);
    }

    public static void countChars(Path input) {
        Path path = Path.of(input.toUri());

        long chars = 0;
        try {
            chars = Files.size(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Lines = " + chars);
    }

    public static void main(String[] args) throws IOException, URISyntaxException {
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        String files = Files.readAllLines(path, charset).toString();
        countLines(path);
        countWords(files);
        countChars(path);

    }
}
