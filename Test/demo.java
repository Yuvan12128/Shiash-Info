import java.util.*;
class demo{
public static void main(String[]args){
ArrayList l=new ArrayList();
l.add(1);
l.add("abc");
l.add("selva");
l.add("45");

//System.out.println(l);

Object[] obj=l.toArray();
for(Object obj2:obj){
System.out.println(obj2);
}
ArrayList<Integer> l2=new ArrayList<Integer>();
l2.add(1);
l2.add(12);
l2.add(13);
l2.add(null);
Object[] obj3=l2.toArray();
for(Object obj4:obj3){
System.out.println(obj4);
}
Iterator itr=l.iterator();

while(itr.hasNext()){
System.out.println(itr.next());
}
Iterator<Integer> itr2=l2.iterator();
while(itr2.hasNext()){
System.out.println(itr2.next());
}
}
}
