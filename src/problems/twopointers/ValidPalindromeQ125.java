package problems.twopointers;

public class ValidPalindromeQ125 {
    public boolean isPalindrome(String s) {
        for(int i=0, j=s.length()-1;i<j;i++,j--){
            while(isValid(s.charAt(i)) &&i<j){
                i++;
            }
            while(isValid(s.charAt(j)) &&i<j){
                j--;
            }
            if(Character. toLowerCase(s.charAt(i))!=Character. toLowerCase(s.charAt(j)))
                return false;
        }
        return true;
    }

    private boolean isValid(char ch){
        return (ch < 'a' || ch > 'z') && (ch < 'A' || ch > 'Z') && (ch < '0' || ch > '9');
    }

}
