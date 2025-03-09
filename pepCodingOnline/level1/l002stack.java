import java.util.*;
public class l002stack{
    public static void duplicateBrackets(String str){
        Stack<Character>st=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch==')'){
                if(st.peek()=='('){
                    System.out.println(true);
                    return;
                }else{
                    while(st.peek()!='('){
                        st.pop();
                    }
                    st.pop();
                }

            }else{
                st.push(ch);
            }
        }
        System.out.println(false);
    }
    public static boolean balancedBrackets(String str){
        Stack<Character>st=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i); 
            if(ch=='(' || ch=='[' || ch=='{'){
                st.push(ch);
            }else if(ch==')'){
                if(st.size()==0){
                    return false;
                }else if(st.peek()!=')'){
                    return false;
                }else{
                    st.pop();
                }
            }else if(ch== ']'){
                if(st.size()==0){
                    return false;
                }else if(st.peek()!=']'){
                    return false;
                }else{
                    st.pop();
                }
            }else if(ch=='}'){
                if(st.size()==0){
                    return false;
                }else if(st.peek()!='}'){
                    return false;
                }else{
                    st.pop();
                }
            } 
        }
        if(st.size()==0){
            return true;
        }else{
            return false;
        }
    }
    
    public static int[] nextGreaterElement(int[] arr){
        int n=arr.length;
        int[] nge=new int[n];
        Stack<Integer>st=new Stack<>();
        st.push(arr[arr.length-1]);
        nge[arr.length-1]=-1;
        for(int i=arr.length-2;i>=0; i--){
            // pop 
            // push 
            while(st.size()>0 && st.peek()<=arr[i]){
                st.pop();
            }
            if(st.size()==0){
                nge[i]=-1;
            }else{
                nge[i]=st.peek();
            }
            st.push(arr[i]);
        }
        return nge;
    }
    // alternate solution for next greater element to the right
    public static int[] nextGreaterElement2(int[] arr){
        int n=arr.length;
        int[] nge=new int[n];
        Stack<Integer>st=new Stack<>();
        st.push(0);
        
    }
    public static void main(String[] args){
        Stack<Integer>st=new Stack<>();
        st.push(20);
        st.push(30);
        System.out.println(st);
        st.push(30);
        System.out.println(st);
        st.push(40);
        System.out.println(st);
        System.out.println(st.peek()+ " "+ st.size());
        st.pop();
        st.pop();
        System.out.println(st);
        

    }
}