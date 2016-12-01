package com.example.appengine.helloworld.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Julius on 17-11-2016.
 */
//den virker ikke?
public class PostText extends HttpServlet {
    private static Logger logger = Logger.getLogger(PostText.class.getName());
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        logger.log(Level.INFO, "Username: " + request.getParameter("TxtArea"));
            FileWriter fw = new FileWriter("C:\\Users\\Julius\\IdeaProjects\\ServletTomcatTest\\appengine\\helloworld\\src\\main\\java\\com\\example\\appengine\\helloworld\\controller\\test.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.append(request.getParameter("TxtArea"));
            bw.close();
        }
}
