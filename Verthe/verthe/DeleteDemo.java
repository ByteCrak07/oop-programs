class DeleteDemo

{

public static void main(String args[])

{

StringBuffer sb=new StringBuffer("Thiss is a test"); sb.delete(4,7);

System.out.println("after delete" +sb); // This a test 
sb.deleteCharAt(0);

// his a test

System.out.println("after deleteCharAt 0 "+sb);

}

}