import java.util.Scanner;

class QueueOperation {
	void enqueue_operation(int element) {
		array_element[array_size] = element;
		array_size +=1;
	}
	void dequeue_operation() {
		for(int i=0;i<array_size;i++) {
			if(i!=(array_size-1)) {
				array_element[i] = array_element[i+1];
			}
			else {
				array_element[i] = 0;
			}
		}
		array_size -=1;
	}
	void stack_display() {
		if(array_size == 0) {
			System.out.println("Queue Empty!");
		}
		else {
			System.out.println("Queue Element:");
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
		QueueOperation queueOperationObj = new QueueOperation();
		System.out.println("Queue Operation!");
		while(true) {
			System.out.println("Enter Your Choice:\n1.Enqueue\n2.Dequeue\n3.Display Queue\n4.Exit");
			switch(input.nextInt()) {
				case 1:
					if(array_size !=5) {
						System.out.print("Enter Number to Enqueue:");
						queueOperationObj.enqueue_operation(input.nextInt());
					}
					else {
						System.out.println("Queue Full!");
					}
					break;
				case 2:
					if(array_size ==0) {
						System.out.println("Queue Empty!");
					}
					else
						queueOperationObj.dequeue_operation();
					break;
				case 3:
					queueOperationObj.stack_display();
					break;
				case 4:
					System.out.println("Exit");
					System.exit(0);
				default:
					System.out.println("Please Enter Correct Choice!");
					break;
			}
			queueOperationObj.userConformation();
		}
	}
}