import java.util.Scanner;

class DecimalToBinary {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int decimalInput,binaryOutput=0,multiplicationData=1;
		System.out.print("Decimal To Binary Convertor!\nEnter Decimal Number:");
		decimalInput = input.nextInt();
		while(decimalInput > 0) {
			binaryOutput = binaryOutput + (decimalInput%2) * multiplicationData;
			multiplicationData  = multiplicationData * 10;
			decimalInput = decimalInput/2;
		}
		System.out.println("Result:"+binaryOutput);
	}
}