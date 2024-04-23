class sec{
public void printobj(Object o){
System.out.println("Object class");

}
public void printobj(String o){
System.out.println("String class");


}
public void printobj(sec o){
System.out.println("Secound class");
}
public static void main(String []args){

sec o=new sec();
o.printobj(null);
}
}
