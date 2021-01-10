package org.kiosk.util;

import java.util.Scanner;

import lombok.Setter;
@Setter
public class BaseUI {
	
	private Scanner scanner;
	
	protected void print(String msg) {
		System.out.println(msg);
	}
	
	protected String inputStr(String msg) {
		System.out.println(msg);
		return scanner.nextLine();
	}
	
	protected int inputInt(String msg) {
		System.out.println(msg);
		return Integer.parseInt(scanner.nextLine());
	}
	
	protected double inputDouble(String msg) {
		System.out.println(msg);
		return Double.parseDouble(scanner.nextLine());
	}

}
