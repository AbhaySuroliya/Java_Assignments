package com.java.basics;
//import java.util.Scanner;
public class Upper {

	public static void main(String[] args) {
	//Scanner in= new Scanner(System.in);
	String r="";
	String sen="i love java";
	String m[]=sen.split(" ");
	for(String out :m)
	{
		r+=out.substring(0,1).toUpperCase()+out.substring(1,out.length());
		r+=" ";
	}
	System.out.println(r);
	}

}
