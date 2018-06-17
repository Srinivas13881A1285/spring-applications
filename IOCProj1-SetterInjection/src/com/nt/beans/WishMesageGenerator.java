package com.nt.beans;

import java.util.Date;

public class WishMesageGenerator {

	private Date date;
	public void setDate(Date date){
		this.date = date;
	}
	@SuppressWarnings("deprecation")
	public String generateWishMesage(String name) {
		int hour = 0;
		
		hour = date.getHours();
		
		if(hour<12)
			return "Good Morning"+name;
		else if(hour<16)
			return "Good Afternoon"+name;
		else if(hour<=20)
			return "Good Evening"+name;
		else
			return "Good Night "+name;
	}
}
