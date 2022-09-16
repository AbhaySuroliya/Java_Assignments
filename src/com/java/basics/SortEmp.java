package com.java.basics;

import java.util.Scanner;

public class SortEmp {

	public static void main(String[] args) {
		
		Scanner s1=new Scanner(System.in);
		Emp[] EmpArr=new Emp[3];
		for(int i=0;i<EmpArr.length;i++)
		{
			System.out.println("Enter Details of Employee(name,Id,experience)");
			EmpArr[i]=new Emp(s1.next(),s1.nextInt(),s1.nextInt());
		}
		
		for(int i=0;i<EmpArr.length;i++)
		{
			for(int j=i+1;j<EmpArr.length;j++)
			{
				if(EmpArr[i].getExperi()<EmpArr[j].getExperi())
				{
					Emp e=EmpArr[j];
					EmpArr[j]=EmpArr[i];
					EmpArr[i]=e;
					
				}
			}
		}
		for(int i=0;i<EmpArr.length;i++)
		{
			System.out.println(EmpArr[i]);
		}
      s1.close();
	}

}