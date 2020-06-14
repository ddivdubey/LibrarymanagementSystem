package db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConneection implements dbproperties{
    static Connection con = null;
    public static Connection connect(){
        try{
            if(con == null){
                Class.forName(DRIVER);
                con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return con;
    }
            
}
