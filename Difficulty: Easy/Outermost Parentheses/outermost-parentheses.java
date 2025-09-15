class Solution {
    public static String removeOuter(String s) {
        // code here
        int strlen=s.length();
        String str="";
        int count=0;
        
        for(int i=0;i<strlen;i++){
            char ch=s.charAt(i);
            if(ch=='('){
                if(count!=0){
                    str+=ch;
                }
                count++;
            }else{
                count--;
                if(count!=0){
                    str+=ch;
                }
            }
        }
        return str;
    }
}
