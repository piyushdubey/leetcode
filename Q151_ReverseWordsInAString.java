/*
Question 151 - Reverse Words In A String

Given an input string, reverse the string word by word.

For example,
Given s = "the sky is blue",
return "blue is sky the".

Update (2015-02-12):
For C programmers: Try to solve it in-place in O(1) space.

*/
public class Q151_ReverseWordsInAString {
    public String reverseWords(String s) {
        if(s.isEmpty() || s == null) {
            return "";
        }
        s = s.trim();
        
        String[] arr = s.split("\\s+");
        String temp = "";
        StringBuffer sb = new StringBuffer();
        for(int i=arr.length-1; i>= 0;i--) {
            temp = arr[i].trim();
            sb.append(temp);
            if(i>0) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
