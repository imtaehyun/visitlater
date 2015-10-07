package org.visitlater.controller;
import org.eclipse.jetty.http.HttpStatus;

import static spark.Spark.*;

/**
 * Created by 140179 on 2015-10-07.
 */
public class WebController {
    public WebController() {
        get("/", (request, response) -> {
            response.redirect("/index.html");
            return HttpStatus.OK_200;
        });
    }
}
