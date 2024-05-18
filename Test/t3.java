import java.util.*;

class t3{
public static void main(String [] args){
String s="IN LIFE IT ISNT JUST ABOUT MAKING MISTAKES BUT LEARNING FROM THOSE MISTAKES BECAUSE GROWTH COMES FROM ACKNOWLEDGING THE MISTAKES";
HashMap<String,Integer> wordF=new HashMap<>();
String [] words=s.split("\\s+");

for (String word:words){

word=word.replaceAll("[^a-zA-Z]","");
if(!word.isEmpty()){
if(wordF.containsKey(word)){
wordF.put(word,wordF.get(word)+1);
}else{
wordF.put(word,1);
}
}
}
for(String word:wordF.keySet()){
System.out.println(word+": "+wordF.get(word));
}
}
}
