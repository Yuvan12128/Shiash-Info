import java.util.ArrayList;
import java.util.Scanner;
class test5{
	
public static void main(String [] args){
   Collection();
   ArrayList();
   forEach();
   	pattern(); 
   	pattern2();
    bank();
	anagram();
 }






public static void Collection(){
/* collection is an interface which os present in java.util package
    collection is dynamicin size we can increase or decrese the sizw of the cokkection object
    colletion allows inly non primitive data typein java 
    collection allowes to store the heterogeneous data type values
*/
ArrayList al=new ArrayList();
al.add(10);
al.add("Yuvan Shankar");
al.add('D');
al.add(true);
System.out.println(al);

System.out.println("before contains "+al.contains(10));
System.out.println(al.size());
al.removeAll(al);
System.out.println(al);
System.out.println("after cantains "+al.contains(10));
}
public static void ArrayList(){
/*It's a class in Java's Collections Framework used to store a
 dynamically resizable array of objects
 we can perform opreations in the data like inserting, deleting, 
sorting, updation a group of interfaces and classess object which 
has been stored in a single entity is called collection */
System.out.println("Yuvan Shankar");
}
public static void forEach(){
/*
for Loop:
--------
    it uses an ondex of an element to fetch from an array.
foreach loop:
------------
It uses an iteration variation variable to automatically fetch ada from an array.

*/
int [] a={10,30,20,50,40};
for(int i=0;i<a.length;i++){
System.out.println(a[i]);
}
for(int j:a){
System.out.println(j);
}
}
public  static void pattern(){
		for(int i=1;i<=5;i++){
	   for(int j=1;j<=i;j++){
       System.out.print(" ");	   
       }
		for(int j=1;j<=6-i;j++){
		System.out.print("* ");		
		}
		System.out.println();
		}
		
		for(int i=1;i<=5;i++){
		    for(int j=1;j<=6-i;j++){
		        System.out.print(" ");
		    }
		for(int j=1;j<=i;j++){
		System.out.print("* ");
		}
		System.out.println();
		}
		}
private static void pattern2() {
	char a='a';
	for(int i=1;i<=6;i++){
	    for(int j=1;j<=6-i;j++){
	        System.out.print(" ");
	    }
	for(int j=1;j<=i;j++){
		
	System.out.print(a+" ");
	a++;
	}
	System.out.println();
	}
	

for(int i=1;i<=5;i++){
	   for(int j=1;j<=i;j++){
    System.out.print(" ");	   
    }
		for(int j=1;j<=6-i;j++){
		System.out.print(a+" ");
		a++;
		}
		System.out.println();
		}
}
private static void bank() {
	short pin=1212;
	double balance=100;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your pin :");
	 short upin=sc.nextShort();
	if(pin==upin) {
		System.out.println("Welcome Shiars Bank");
		System.out.println("1.With Draw Money");
		System.out.println("2.deposit Money");
		System.out.println("3.Check Balance");
		System.out.println("4.Exit");
		short i=sc.nextShort();
		if(i==1) {
			System.out.print("Plese Enter Your Amount :");
			int amount=sc.nextInt();
			if(balance>amount) {
				
				System.out.println("Take Your Cash");
				System.out.println("Your Balance is "+(balance-amount)+"/-");
			}else System.err.println("Plese Check Your Balance");
		}else if(i==2) {
			System.out.println("Plese Insert Your Money");
			int amoney=sc.nextInt();
			System.out.println("Your Current Balance is : "+(balance+amoney)+"/-");
		}
		else if(i==3) {
			System.out.println("Your Current Balance is "+balance+"/-");
		}else if(i==4) {
			System.out.println("Thank Your");
			sc.close();
		}
		
	}else { System.err.println("plese Check Your Pin");}
	
}

private static void anagram() {
	String a="hello";
	String b="mens";
	int count = 0;
	
	char[]a1=a.toCharArray();
	char[]b1=b.toCharArray();
	
	if(a1.length==b1.length) {
		for(int i=0;i<a1.length;i++) {
			char ch=a1[i] ;
			for(int j=0;j<b1.length;j++) {
				if(ch==b1[j]) {
					b1[j]='\n';
					count++;
					break;
				}
			}
		}if(count==b.length()) {
			System.out.println(true);
		}
		
	}else System.out.println(false);
	
}
}










