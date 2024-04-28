import java.util.ArrayList;
class t{
public static void main(String []args){

ArrayList al=new ArrayList();
al.add(10);
al.add("String");
al.add('c');
al.add(true);
al.add(10.0);
System.out.println(al.size());
System.out.println(al);
ArrayList al2=new ArrayList();

al2.add(9000);
al2.add(222);
al2.addAll(al);
System.out.println(al2);
ArrayList al3=new ArrayList();

al2.add(9);
al2.add("d");
al2.add(al3);
System.out.println(al);
}


}
