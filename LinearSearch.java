import java.util.Scanner;

class LinearSearch {
	void linear_search_function(int array_elements[],int array_size,int element) {
		int status=-1;
		for(int i=0;i<array_size;i++) {
			if(array_elements[i] == element) {
				System.out.println("Index:"+i+"\nElement:"+array_elements[i]);
				status = i;
			}
		}
		if(status == -1) {
			System.out.println("No Search Element!");
		}
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		LinearSearch linearSearchObj = new LinearSearch();
		System.out.print("Linear Search!\nArray Size:");
		int array_size = input.nextInt();
		System.out.print("Array Elements:");
		int array_elements[] = new int[array_size];
		for(int i=0;i<array_size;i++) {
			array_elements[i] = input.nextInt();
		}
		System.out.print("Search Element:");
		linearSearchObj.linear_search_function(array_elements,array_size,input.nextInt());
	}
}