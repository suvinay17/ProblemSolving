class Palindrome {
    public boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        int j = s.length()-1;  
        if(s.length() == 1)
            return true;
        for(int i = 0; i < s.length() /2 ; i++)
        {
            if(s.charAt(i)!=s.charAt(j))
                return false;
            j--;
        }        
        return true;
    }
}
