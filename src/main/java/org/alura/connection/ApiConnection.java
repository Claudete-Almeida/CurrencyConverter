package org.alura.connection;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class ApiConnection {
    private HttpClient httpClient = null;
    private String baseUrl = null;
    Gson gson;

    public ApiConnection (String baseUrl) {
        this.baseUrl = baseUrl;
        this.gson = new Gson();
        this.httpClient = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_1_1)
                .followRedirects(HttpClient.Redirect.NORMAL)
                .connectTimeout(Duration.ofSeconds(60))
                .build();
    }

    public <T> T createRequest (String url, Class<T> reference) {
        try {
            HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create((this.baseUrl + url)))
                .build();

            HttpResponse<String> response;

            response = this.httpClient
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return this.gson.fromJson(response.body(), reference);

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
