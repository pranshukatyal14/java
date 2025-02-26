import java.util.Scanner;
public class l001{
    public static Scanner scn=new Scanner(System.in);

    public static void printHello(){
        System.out.println("Hi there");
        System.out.println("This is pranshu katyal");
    }
    
    public static void workWithDataType(){
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
            System.out.println("Even");
        }else{
            System.out.println("Odd");

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
            System.out.println("Prime");
        }else{
            System.out.println("Not Prime");
        }
    }
    public static void printAllPrime(int a,int b){
        for(int i=a;i<=b;i++){
            boolean ans=isPrime_(i);
            if(ans){
                System.out.println(i);
            }
        }
    }
    public static void printFibo(int n){
        int a=0;
        int b=1;
        for(int i=1;i<=n;i++){
            System.out.println(a);
            int sum=a+b;
            a=b;
            b=sum;
        }
    }
    public static int countDigits(int n){
        int count=0;
        int num=n;
        while(num!=0){
            num=num/10;
            count++;
        }
        return count;
    }
    public static void lineWiseDigits(int n){
        int num=n;
        int len=countDigits(num);
        int div=1;
        while(len -- >1){
            div=div*10;
        }
        while(div!=0){
            System.out.println(n/div);
            n=n%div;
            div=div/10;
        }
    }
    public static int reverse(int n){
        int res=0;
        for(int i=1;n!=0;i++){
            int digit=n%10;
            n=n/10;
            res+=i* Math.pow(10,digit-1);
        }
        return res;
    }
    public static int GCD(int a, int b){
        int dividend=a;
        int divisor=b;
        while(dividend %divisor !=0){
            int rem= dividend%divisor;
            dividend=divisor;
            divisor=rem;
        }
        return divisor;
    }
    public static boolean isPythagorean(int a, int b, int c){
        if((a*a + b*b == c*c) || (a*a +c*c==b*b) || (b*b + c*c==a*a)){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        printHello();
    }
}