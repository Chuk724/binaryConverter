package binaryConverter;
import java.lang.Math;
import java.util.*;

public class binaryConverter {

	private String input;
	
	//TRUE represents binary to decimal
	//FALSE represents decimal to binary
	public binaryConverter (String in, int response) {
		this.input = in;
		if (response == 1) {
			binToDec();
		} else {
			decToBin();
		}
	}
	
	public void binToDec() {
		long[] array = new long[input.length()];
		//System.out.println(input.length());
		for (int i = 0; i < input.length(); i++) {
			array[i] = Long.parseLong(input.charAt(i)+"");
			//System.out.println(array[i]);
		}
		long output = 0;
		int power = array.length-1;
		for (int i = 0; i < array.length; i++) {
			//System.out.println(i); 
			output += array[i]*(Math.pow(2, power));
			//System.out.println(array[i]*(Math.pow(2, power)) + " + ");
			//System.out.println(array[i]);
			power--;
		}
		System.out.println(output);
	}
	
	public void decToBin() {
		ArrayList<Long> output = new ArrayList<Long>();
		long num = Long.parseLong(this.input);
		while (num != 0) {
			output.add(num%2);
			//System.out.println(num%2);
			num = num/2;
			//System.out.println(num);
		}
		for (int i = output.size()-1; i >= 0; i--) {
			System.out.print(output.get(i));
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Do you want to convert from binary to decimal or from decimal to binary?");
		Scanner keyboard = new Scanner(System.in);
		String response = keyboard.nextLine();
		
		int resp = 0;
		if (response.equals("binary to decimal")) {
			resp = 1;
		}
		//System.out.println(resp);
		
		System.out.println("What number would you like to convert?");
		keyboard = new Scanner(System.in);
		
		String num = keyboard.next();
		//System.out.println(num);
		
		binaryConverter User = new binaryConverter (num, resp);
		
		

	}

}
