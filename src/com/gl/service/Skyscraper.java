package com.gl.service;

import java.util.LinkedList;

public class Skyscraper {
	
	public static void Logic(LinkedList<Integer> ab) {
		// Logic for Skyscrapper and the order in which floors are added 
			
			int ValueToSearch = ab.size();
			int day = 1;
			for(int i=0 ; i< ab.size() && day <= ab.size();i++)
			{
				if(day <= ab.size())
				{
					 System.out.println("Day: " + day);
					 day++;
				}
				 if(ab.get(i) == ValueToSearch)
				 {
					 System.out.println(ValueToSearch);	
					 ValueToSearch = ValueToSearch - 1 ;
					 
					 for(int j=0; j<i && ValueToSearch >0;)
					 {						 
						if(ab.get(j) == ValueToSearch)
						 {
							 System.out.println(ValueToSearch);	
							 ValueToSearch = ValueToSearch - 1 ;
							 j = 0;							
						 }
						else
						{
							j++;
						}
					 }					
				 }
				 else
				 {
				 System.out.println("");
				 }
			}	
		
	}		
}
