package org.data;

import java.io.IOException;

import org.base.BaseClass;

public class ExecutableClass extends BaseClass {
	
	public static void main(String[] args) throws IOException {
		
		
		launchBrowser();
		loadUrl("https://www.facebook.com/");
		maxBrowser();
		
		LoginPojo l = new LoginPojo ();
		
		fill(l.getTxtUser(), excelRead(1, 0));
		
		fill(l.getTxtPass(), excelRead(1, 3));
		
		btnClk(l.getBrowseClick());
		
		
		
		
		
		
		
		
		
	}

}
