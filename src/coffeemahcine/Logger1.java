/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coffeemahcine;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;




/**
 *
 * @author MoMO
 */

public class Logger1{
   public static Logger logger;
   String filename="Log.txt";
   File f =new File(filename);
   
   public Logger1() throws IOException
   {
        if (!f.exists( ))
        {
            f.createNewFile();
        }
        FileHandler fh = new FileHandler(filename,true);
        logger = Logger.getLogger("FileLogger");
        logger.addHandler(fh);
        SimpleFormatter formatter=new SimpleFormatter();
        fh.setFormatter(formatter);
        
        
    }

    /**
     *
     * @param Msg
     */
    public static void LogInfo(String Msg)
   {
       logger.info(Msg);
       
   }
    public static void LogWarning(String Msg){
        logger.warning(Msg);
    }
}
