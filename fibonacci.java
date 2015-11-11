import java.util.Scanner;

class fibonacci { 
	public static void main(String[] args) { 
		int fibonaci_range,intial_element1=0,intial_element2=1,swap_variable;
		System.out.print("Enter range for Fibonacci series:");
		Scanner input = new Scanner(System.in);
		fibonaci_range=input.nextInt();
		System.out.print("Result:"+intial_element1+","+intial_element2);
		for(int i=0;i<fibonaci_range-2;i++) {
			System.out.print(","+(intial_element1+intial_element2));
			swap_variable = intial_element1;
			intial_element1 = intial_element2;
			intial_element2 = intial_element1+swap_variable;
		}
		System.out.print('\n');
	}
}
