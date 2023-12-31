class Solution {
   public  static String reverseWords(String S) {
     
 String[] words = S.split("\\.");
 int start = 0;
 int end = words.length-1;
 while(start<end){
     String temp = words[start];
     words[start] = words[end];
     words[end] = temp;
     start++;
     end--;
 }
 return String.join(".",words);
   }
 
 public static void main(String[] args){
     String input = "Hello.World.Java";
     String result = reverseWords(input);
     System.out.println(result);
 }
     }
