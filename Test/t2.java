class t2{
public static void main(String [] args){
HashMap<Integer,String> map=new HashMap<Integer,String>();
map.put(1,"harry");
map.put(2,"shankar");
map.put(3,"dhoni");
map.put(4,"yuvan");


for(Map.Entry entry:map.entrySet()){

System.out.println(entry.getKey()+"   "+entry.getValue());
}

}


}
