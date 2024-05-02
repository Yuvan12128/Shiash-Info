import java.util.*;
class t1{
public static void main(String [] args){
HashMap<Integer,String> map=new HashMap<Integer,String>();
map.put(1,"harry");
map.put(2,"shankar");
map.put(3,"dhoni");
map.put(4,"yuvan");


Set set=map.entrySet();

Iterator itr=set.iterator();

while(itr.hasNext()){
Map.Entry entry=(Map.Entry)itr.next();

System.out.println(entry.getKey()+"   "+entry.getValue());
}

}

}
