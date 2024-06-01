package Maincode.logger;

//import menu.Menu;
//import org.apache.logging.log4j.*;
import java.io.*;
import java.util.Date;
import java.util.logging.Logger;
import org.reldb.dbLogger.*;
import org.reldb.dbLogger.Log;
import org.reldb.dbLogger.SQLiteDatabase;
import Maincode.emailsender.*;


public  class LOGGER {
    //public static java.util.logging.Logger LOGGER;
    public static void info(String inf){
        try{
            long currentTimeInMillis = System.currentTimeMillis();
            Date currentDate = new Date(currentTimeInMillis);
            String currentDateTime = currentDate.toString();
            //var db = new SQLiteDatabase("C:/Games/sqlite/mylogs.sqlite");
            var db = new SQLiteDatabase("mylogs.sqlite");

            var loggerdb = new org.reldb.dbLogger.Logger(db.getConnection(),"logs");
            Log.log("DATE",currentDateTime)
                    .log("LEVEL","INFO")
                    .log("MESSAGE",inf)
                    .insert(loggerdb);
            System.out.println("done");

        }
        catch (Exception e){
            System.out.println(e);
        }}
    public static void fatal(String inf){
        try{
            EmailSender.send("anyemail@gmail.com",inf);
        }
        catch (Exception e){

        }}
        public static void warning(String inf){
            try{
                long currentTimeInMillis = System.currentTimeMillis();
                Date currentDate = new Date(currentTimeInMillis);
                String currentDateTime = currentDate.toString();
                var db = new SQLiteDatabase("C:/Games/sqlite/mylogs.sqlite");
                var logger = new org.reldb.dbLogger.Logger(db.getConnection(),"testlog");
                Log.log("DATE",currentDateTime)
                        .log("Warning","INFO")
                        .log("MESSAGE",inf)
                        .insert(logger);
                System.out.println("done");

            }
            catch (Exception e){

            }


}}
