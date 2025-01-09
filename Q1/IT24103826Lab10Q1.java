import java.util.Scanner;
 public class IT24103826Lab10Q1{
 public static void main(String[]args){
     
      Scanner input=new Scanner(System.in);
      System.out.print("Enter Mark(0-100): ");
      int mark=input.nextInt();

      assert(mark>=0 && mark<=100):"Invalid Mark";

      System.out.println("Mark is Validated");
   
      char grade;
      if(mark>74){grade='A';}
      else if(mark>59){grade='B';}
           else if(mark>49){grade='C';}
                else if(mark>39){grade='D';}
                     else{grade='F';}
     

      assert (grade == 'A' && mark >= 75) || (grade == 'B' && mark >= 60 && mark < 75) ||
             (grade == 'C' && mark >= 50 && mark < 60) || (grade == 'D' && mark >= 40 && mark < 50) ||
             (grade == 'F' && mark < 40) : "Incorrect Grade Assigned";

       System.out.println("Grade For Mark: "+grade);

                
   }

}


