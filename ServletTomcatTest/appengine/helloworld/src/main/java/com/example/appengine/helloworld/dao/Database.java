package com.example.appengine.helloworld.dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Julius on 17-11-2016.
 */
public class Database implements DaoInterface{

    @Override
    public int userData(String name, String password) {
        try {
            Scanner input = new Scanner(new File("C:\\Users\\Julius\\IdeaProjects\\ServletTomcatTest\\appengine\\helloworld\\src\\main\\webapp\\user.txt"));
            while (input.hasNext()) {
                if (input.next().equals(name)) {
                    if (input.next().equals(password)) {
                        return Integer.parseInt(input.next());
                    }
                }
            }
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        return -1;
    }
}
