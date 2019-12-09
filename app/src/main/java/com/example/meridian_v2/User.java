package com.example.meridian_v2;

public class User {

    private String username = "";
    private String password = ""; //TODO create hashtable to securely store password
    //TODO maybe create variable that store whatever Salesforce's unique employee identifier is.


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean checkForUser(){

        return true;

        //TODO Write function that will check phone to see if a user folder has been created. If so user will be logged in using the loginUser() function; Otherwise the user will have a new folder created.

    }

    public void createFolder(){

        //TODO Write function that creates folder from stored username for user AFTER they are authenticated to Salesforce and checkForUser() is run.

    }

    public void loginUser(){

        //TODO Write function that attempts to log user in with the provided credentials after checking the network status

    }

    public boolean checkConnection(){

        //TODO write function that verifies connection to SalesForce server

        return true;
    }

}
