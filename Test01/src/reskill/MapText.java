package reskill;
import java.util.*;
public class MapText {
   public static void main(String[] args) {
	   Map map=new HashMap();
	   Emp emp=new Emp("001","张三");
	   Emp emp4=new Emp("100","飞哥");
	   Emp emp2=new Emp("005","李四");
	   Emp emp3=new Emp("004","王一");
	   map.put(emp.getEid(), emp.getEname());
	   map.put(emp4.getEid(), emp4.getEname());
	   map.put(emp2.getEid(), emp2.getEname());
	   map.put(emp3.getEid(), emp3.getEname());
	   Set set=map.keySet();
	   Iterator it=set.iterator();
	   System.out.println("HashMap类实现的Map集合，无序");
	   while(it.hasNext()) {
		   String str=(String)it.next();
		   String name=(String)map.get(str);
		   System.out.println(str+" "+name);
	   }
	   
	   TreeMap treemap=new TreeMap();
	   treemap.putAll(map);
	   Iterator iter=treemap.keySet().iterator();
	   System.out.println("TreeMap类实现的Map集合，键对象升序");
	   while(iter.hasNext()) {
		   String str=(String) iter.next();
		   String name=(String) map.get(str);
		   System.out.println(str+"  "+name);
	   }
   }
}
