import java.util.Scanner;

class DivisibleByZeroException extends Exception {
    String msg;
	
	public DivisibleByZeroException(String message) {
	    this.msg = message;
	}
	
	public String getMessage() {
	    return msg;
	}
}

public class Main {
    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		
		try {
		    System.out.print("enter numerators: ");
			int a = sc.nextInt();
			System.out.print("enter denominator: ");
			int b = sc.nextInt();
			
			if (b == 0) {
			    throw new DivisibleByZeroException("cannot divide by zero!");
			}
			
			int result = a/b;
			System.out.println("result = " + result);
			
		} catch (DivisibleByZeroException e) {
		    System.out.println("caught exception: " + e.getMessage());
		} finally {
		    System.out.println("finally block executed.");
			sc.close();
		}
	}
}