package com.agile.share.check.Stock;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateString  {

	public DateString()
	{
		
	}
	
    public String updateDateString()
    {   	
    	Date date = new Date();
    	String dt1 = formatDate(date,"dd-MMMM-yyyy");;
    	String dt2 = formatTime(date,"h:mma");
            
    	String str = dt2 +" - " + dt1;
        return str;
    
    }
    
	  private String formatDate(Date date, String format) {
	   SimpleDateFormat form = new SimpleDateFormat("dd MMMM yyyy");
	   return form.format(date);
	  }
	  

	  private String formatTime(Date time, String format) {
	   SimpleDateFormat form = new SimpleDateFormat(format);  
	   return form.format(time);
	  }  
	
	
}
