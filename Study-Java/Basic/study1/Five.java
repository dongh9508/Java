import java.util.Scanner;

interface StackInterface{
	
 int length();
 String pop();
 boolean push(String ob);
}

class StringStack implements StackInterface{
	
 public StringStack(){}
 
 String [] s = new String[5];
 int i = 0;
 
 public int length(){return i+1;}
 
 public String pop(){return s[--i];}
 
 public boolean push(String ob){
	 
  if(i==5)
   return false;
  else
   s[i++] = ob;
      return true;
 }
 
}

public class Five {
 public static void main(String[] args){
  Scanner scan = new Scanner(System.in);
  StringStack stack = new StringStack();
  System.out.print(">>");
  for(int i=0; i<5; i++)
  {
   String ob = scan.next();
   stack.push(ob);
  }
  for(int i=0; i<5; i++)
  {
   System.out.print(stack.pop()+" ");
  }
  scan.close();  
 }
}




