
public class DemoRecursion {

	public static void main(String[] args) {
		
		//int value = 4;
		System.out.println(factorial(0));
		//System.out.println(value);

	}
	
	private static int factorial(int value) {
		/*value-=1;
		System.out.println(value);*/
		
		//System.out.println(value);
		
		if(value==1) {
			return 1;
		}
		
		else if (value==0) {
			return 1;
		}
		else {
			return (factorial(value-1) * value);
		}
		

		
	}

}
