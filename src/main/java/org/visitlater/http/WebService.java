package org.visitlater.http;


import org.eclipse.jetty.http.HttpStatus;
import org.visitlater.controller.WebController;

import static spark.Spark.*;

/**
 * Created by 140179 on 2015-10-06.
 */
public class WebService {

    public static final int PORT = 3000;

    public static void main(String[] args) {
        // Port설정
        port(PORT);

        // static 파일 경로 설정
        staticFileLocation("/webapp");

        try {
            new WebController();
        } catch (Exception e) {
            throw new RuntimeException("Failed to start server", e);
        }
    }
}
