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
		int uid = Integer.parseInt(sc.nextLine());
//		Users users=UsersSearchService.getUserByID(uid);
		System.out.println("1");
		//BlueBankSearch
		do {
			try {
				ch=Integer.parseInt(sc.nextLine());
			}catch(NumberFormatException e) {
				
			}
			switch (ch) {
			case 1: 
				break;
			case 2: 
				break;
			case 3: 
				break;
			case 4: 
				break;
			}
		}while(ch!=5);


	}
	
}
