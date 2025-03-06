public class l005String{
    public static void test1(){
        String str="szcszxvwesz";
        String str1=str;

        str+="g";
        char ch=str.charAt(3);
    }

    public static void test2(){
        String str="";
        for(int i=0;i<(int)1e6;i++){
            str+=i;
        }
    System.out.println(str);
    }
    
    public static void test3(){
        StringBuilder sb=new StringBuilder();
        sb.append("d"); // o(1);
        StringBuilder sb1=sb; //o(1)
        StringBuilder sb2=new StringBuilder(sb); // o(n)

        char ch=sb.charAt(3);
        String str=sb.toString(); //o(n);
        System.out.println(str);
    }
    public static void test4(){
        StringBuilder str=new StringBuilder();
        for(int i=0;i<(int)1e6;i++){
            str.append(i);
        }
        System.out.println(str);

    }
    // Questions ======================

    public static String compress(String str){
        if(str.length()==0){
            return "";
        }
        StringBuilder sb=new StringBuilder();
        char prevChar=str.charAt(0);
        int i=1;
        while(i<=str.length()){
            int count=1;
            while(i<str.length() && prevChar ==str.charAt(i)){
                count++;
                prevChar=str.charAt(i);
                i++;
            }
            sb.append(prevChar);
            sb.append(count);
            if(i==str.length()){
                break;
            }
            prevChar=str.charAt(i);
            i++;
        }
        return sb.toString();
    }
    public static String compress1(String str){
        int[] freq=new int[26];
        for(int i=0;i<str.length();i++){
            freq[str.charAt(i)-'a']++;
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<freq.length;i++){
            if(freq[i]>0){
                sb.append((char)(i+'a'));
                sb.append(freq[i]);
            }
        }
        return sb.toString();
    }
    public static String toggleString(String str){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='a' && ch<='z'){
                sb.append((char)(ch-'a'+'A'));
            }else{
                sb.append((char)(ch-'A'+'a'));
            }
        }
        return sb.toString();
    }
    public static boolean isPalindrome(String str){
        int i=0;
        int j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void palindromicSubstring(String str){
        for(int i=0;i<str.length();i++){
            for(int j=i;j<=str.length();j++){
                String s=str.substring(i,j+1);
                if(isPalindrome(s)){
                    System.out.println(s);
                }
            }
        }
    }
    public static String consecutiveCharacters(String str){
        if(str.length()<=1){
            return str;
        }
        StringBuilder sb=new StringBuilder();
        sb.append(str.charAt(0));
        for(int i=1;i<str.length();i++){
            char ch=str.charAt(i);
            char ch0=str.charAt(i-1);
            sb.append(ch-ch0);
            sb.append(ch);

        }
        return sb.toString();
    }
    // public static void permutation(String str){
    //     ArrayList<String> ans=new ArrayList<>();
    //     ans.add(str.charAt(0)+"");
    //     for(int i=1;i<str.length();i++){
    //         char ch=str.charAt(i);
    //         ArrayList<String>smallAns=new ArrayList<>();
    //         for(string s:ans){
    //             for(int j=0;j<s.length;j++){
    //                 String ns=s.substring(0,j)+ch+s.substring(j);
    //                 smallAns.add(ns);
    //             }
    //         }
    //         ans=smallAns;
    //     }
    // }

    public static boolean isplaindrome(String str){
        int i=0;
        int j=str.length()-1;
        while(i<j){
            if(str.charAt(i++)!=str.charAt(j--)){
                return false;
            }
        
        }
        return true;
    }
    public static void allSubString(String str){
        for(int i=0;i<str.length;i++){
            for(int len=1;i+len<=str.length();len++){
                System.out.println(str.substring(i,i+len));
            }
        }
    }
    
    public static String compression1(String str){
        if(str.length()<=1){
            return str;
        }
        StringBuilder sb=new StringBuilder();
        sb.append(str.charAt(0));
        int i=1;
        while(i<str.length()){
            while(i<str.length && str.charAt(i-1)==str.charAt(i)){
                i++
            }
            if(i<str.length()){
                sb.append(str.charAt(i));
                i++;
            }
        }
        return sb.toString();
    }

    public static String compression2(String str){
        if(str.length<=1){
            return str;
        }
        StringBuilder sb=new StringBuilder();
        sb.append(str.charAt(0));
        int i=1;
        while(i<str.length()){
            int count=1;
            while(i<str.length() && str.charAt(i-1)==str.char(i)){
                count++;
                i++;
            }
            if(count!=1){
                sb.append(count);
            }
            if(i<str.length()){
                sb.append(str.charAt(i))
            }
        }
        return sb.toString();
    }
    public static String withoutX2(String str){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(i<2 && str.charAt(i)!='x' ){
                sb.append(str.charAt(i));
            }
            if(i>=2){
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    // toggle case
    public static String toggleCase(String str){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>="a" && ch<="z"){
                sb.append((char)(ch-"a"+"A"))
            }else{
                sb.append((char)(ch-"A"+"a"))
            }
        }
        return sb.toString();
    }
    // string with difference of every two consecutive characters
    public static String solution(String str){
        if(str.length()<=1){
            return str;
        }
        StringBuilder sb=new StringBuilder();
        sb.append(str.charAt(0));
        for(int i=1;i<str.length();i++){
            int diff=str.charAt(i)-str.charAt(i-1);
            char ch=str.charAt(i);
            sb.append(diff);
            sb.append(ch);
        }
        return sb.toString();
    }

    public static ArrayList<Integer> occuOfChar(String str,char ch){
        ArrayList<Integer>arr=new ArrayList<>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==ch){
                arr.add(i);
            }
        }
        return arr;
    }

    public static ArrayList<String> subSeq(String str){
        ArrayList<String>ans=new ArrayList<>();
        ans.add("");
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int size=ans.size();
            for(int j=0;i<size;i++){
                ans.add(ans.get(j)+ch)
            }
        }
        return ans;
    }

    public static void main(String[] args){
        System.out.println("working fine");
    }
}