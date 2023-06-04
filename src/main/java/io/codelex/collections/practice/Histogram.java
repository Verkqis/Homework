package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Histogram {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/midtermscores.txt";


    public static void main(String[] args) throws IOException, URISyntaxException {

        final String scores = fileContent();

        String[] formatted = scores.split("\\s+");
        int length = formatted.length;
        int[] numbers = new int[length];
        for (int i = 0; i < length; i++) {
            numbers[i] = Integer.parseInt(formatted[i]);
        }

        int base10 = -1;

        for (int i = 0; i < 10; i++) {
            System.out.print(String.format("%02d-%02d: ", base10 + 1, base10 + 10));
            for (int j = 0; j < length; j++) {
                if (numbers[j] >= (base10 + 1) && numbers[j] <= (base10 + 10)) {
                    System.out.print("*");
                    numbers[j]--;
                }
            }
            System.out.println();
            base10 += 10;

        }
    }

    private static String fileContent() throws URISyntaxException, IOException {
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        return Files.readAllLines(path, charset).stream()
                .findFirst()
                .orElseThrow(IllegalStateException::new);
    }
}
