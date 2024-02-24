package com.test.OOPS;

public  class MethodOverloading {


	public void sum() {
	}


	public int sum(int a) {
		System.out.println(a);
		return a;
	}


	public int sum(int b , int c) {
		int d = b+c;
		System.out.println(d);
		return b+c;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading mo = new MethodOverloading();
		mo.sum();
		mo.sum(20);
		mo.sum(10,20);

	}

}
