class Solution {
    public String removeOuterParentheses(String s) {
      StringBuilder result=new StringBuilder();
      char[] ch=s.toCharArray();
      int open=0;
      for(int i=0;i<ch.length;i++) {
          if(ch[i]=='('){
            if(open>0){
            result.append(ch[i]);
            }
           open++;
          }
       else{
        open--;
        if(ch[i]==')'&&open>0){
            result.append(ch[i]);
        }
      }
      }
      return result.toString();
    }
}