import java.lang.invoke.SwitchPoint;
import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

/*
        Get 2 digit  from user and 1 operation // *,/,+,-        }
*/
        Scanner scaner= new Scanner(System.in);
        System.out.println("Please add first digit");
        int digit1 = scaner. nextInt();
        System.out.println("Please add second digit");
        int digit2= scaner.nextInt();
        System.out.println("Enter the operation (*, /, +, -): ");
        scaner.nextLine();
        String  operation = scaner.nextLine();
        double result=0;
        switch (operation){
            case "-":
                result=digit1-digit2;
                break;
            case "+":
                result=digit1+digit2;
                break;
            case"*":
                result=digit1*digit2;
                break;
            case"/":
                result=digit1/digit2;
                break;
            default:
                System.out.print( "Please write the conditions correctly" );

        }
        System.out.println(result);
        }
    }
