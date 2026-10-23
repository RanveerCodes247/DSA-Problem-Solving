class Solution {
    public String reverseWords(String s) {
        ArrayList<String> store = new ArrayList<>();
        String word="";
        for(int j=0;j<s.length();j++){
            char c = s.charAt(j);
            if(c!=' '){
                word+=c;
            }
            else{
            if(!word.isEmpty()){
                store.add(word);
                word="";
            }
          }
        }
        if(!word.isEmpty()){
                store.add(word);
            }
        String result="";
        for(int i=store.size()-1;i>=0;i--){
            result+=store.get(i);
            if(i>0){
                result+=" ";
            }
        }
        return result;
    }
}