// hello world with input

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if(n%2==0){
            if (2<=n && n>=5){
                System.out.println("Not Weird");
            } else if (6<=n && n>=20) {
                System.out.println("Weird");
            }
            else {
                System.out.println("Not Weird");
            }
        }
        else {
            System.out.println("Weird");
        }
    }
}