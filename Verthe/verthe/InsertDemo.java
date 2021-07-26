class InsertDemo

{

public static void main(String args[])

{

StringBuffer sb=new StringBuffer("I Java!"); 
System.out.println(" capacity = "+sb.capacity( ));
sb.insert(2,"like");

System.out.println(sb); //I likeJava!
System.out.println(" length = "+sb.length());// 11
System.out.println(" capacity = "+sb.capacity( ));

}

}