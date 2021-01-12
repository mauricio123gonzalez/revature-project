package com.blue_bank.main;

import java.util.Scanner;

import org.apache.log4j.Logger;

import com.blue_bank.model.Users;
import com.blue_bank.service.UsersSearchService;


public class BlueBankMain {
	
	public static Logger log=Logger.getLogger(BlueBankMain.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int ch=0;
		//int uid = Integer.parseInt(sc.nextLine());
		//BlueBankSearch
		do {
			try {
				log.info("Welcome to the BlueBank official app!");
				log.info("--------------------------------------------");
				log.info("Please choose Log in to log in or Exit to exit the app");
				log.info("1) Log in");
				log.info("2) Exit");

				ch=Integer.parseInt(sc.nextLine());
			}catch(NumberFormatException e) {
				
			}
			switch (ch) {
			case 1: 
				log.info("Please enter your username");
				log.info("---------------------------------------------");
				
				break;
			case 2:
				log.info("Thank you for using the BlueBank Official app!");
				log.info("Shutting down...");

				return;
				//break;
			}
		}while(ch!=5);


	}
	
}
