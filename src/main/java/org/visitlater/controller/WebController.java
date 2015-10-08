package org.visitlater.controller;

import com.google.common.io.ByteStreams;
import com.samskivert.mustache.Mustache;

import static spark.Spark.get;

/**
 * Created by 140179 on 2015-10-07.
 */
public class WebController {
    public WebController() throws Exception {
        get("/", (request, response) -> render("index.html"));
    }

    private String render(String template) {
        String htmlResult;

        try {
            String html = new String(ByteStreams.toByteArray(this.getClass().getResourceAsStream("/webapp/" + template)));
            htmlResult = Mustache.compiler().compile(html).execute(null);
        } catch (Exception e) {
            e.printStackTrace();
            throw new IllegalStateException("render error", e);
        }
        return htmlResult.toString();
    }
}
