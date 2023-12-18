package com.vamritech.testcases;

import java.util.Random;

public class Helloworld {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.println("Hello world");
		var email = getSaltString() + "@gmail.com";
		System.out.println(email);
	}

	protected static String getSaltString() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 6) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;

    }
}
