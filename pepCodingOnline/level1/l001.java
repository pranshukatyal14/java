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
        return false;
    }
    public static void benjaminBulbs(int n){
        // find the perfect square is the solution
        for(int i=1;i*i<=n;i++){
            System.out.println(i*i);
        }
    }
    public static int spanOfArray(int[] arr){
        // find max and min then calculate the difference
        int maxEle=arr[0];
        int minEle=arr[0];
        for(int i=1;i<arr.length;i++){
            if(maxEle<arr[i]){
                maxEle=arr[i];
            }
            if(minEle>arr[i]){
                minEle=arr[i];
            }
        }
        return maxEle-minEle;
    }
    public static int findEleinArray(int[]arr,int data){
        // return index
        int index=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==data){
                return index;
            }
        }
        return index;
    }
    public static void barChart(int[]arr){
      int max=arr[0];
      for(int i=1;i<arr.length;i++){
        if(max<arr[i]){
            max=arr[i];
        }
      }
      for(int floor=max;floor>=1;floor--){
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=floor){
               System.out.print("*\t"); 
            }else{
                System.out.print("\t");
            }
        }
        System.out.println();
      }
    }
    public static void main(String[] args){
        int[] arr=new int[]{1,3,5,2,5};
        barChart(arr);
    }
}