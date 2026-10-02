class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generate("",n,result);
                List<String> valid = new ArrayList<>();
        for(String s: result){
            if(isValid(s)){
               valid.add(s);
            }
        }
        return valid;
    }
        void generate(String current, int n, List<String> result){
            if(current.length()==2*n){
                result.add(current);
                return;
            }
            generate(current+"(",n,result);
            generate(current+")",n,result);
        }
        boolean isValid(String s){
            int count=0;
            for(int i=0;i<s.length();i++){
                char ch = s.charAt(i);
                if(ch=='('){
                    count++;
                }
                if(ch==')'){
                    count--;
                }
                if(count<0){
                    return false;
                }
            }
            return count==0;
        }
    }