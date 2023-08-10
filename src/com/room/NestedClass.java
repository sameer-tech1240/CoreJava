package com.room;
class It{
	void pythonDeveloper() {
		class Developer{
			
			void javaDeveloper() {
				System.out.println("I am Developer...");
			}
	}
		Developer developer = new Developer();
	    developer.javaDeveloper();
	}
	
      
}
public class NestedClass {
	public static void main(String[] args) {
		It it = new It();
		it.pythonDeveloper();
	}

}
