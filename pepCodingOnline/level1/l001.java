import java.util.Scanner;
public class l001{
    public static Scanner scn=new Scanner(System.in);

    public static boolean pythagoreanTriplet(int a ,int b,int c){
        int max=a;
        if(max<=b){
            max=b;
        }
        if(max<=c){
            max=c;
        }
        if(max==a){
            boolean flag=((b*b)+(c*c))==(a*a);
            return flag;
        }
        if(max==b){
            boolean flag=((a*a)+(c*c))==(b*b);
            return flag;
        }
        if(max==c){
            boolean flag=((a*a)+(b*b))==(c*c);
            return flag;
        }

    }
    public static void benjaminBulbs(int n){
        // find the perfect square is the solution
        for(int i=1;i*i<=n;i++){
            System.out.println(i*i);
        }
    }
    public static void main(String[] args){
        
    }
}