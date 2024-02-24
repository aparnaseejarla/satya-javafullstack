package com.test.OOPS;

public class LICCompany implements AgentInterface {
	
	@Override
	public int service() {
		int count = 12;
     System.out.println("this returning the name of agents "+agentName);
     System.out.println("this returning the count of agents "+count);
		return count;
	}
	
	public static void main(String[] args) {
		
		LICCompany lic = new LICCompany();
		lic.service();
	}

}
