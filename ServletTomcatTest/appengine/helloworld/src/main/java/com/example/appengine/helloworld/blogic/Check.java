package com.example.appengine.helloworld.blogic;


import com.example.appengine.helloworld.dao.Database;

/**
 * Created by Julius on 16-09-2016.
 */
public class Check implements bLogicInterface {

    @Override
    public int fetchUser(String name, String password){
        Database db = new Database();
        return db.userData(name, password);
    }
}

/*
public static int isAdmin(String name, String password) throws FileNotFoundException{
        Scanner input = new Scanner(new File("user.txt"));
        while(input.hasNext()){
            if(input.next().equals("user:"))
                if(input.next().equals(name)){
                    if(input.next().equals(password)){
                        return Integer.parseInt(input.next());
                    }
            }
        }
        return -1;
    }
 */

