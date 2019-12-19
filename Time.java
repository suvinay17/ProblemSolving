import java.util.*;
public class Time{

    public static void main(String []args){
        String str= "?0:??";
        char s[]= str.toCharArray();
       if(str.charAt(0)=='?' && str.charAt(1)=='?' && str.charAt(3)=='?' && str.charAt(4)=='?'){
           s[0]='2';
           s[1]='3';
           s[3]='5';
           s[4]='9';

       }
       else if(str.charAt(0)=='?' && str.charAt(1)=='?' && str.charAt(3)=='?' && str.charAt(4)!='?')
       {
           s[0]='2';
           s[1]='3';
           s[3]='5';
           String st= new String(s);
           System.out.println(st);
       }
       else if(str.charAt(0)=='?' && str.charAt(1)=='?' && str.charAt(3)!='?' && str.charAt(4)=='?')
       {
           s[0]='2';
           s[1]='3';
           s[4]='9';
           String st= new String(s);
           System.out.println(st);
       }
       else if(str.charAt(0)=='?' && str.charAt(1)=='?'){
           s[0]='2';
           s[1]='3';
           s[3]='5';
           s[4]='9';
       }
       else{
        if(str.charAt(0)=='?')
        {
            if(Integer.parseInt(String.valueOf(str.charAt(1))) < 4)
            {
                s[0]='2';
            }
            else
               s[0]='1';

        }
        if(str.charAt(1)=='?')
        {
            if(Integer.parseInt(String.valueOf(str.charAt(0))) < 2 )
            {
                s[1]='9';
            }
            else
                s[1]='3';
        }
        if(str.charAt(3)=='?')
        {
            s[3]= '5';
        }
        if(str.charAt(4)=='?')
        {
            s[4]= '9';
        }
       }
        String st= new String(s);
        System.out.println(st);
     }
}

