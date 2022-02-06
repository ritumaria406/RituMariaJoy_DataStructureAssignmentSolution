package com.gl.Driver;

import java.util.LinkedList;

import com.gl.service.Skyscraper;
import java.util.Scanner;

public class SkyscraperDriver {

	static Scanner sc = new Scanner(System.in);
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			LinkedList<Integer> floorsPerDay = new LinkedList<Integer>();
			
			System.out.println("enter the total no of floors in the building");
			int numberOfFloors = sc.nextInt();
			
			for(int i=0; i<numberOfFloors ; i++)
			{
				System.out.println("enter the floor size given on day :"+ (i+1));
				floorsPerDay.add(sc.nextInt()); 
			}		
			
			System.out.println("The order of construction is as follows");
			Skyscraper.Logic(floorsPerDay);
		}

	

}
