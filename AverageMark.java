import java.util.Scanner;

public class AverageMark{
  public static void main(String[] args){
    int mark1, mark2, mark3, average;
    Scanner userinput = new Scanner(System.in);
    System.out.println("Enter the first exam mark: ");
    mark1 = userinput.nextInt();
    System.out.println("Enter the second exam mark: ");
    mark2 = userinput.nextInt();
    System.out.println("Enter the third exam mark: ");
    mark3 = userinput.nextInt();
    userinput.close();
    average = (mark1 + mark2 + mark3)/3;
    System.out.println("The average value of the exam marks is "+ average);
  }
}
