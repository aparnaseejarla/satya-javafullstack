package com.test.properties;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;

public class CreateProperties {


	public static void main(String[] args) throws Exception
	{
		// create an instance of Properties
		Properties p = new Properties();

		// add properties to it
		p.setProperty("name", "Ganesh Chowdhary");
		p.setProperty("email",
				"ganeshs.gfg@gmail.com");

		// store the properties to a file
		p.store(new FileWriter("info.properties"),
				" Properties Example");
		
		
		//Reading properties from propertiy files		
		// create a reader object on the properties file
        FileReader reader = new FileReader("info.properties");
  
        // create properties object
        Properties readProps = new Properties();
  
        // Add a wrapper around reader object
        readProps.load(reader);
  
        // access properties data
        System.out.println(readProps.getProperty("name"));
        System.out.println(readProps.getProperty("email"));
    }		
	}

