class Solution {
public String convert(String s,int numRows){
if(numRows==1)return s;
StringBuilder[] r=new StringBuilder[numRows];
for(int i=0;i<numRows;i++)r[i]=new StringBuilder();
int cur=0;boolean down=false;
for(char c:s.toCharArray()){
r[cur].append(c);
if(cur==0||cur==numRows-1)down=!down;
cur+=down?1:-1;
}
StringBuilder res=new StringBuilder();
for(int i=0;i<numRows;i++)res.append(r[i]);
return res.toString();
}
}