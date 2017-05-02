package reskill;
import java.util.*;
public class Gather {
  public static void main(String[] args) {
	  List list=new ArrayList();
	  int i=(int)(Math.random()*(list.size()-1));
	  list.add("a");
	  list.add("b");
	  list.add("c");
	  list.add("d");
	  list.add("e");
	  list.add("f");
	  System.out.println("i="+i);
	  System.out.println("随机获取数组中的元素:"+list.get(i));
	  list.remove(2);
	  System.out.println("将索引是'2'的元素从数组移除后，数组中的元素是:");
	  for(int j=0;j<list.size();j++) {
		  System.out.print(list.get(j)+" ");
	  }
	  
  }
}

