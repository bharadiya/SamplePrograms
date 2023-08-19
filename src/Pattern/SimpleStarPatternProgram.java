package Pattern;

public class SimpleStarPatternProgram {
	public static void main(String[] args) {
//
//*
//**
//***
//****
//*****
		int numberofLines = 10;
		// First for loop for printing number of lines
		for (int i = 1; i <= numberofLines; i++) {
			// set up a equation between number of lines and stars
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
