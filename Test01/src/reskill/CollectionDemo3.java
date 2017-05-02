package reskill;
import java.util.*;
public class CollectionDemo3 {
   public static void main(String[] args) {
	   Set<People> hashSet=new HashSet<People>();
	   hashSet.add(new People("陈同学",201101));
	   hashSet.add(new People("王同学",201102));
	   hashSet.add(new People("李同学",201103));
	   Iterator<People> it=hashSet.iterator();
	   System.out.println("集合中的元素是:");
	   while(it.hasNext()) {
		   People person=it.next();
		   System.out.println(person.getName()+"  "+person.getid_card());
	   }
   }
}
