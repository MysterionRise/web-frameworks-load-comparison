package org.clayman.comparison.vertx;

import io.vertx.core.Vertx;
import io.vertx.core.http.HttpServer;
import io.vertx.ext.web.Router;

public class Launcher {

    public static void main(String[] args) {
        Vertx vertx = Vertx.vertx();
        HttpServer server = vertx.createHttpServer();

        Router router = Router.router(vertx);
        router.get("/ping").handler(event -> {
            event
                    .response()
                    .putHeader("content-type", "text/html")
                    .setStatusCode(200)
                    .end("OK");
        });

        server.requestHandler(router::accept).listen(8080);
    }
}
