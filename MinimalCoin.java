package com.cap;
import java.util.*;
public class MinimalCoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a;
		int b=0,c=0,d=0,e=0,f=0,g=0;
		a=sc.nextInt();
		
		if(a>0)
		{
			while(a>0)
			{
				if(a -500 >= 0)
				{
					b++;
					a=a-500;
				}
				else if(a-100 >= 0)
				{
						c++;
						a=a-100;
				}
				else if(a-50 >=0)
				{
					d++;
					a=a-50;
				}
				else if(a-10 >=0)
				{
					e++;
					a=a-10;
				}
				else if(a-5 >=0)
				{
					f++;
					a=a-5;
				}
				else 
				{
					g++;
					a=a-1;
				}
			}
			System.out.println(b + c + d + e + f + g);
		}
		else
		{
			System.out.println("Invalid input");
		}
	}

}
