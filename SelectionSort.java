import java.util.Scanner;

class SelectionSort {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Insertion Sort!\nArray Size:");
		int array_size = input.nextInt();
		int array_elements[] = new int[array_size];
		boolean status =true;
		int temp_data=0,temp_data_index=0,looping=0;
		System.out.print("Array Element:");
		for(int i=0;i<array_size;i++) {
			array_elements[i] = input.nextInt();
		}
		while(looping<array_size) {
			for(int i=0;i<array_size;i++) {
				if(i==0) {
					temp_data = array_elements[i];
				}
				else if(temp_data>array_elements[i]) {
					temp_data = array_elements[i];
					temp_data_index = i;
					status = false;
				}
			}
			System.out.println("check"+status+","+temp_data_index);
			if(!status) {
				int index_loc = array_size - (temp_data_index+1);
				array_elements[temp_data_index] = array_elements[temp_data_index] + array_elements[index_loc];
				array_elements[index_loc] = array_elements[temp_data_index] - array_elements[index_loc];
				array_elements[temp_data_index] = array_elements[temp_data_index] - array_elements[index_loc];
			}
			if (status) {
				break;
			}
			status = true;
			looping -=1;
		}
		System.out.println("Result:");
		for(int i=0;i<array_size;i++) {
			System.out.println(array_elements[i]+"	");
		}
	}
}