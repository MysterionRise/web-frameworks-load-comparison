package org.clayman.comparison.vertx;

import io.vertx.core.Vertx;
import io.vertx.core.http.HttpServer;
import io.vertx.ext.web.Router;

import java.util.Random;

public class Launcher {

    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        Vertx vertx = Vertx.vertx();
        HttpServer server = vertx.createHttpServer();

        Router router = Router.router(vertx);
        router.get("/ping").handler(event -> {
            event
                    .response()
                    .putHeader("content-type", "text/plain")
                    .setStatusCode(200)
                    .end(String.valueOf(RANDOM.nextInt()));
        });

        server.requestHandler(router::accept).listen(8080);
    }
}
