package com.test.OOPS;

 class Developer extends Employee1 {

	int bonus = 5000;

	public static void main(String[] args) {

		Developer d = new Developer();

		System.out.println(d.sal);
		System.out.println(d.bonus);
		int total = d.sal+d.bonus;
		
		System.out.println("total sal of the month "+total);

	}

}
