package reskill;

public class OuterClass {
   innerClass in=new innerClass();
   public void out() {
	   in.inf();
   }
   class innerClass {
   innerClass() {
		   
	   }
	   public void inf() {
		   
	   }
	   int y=0;
   }
   public innerClass doit() {
	   in.y=4;
	   return new innerClass();
   }
   
   public static void main(String args[] ) {
	   OuterClass out=new OuterClass();
	   OuterClass.innerClass in=out.doit();
   }
 }

   

