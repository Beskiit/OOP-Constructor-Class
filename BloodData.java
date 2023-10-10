package OOP;

class BloodData {
	static String bloodType;
	static String rhFactor;
	
	public BloodData() {
		bloodType = "O";
		rhFactor = "+";
	}
	
	public BloodData(String bt, String rh) {
		this.bloodType = bt;
		this.rhFactor = rh;
		
		if(bloodType.equalsIgnoreCase("O")) {
			bloodType = "O";
		}else if(bloodType.equalsIgnoreCase("B")) {
			bloodType = "B";
		}else if(bloodType.equalsIgnoreCase("A")) {
			bloodType = "A";
		}else if(bloodType.equalsIgnoreCase("AB")) {
			bloodType = "AB";
		}
		
		if(rhFactor.equals("+")) {
			rhFactor = "+";
		}else if(rhFactor.equals("-")) {
			rhFactor = "-";
		}
	}
	
	public static void display() {
		if((bloodType.equalsIgnoreCase("O") || bloodType.equalsIgnoreCase("A") || bloodType.equalsIgnoreCase("B") || bloodType.equalsIgnoreCase("AB")) && (rhFactor.equalsIgnoreCase("+") || rhFactor.equalsIgnoreCase("-"))) {
		System.out.println(bloodType + rhFactor + " added to the blood bank.\n");
		}else {
			System.err.println("Your input is wrong. Please try again.");
		}
	}
}