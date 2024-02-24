package com.test.methods;

public final class ProductInstanceMethod {
	
	private final int pid=10;
	private String pname;
	private static String item;
	
	static {
		System.out.println("this is static block while loading the class");
		
	}
	

	public static String getProdcutName(String pname){
		System.out.println(pname);
		return pname;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ProductInstanceMethod pm = new ProductInstanceMethod();
		//pm.getProdcutName("Sony");
		System.out.println("This is main method");
		ProductInstanceMethod.getProdcutName("HP");
		System.out.println(pm.pid);

	}

}
