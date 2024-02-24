package ThisAndSuper;

public class ThisStudent {

	int id;  
	String name;  


	ThisStudent(int id,String name){ 
		this.id = id;  
		this.name = name;  
	}
	
	void display(){
		System.out.println(id+" "+name);

	} 
	public static void main(String[] args) {
		System.out.println("main method..........");
		ThisStudent thisStudent = new ThisStudent(1, "demo");
		thisStudent.display();
	}
}
