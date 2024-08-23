package project3;

import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);

      
        System.out.print("Enter the number of subjects: ");
        int numberOfSubjects = sc.nextInt();
        
        
        double marks=numberOfSubjects  ;
        double totalMarks = 0;
        
        
        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.print("Enter marks obtained in subject " + (i + 1) + " (out of 100): ");
            marks = sc.nextDouble();
            
            
            if (marks < 0 || marks > 100) {
                System.out.println("Invalid input. Marks should be between 0 and 100.");
                return;
            }
            
            totalMarks += marks;
        }
        
       
        double averagePercentage = totalMarks / numberOfSubjects;
        
       
        String grade;
        if (averagePercentage >= 90) {
            grade = "O";
        } else if (averagePercentage >= 80) {
            grade = "A";
        } else if (averagePercentage >= 70) {
            grade = "B";
        } else if (averagePercentage >= 60) {
            grade = "C";
        } else if(averagePercentage >=50) {
            grade = "D";
        }
        else if(averagePercentage>=40){
        	grade="E";
        }
        else {
        	grade="F";
        	
        }
        
      
        System.out.printf("Total Marks: "+ totalMarks);
        System.out.printf("Average Percentage: "+ averagePercentage);
        System.out.println("Grade: " + grade);
               
        
    }
}
