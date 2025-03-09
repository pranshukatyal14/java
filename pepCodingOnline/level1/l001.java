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
    public static void sumOfTwoArrays(int[] arr1,int[] arr2){
        int n1=arr1.length;
        int n2=arr2.length;
        int[] sum=new int[n1>n2 ?n1 :n2];
        int carry=0;
        int i=arr1.length-1;
        int j=arr2.length-1;
        int k=sum.length-1;
        while(k>=2){
            int d=carry;
            if(i>=0){
                d+=arr1[i];
            }
            if(j>=0){
                d+=arr2[j];
            }
            carry=d/10;
            d=d%10;
            sum[k]=d;
            i--;
            j--;
            k--;
        }
        if(carry!=0){
            System.out.println(carry);
        }
        for(int val : sum){
            System.out.println(val);
        }
    }
    public static void differenceOfTwoArrays(int[] arr1,int[] arr2 ){
        int n1=arr1.length;
        int n2=arr2.length;
        int[] diff=new int[n2];
        int carry=0;
        int i=arr1.length-1;
        int j=arr2.length-1;
        int k=diff.length-1;

        while(k>=0){
            int d=0;
            int a1v=i >=0 ?arr1[i]:0;
            if(arr2[j]+carry >=a1v){
                d=arr2[j]+carry -a1v;
            }else{
                d=arr2[j]+carry+10 -a1v;
                carry=-1;
            }
            diff[k]=d;
            i--;
            j--;
            k--;

        }
        int idx=0;
        while(idx< diff.length){
            if(diff[idx]==0){
                idx++;
            }else{
                break;
            }
        }
        while(idx<diff.length){
            System.out.println(diff[idx]);
            idx++;
        }

    }
    public static void main(String[] args){
        int[] arr=new int[]{1,3,5,2,5};
        int[] arr2=new int[] {5,6,7,8,9,9};
        sumOfTwoArrays(arr,arr2);
    }
}