import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to the student Grade calculator");
        System.out.println("Please enter your marks");
        System.out.print("English: ");
        int Eng = s.nextInt();
        System.out.print("Maths: ");
        int Math = s.nextInt();
        System.out.print("Science: ");
        int Sci = s.nextInt();
        System.out.print("Social Science : ");
        int SST = s.nextInt();
        System.out.print("Marathi : ");
        int Mar = s.nextInt();
        System.out.print("Hindi : ");
        int Hin = s.nextInt();
        int Totalmarks = Eng+Hin+Mar+Math+SST+Sci;

        double avgPercentage = ((double)Totalmarks/600)*100;
        char grade;
        if (avgPercentage>=90){
           grade = 'A';
        }
        else if (avgPercentage >= 80) {
           grade ='B';
        } else if (avgPercentage>=70) {
            grade = 'C';
        } else if (avgPercentage>=50) {
            grade = 'D';
        }
        else {
            grade = 'E';
        }

        //Display Results
        System.out.println("Results");
        System.out.println("Total marks are : " +Totalmarks);
        System.out.println("Percentage: " + String.format("%.2f", avgPercentage) + "%");
        System.out.println("Grade is : " +grade);


    }
}

