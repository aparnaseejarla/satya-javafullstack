package com.test.arrays;

public class CreatingArrayUsingNewKeyWord {


	public static void main(String[] args) {


		int a[]=new int[5];//declaration�and�instantiation��
		a[0]=10;//initialization��
		a[1]=20;
		a[2]=70;
		a[3]=40;
		a[4]=50;
		System.out.println(a[4]);
		//System.out.println(a.length);

		for(int i=0;i<a.length;i++)//length�is�the�property�of�array
			System.out.println(a[i]);
	}
}
