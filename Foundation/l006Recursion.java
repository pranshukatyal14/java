import java.util.ArrayList;

public class l006Recursion{
    public static void printDecreasing(int n){
        if(n==0){
            return;
        }
        System.out.println("Hi"+n);
        printDecreasing(n-1);
        System.out.println("Bye"+n);
    }
    public static void fun(int n){
        if(n==0){
            System.out.println("i have to stop"+n);
            return;
        }
        for(int i=0;i<3;i++){
            System.out.print(n+"@"+i);
        }
        System.out.println();
        if(n%2==0){
            System.out.println("heading toward child function"+n);
        }
        fun(n-1);
        if(n%2!=0){
            System.out.println("back to parent function"+n);
        }
    }
    public static void printIncreasingDecreasing(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printIncreasingDecreasing(n-1);
        System.out.println(n);
    }
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        int ans=factorial(n-1);
        return ans*n;
    }
    public static int factorial2(int n){
        return n==0 ?1 :factorial2(n-1)*n;
    }
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        int smallAns=power(x,n/2);
        smallAns*=smallAns;
        return (n%2==0 ? smallAns : smallAns * x);
    }
    public static int[] allIndices(int[] arr,int data,int idx,int count){
        if(idx==arr.length){
            int[] base=new int[count];
            return base;
        }
        if(arr[idx]==data){
            count++;
        }
        int [] ans=allIndices(arr,data,idx+1,count);
        if(arr[idx]==data){
            ans[count-1]=idx;
        }
        return ans;
    }

    
    public static void main(String[] args){
        
    }
}