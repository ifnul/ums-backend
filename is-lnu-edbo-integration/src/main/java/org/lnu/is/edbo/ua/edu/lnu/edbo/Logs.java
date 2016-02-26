package org.lnu.is.edbo.ua.edu.lnu.edbo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Logs
{
    private static Logs logs;
    private final String S = "file.log";

    public static Logs Instanse()
    {
        return logs==null?logs = new Logs():logs; 
    }

    public void Print(String massage)
    {
    	try {
    		BufferedWriter file = new BufferedWriter(new FileWriter(S, true));
        	file.write(Main.getActualDate()+":"+massage+"\r\n");
			file.close();
    	} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        	
    }
}
