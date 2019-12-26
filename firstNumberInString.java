
class firstNumberInString {
    public int myAtoi(String str) {
        
        StringBuffer sb = new StringBuffer("");
        for(int i = 0; i < str.length(); i++)
        {
            if( ((int)str.charAt(i) > 47 && (int)str.charAt(i) < 58) || str.charAt(i) == '-')
            {
                sb.append(str.charAt(i));
                if(i != str.length() -1 ){
                if( ((int)str.charAt(i+1) <= 47 && (int)str.charAt(i+1) >= 58))
                    break; 
                }
            }
        }
        String s = new String(sb);
        if(s.length() == 0)
            return 0;
        else
            return Integer.parseInt(s);        
    }
}
