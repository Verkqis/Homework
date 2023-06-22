package io.codelex.travia;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class FormattingService {

    public Map<Integer, String> formattingService() {

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://numbersapi.com/random/trivia"))
                .build();

        Map<Integer, String> gameQuestions = new HashMap<>();

        while (gameQuestions.size() < 20) {
            CompletableFuture<HttpResponse<String>> response = client.sendAsync(request, HttpResponse.BodyHandlers.ofString());

            response.thenApply(HttpResponse::body)
                    .thenAccept(body -> processHelper(body, gameQuestions))
                    .join();
        }

        return gameQuestions;
    }

    private void processHelper(String response, Map<Integer, String> gameQuestions) {
        String[] parts = response.split(" ", 2);
        if (parts.length >= 2) {
            try {
                int key = Integer.parseInt(parts[0]);
                if (key != 0) {
                    String value = "What " + parts[1].trim().replace(".", "?");
                    gameQuestions.put(key, value);
                }
            } catch (NumberFormatException e) {
                System.out.println();
            }
        }
    }


}
