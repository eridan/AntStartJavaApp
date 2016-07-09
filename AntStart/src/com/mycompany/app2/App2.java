package com.mycompany.app2;

import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;

public class App2 {

	static Logger logger = Logger.getLogger(App2.class);
	
	public static void main(String[] args) {
		BasicConfigurator.configure();
        logger.info("Hello World");          // the old SysO-statement

	}

}
