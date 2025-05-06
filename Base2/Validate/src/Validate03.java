import java.util.Scanner;

public class Validate03{
    public static int getInt(){
        Scanner inp=new Scanner(System.in);
        while(true){
            try{
                System.out.println("Input: ");
                String input=inp.nextLine();
                int num=Integer.parseInt(input);
                return num;
            } catch(Exception e){
                System.out.println("Input must be decimal number!");
            }
        }
    }
    
    public static void main(String[] args){
        int num=getInt();
        System.out.println(num);
        
        int age=getInt();
        System.out.println(age);
    }
}
