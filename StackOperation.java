import java.util.Scanner;

class StackOperation {
	void push_operation(int element) {
		array_element[array_size] = element;
		array_size +=1;
	}
	void pop_operation() {
		array_element[array_size-1] = 0;
		array_size -=1;
	}
	void stack_display() {
		if(array_size == 0) {
			System.out.println("Stack Empty!");
		}
		else {
			System.out.println("Stack Element:");
			for(int i=0;i<array_size;i++) {
				System.out.print(array_element[i]+"	");
			}
			System.out.println();
		}
	}
	void userConformation() {
		while(true) {
			Scanner input = new Scanner(System.in);
			System.out.println("Press 'yes' or 'no' to continue!");
			String continue_status = input.nextLine();
			if(continue_status.toLowerCase().equals("yes")) {
				break;
			}
			if(continue_status.toLowerCase().equals("no")) {
				System.exit(0);
			}
			if((continue_status.toLowerCase().equals("yes")) && (continue_status.toLowerCase().equals("no")))
				System.out.println("You Have Entered Wrong Choice!");
		}
	}
	static int array_size = 0;
	static int array_element[] = new int[5];
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		StackOperation stackOperationObj = new StackOperation();
		System.out.println("Stack Operation!");
		while(true) {
			System.out.println("Enter Your Choice:\n1.Push\n2.Pop\n3.Display Stack\n4.Exit");
			switch(input.nextInt()) {
				case 1:
					if(array_size !=5) {
						System.out.print("Enter Number to Push:");
						stackOperationObj.push_operation(input.nextInt());
					}
					else {
						System.out.println("Stack Full!");
					}
					break;
				case 2:
					if(array_size ==0) {
						System.out.println("Stack Empty!");
					}
					else
						stackOperationObj.pop_operation();
					break;
				case 3:
					stackOperationObj.stack_display();
					break;
				case 4:
					System.out.println("Exit");
					System.exit(0);
				default:
					System.out.println("Please Enter Correct Choice!");
					break;
			}
			stackOperationObj.userConformation();
		}
	}
}