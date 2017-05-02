package reskill;

import java.util.*;

public class CollectionDemo {
	public static void main(String[] args) {
		String a="A",b="B",c="C",d="D",e="E";
		List<String> list=new LinkedList<String>();
		list.add(a);
		list.add(e);
		list.add(d);
		Iterator<String> firstlterator=list.iterator();
		System.out.println("修改前集合中的元素是:");
		while(firstlterator.hasNext()) {
			System.out.print(firstlterator.next()+" ");
		}
		list.set(1, b);
		list.add(2,c);
		
		Iterator<String> it=list.iterator();
		System.out.println();
		System.out.println("修改后集合中的元素是:");
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
	}

}
