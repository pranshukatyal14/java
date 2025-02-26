import java.util.Scanner;
public class l001{
    public static Scanner scn=new Scanner(System.in);

    public static void printHello(){
        System.out.println("Hi there");
        System.out.println("This is pranshu katyal");
    }
    
    public static workWithDataType(){
        int a=10;
        int b=20;
        System.out.println("value of a is "+ a);
        System.out.println("value of b is "+ b);
    }
    public static void printZ(){
        System.out.println("*****");
        System.out.println("   *");
        System.out.println("  *");
        System.out.println(" *");
        System.out.println("*****");
    }
    
    public static void gradingSystem(int n){
        if(n>90){
            System.out.println("Excellent");
        }else if (n>80){
            System.out.println("good");
        }else if(n>70){
            System.out.println("fair");
        }else if(n>60){
            System.out.println("meet expectations");
        }else{
            System.out.println("below par");
        }
    }
    public static void oddEven(int n){
        if(n%2==0){
            System.out.println("Even")
        }else{
            System.out.println("Odd")

        }
    }
    public static boolean isPrime_(int n){
        boolean prime=true;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                prime=false;
                break;
            }
        }
        return prime;
    }
    public static void isPrime(){
        int n=scn.nextInt();
        boolean ans=isPrime_(n);
        if(ans){
            System.out.println("Prime")
        }else{
            System.out.println("Not Prime")
        }
    }
}