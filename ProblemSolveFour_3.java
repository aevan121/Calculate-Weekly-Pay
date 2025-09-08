import java.util.Scanner;
public class ProblemSolveFour_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.print("Input number of hours worked: ");
        int hours = scanner.nextInt();
        System.out.print("Input wage: ");
        double wage = scanner.nextDouble();

        double overtime = ((1.5 * wage) * (hours - 40));

        if(hours <= 40){
            System.out.println("Final weekly pay: $" + (hours * wage));
        } else if (hours > 40){
            System.out.println("Final weekly pay: $" + (overtime + (40 * wage)));
        }

       scanner.close(); 
    }
}
