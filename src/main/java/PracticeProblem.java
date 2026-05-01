/**
	* File: Lesson 4.5 - Nested Loops
	* Author: Visaagan Gunabalachandran
	* Date Created: April 11, 2023
	* Date Last Modified: May 1, 2026
	*/

public class PracticeProblem {
	public static void main(String[] args){
		System.out.println(pyramid(4));
		
	}

	public static String triangle(int num) {
    String result = "";
    for (int i = 1; i <= num; i++) {
        for (int j = 1; j <= i; j++) {
            result += "*";
        }
        
        if (i <= num) {
            result += "\n";
        }
    }
    return result;
}
	
    public static String pyramid(int num) {
        String result = "";

        for (int i = 1; i <= num; i++) {
            
            for (int j = i; j < num; j++) {
                result += " ";
            }

            
            for (int k = 1; k <= i; k++) {
                result += "*";
                if (k < i) {
                    result += " ";
                }
            }

            
            if (i <= num) {
                result += "\n";
            }
        }

        return result;
    }

	public static String multiplicationTable(int num) {
        String result = "";

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                result += (i * j);

              
                if (j < num) {
                    result += " ";
                }
            }
            
            if (i <= num) {
                result += "\n";
            }
        }

        return result;
    }
}
	