package com.blue_bank.main;

import java.util.Scanner;

import org.apache.log4j.Logger;

import com.blue_bank.model.Users;
import com.blue_bank.service.UsersCRUDService;

public class BlueBankMain {

	public static Logger log = Logger.getLogger(BlueBankMain.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int ch = 0; // login or exit
		int ch0 = 0; // employee or customer selection
		int ch1 = 0; // customer selection after login
		int ch2 = 0; // employee selection after login
		String typeEntered = "";
		String userNameEntered = "";
		String passWordEntered = "";
		// int uid = Integer.parseInt(sc.nextLine());
		// BlueBankSearch
		do {
			try {
				log.info("--------------------------------------------");
				log.info("Welcome to the BlueBank official app!");
				log.info("--------------------------------------------");
				log.info("Please log in or exit the app by making the appropriate selection below");
				log.info("1) Log in");
				log.info("2) Exit");

				ch = Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException e) {

			}
			switch (ch) {
			case 1:
				log.info("Please type 1 for customer or 2 for employee");
				ch0=0;
				ch0 = Integer.parseInt(sc.nextLine());
				log.info("Please enter your username");
				userNameEntered = sc.nextLine();
				log.info("Please ener your password");
				passWordEntered = sc.nextLine();
				do {

					switch (ch0) {
					case 1:
						log.info("Hello customer " +userNameEntered+",what would you like to do today?");
						log.info("1: View account");
						log.info("2: Create account");
						log.info("3: Withdraw from account");
						log.info("4: Deposit into account");
						log.info("5: Transfer money to another account");
						log.info("6: Accept pending money transfers");
						ch0=0;
						ch1=Integer.parseInt(sc.nextLine());
						do {
							
							switch(ch1) {
							case 1:
								log.info("view account");
								ch1=0;
								break;
							case 2:
								break;
							case 3:
								break;
							case 4:
								break;
							case 5:
								break;
							case 6:
								break;
							}
							
						}while(ch1!=7);
						
						break;
					case 2:
						log.info("Hello employee " +userNameEntered+", what would you like to do today?");
						log.info("1: Approve or reject pending accounts");
						log.info("2: View customer account");
						log.info("3: View all transactions");
						ch0=0;
						ch2=Integer.parseInt(sc.nextLine());
						do {
							switch(ch2) {
							case 1:
								log.info("aorpa");
								ch2=0;
								break;
							case 2:
								break;
							case 3:
								break;
							}
						}while(ch2!=3);
						break;
					}

				} while (ch0 != 3);
				break;

			case 2:
				log.info("Thank you for using the BlueBank Official app!");
				log.info("Shutting down...");

				return;
			// break;
			}
		} while (ch != 3);

	}

}
