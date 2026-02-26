class Solution {
    public String reversePrefix(String word, char ch) {
        Stack<Character> stack=new Stack<>();
        StringBuilder sb=new StringBuilder();
        boolean found=false;
        for(char c:word.toCharArray()){
            stack.push(c);
            if(c==ch){
                while(!stack.isEmpty()){
               sb.append(stack.pop());
                }
                found=true;
                break;
            }
        }
               if(found){
                int prefixLength=sb.length();
                sb.append(word.substring(prefixLength));
               }  else{
                return word;
               }
                return sb.toString();
        }
       

    
}