import java.io.*;
class ByteArrayInputStreamExample
{
public static void main(String args[]) throws IOException
{
byte b[]="this is my first program".getBytes();
ByteArrayInputStream inp= new ByteArrayInputStream(b);
int n=inp.available();
System.out.println(" Number of available bytes:" +n);
long s=inp.skip(11);
int i,j;
System.out.println(" Strings after skipping "+s+"bytes");
while((i=inp.read()) !=-1)
{
System.out.print((char)i);
}
inp.reset();

System.out.println();
System.out.print("String in uppercase :");
while((j=inp.read())!=-1)
{
System.out.print(Character.toUpperCase((char) j));
}
}
}