package OOP;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RunBloodData {
	public static void main(String[]args)throws InputMismatchException{
		Scanner sc = new Scanner(System.in);
		boolean cont = true;
		
		try{
			while(cont) {
				System.out.print("Enter blood type of patient: ");
				String bt = sc.nextLine();
				System.out.print("Enter Rhesus factor of patient: ");
				String rh = sc.nextLine();
				
				if(bt.isEmpty() && rh.isEmpty()) {
					BloodData bd = new BloodData();
					bd.display();
				}else{
					BloodData bd1 = new BloodData(bt, rh);
					bd1.display();
				}
				
				System.out.println("Do you still want to add another blood type of patient? [Y] / [N]");
				String choice = sc.next();
				
				if(choice.equalsIgnoreCase("Y")) {
					sc.nextLine();
					System.out.println();
				}else if(choice.equalsIgnoreCase("N")) {
					System.out.println("Thank you for using our system.");
					cont = false;
				}else {
					System.err.println("Please choose from [Y] / [N] only. Please try again.");
				}
			}
		}catch(InputMismatchException ime){
			System.err.println(ime.getMessage());
		}
	}
}