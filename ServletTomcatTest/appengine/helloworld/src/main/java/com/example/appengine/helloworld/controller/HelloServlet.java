/**
 * Copyright 2015 Google Inc. All Rights Reserved.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.appengine.helloworld.controller;

import com.example.appengine.helloworld.blogic.Check;

import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// [START example]
@SuppressWarnings("serial")
public class HelloServlet extends HttpServlet {

    private static Logger logger = Logger.getLogger(HelloServlet.class.getName());
    private int userLevel = -1;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        logger.log(Level.INFO, "doPost start...");
        logger.log(Level.INFO, "Username: " + request.getParameter("username"));
        logger.log(Level.INFO, "Password: " + request.getParameter("password"));
        logger.log(Level.INFO, "Checkbox: " + request.getParameter("rememberMe"));

        if (userLevel == 0) {
            FileWriter fw = new FileWriter("C:\\Users\\Julius\\IdeaProjects\\ServletTomcatTest\\appengine\\helloworld\\src\\main\\webapp\\txtPost", true);
            //BufferedWriter bw = new BufferedWriter(fw);
            fw.append(request.getParameter("TxtArea") + "\n");
            fw.close();
        }

        Check ch = new Check();
        int check = ch.fetchUser(request.getParameter("username"), request.getParameter("password"));

        if (check == 0) {
            userLevel = 0;
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/admin.jsp");
            dispatcher.forward(request, response);
        }
        else if(check == 1){
            doGet(request, response);
        }
        else {
            userLevel = -1;
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/index.jsp");
            dispatcher.forward(request, response);
        }
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Julius\\IdeaProjects\\ServletTomcatTest\\appengine\\helloworld\\src\\main\\webapp\\txtPost"));
        StringBuffer stringBuffer = new StringBuffer();
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            stringBuffer.append(line);
            stringBuffer.append("\n");
        }
        bufferedReader.close();


        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        String title = "Logget ind som user";
        String docType =
                "<!doctype html public \"-//w3c//dtd html 4.0 " +
                        "transitional//en\">\n";
        out.println(docType +
                "<html>\n" +
                "<head><title>" + title + "</title></head>\n" +
                "<body bgcolor=\"#f0f0f0\">\n" +
                "<h1 align=\"center\">" + title + "</h1>\n" +
                "<ul>\n" +
                "  <li><b>Username</b>: " + request.getParameter("username") + "\n" +
                "  <li><b>Password</b>: " + request.getParameter("password") + "\n" +
                " <li><b>TxtArea</b>: " + "<textArea readonly style=resize:none cols=40 rows=4>" + stringBuffer.toString() + "</textArea>" + "\n" +
                "</ul>\n" +
                "</body></html>");
    }
}
// [END example]


/*
            //fanger mit txtArea
            if (request.getParameter("TxtArea").equals("clear")) {
                this.txt = "";
            } else {
                this.txt = txt + request.getParameter("TxtArea") + "\n";
            }
            */