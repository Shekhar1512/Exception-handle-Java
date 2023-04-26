package javaPrograms;

public class TryAndFinally {

	public static void main(String[] args) {
		
		
		try {
			
			int x = 100/0;
			
		}
		
		catch(ArithmeticException e){
			
			System.out.println("not possible");
		}
		finally {
			
			System.out.println("Finally block executed.\n");
		}
		
		System.out.println("after finally");

	}

}
