import java.util.HashMap;

public class IDandPasswords {

    //storing two strings id and a password
    HashMap<String,String> logininfo = new HashMap<String,String>();

    //create a constructor for id and password
    IDandPasswords(){
        logininfo.put("Jason", "Apple");
        logininfo.put("Tom", "tomato");
        logininfo.put("Zack", "orange");
    }
    //create a getter method so any class can request it and use protected since it contains id/password


    protected HashMap<String, String> getLogininfo() {
        return logininfo;
    }
}
