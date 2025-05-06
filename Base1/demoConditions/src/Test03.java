import java.util.Scanner;

public class Test03{
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter a day: ");
        int days=inp.nextInt();
        
        switch(days){
            case 2 -> System.out.println("Monday");
            case 3 -> System.out.println("Tuesday");
            case 4 -> System.out.println("Wednesday");
            case 5 -> System.out.println("Thursday");
            case 6 -> System.out.println("Friday");
            case 7 -> System.out.println("Saturday");
            case 8 -> System.out.println("Sunday");
            default -> System.out.println("Error...");
        }
    }
}
