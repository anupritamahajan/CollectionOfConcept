package com.inportia;

import java.util.*;

public class MainGate {
	List<String> ll;
	Set<String> lll;
	Map<Character,String> mm;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainGate obj=new MainGate(); 
		obj.implementingArreyList();
		obj.implementingHashSet();
		obj.implementingTreeList();
		obj.implementingHashMap();
	}
	public void implementingArreyList() {
		ll=new ArrayList<String>();
		ll.add("229");
		//ll.add(221);
		//ll.add(22);
		System.out.println(ll);
		ll.add(null);
		this.displayListElements(ll);
	}
	
	public void displayListElements(List<String>list) 
	{
		int len =list.size();
		for(int index=0;index<len;index++) {
			System.out.println("Value of index:"+index+"is"+list.get(index));
		}
	}
	
	public void implementingLinkedList() {
		ll= new LinkedList();
		ll.add("23323");
		System.out.println(ll);
	}
	
	public void implementingVector() {}
	
	public void implementingHashSet() {
		lll=new HashSet<String>();
		lll.add("anuja");
		lll.add("eme");
		System.out.println(lll);
		this.displaySetElements(lll);
	}
	public void displaySetElements(Set<String>Set) {
		Iterator<String>itr=Set.iterator();
		while(itr.hasNext()) {
			System.out.println("Value is:"+itr.next());
		}
	}
	
	public void implementingLinkedHashset() {
		
	}
	
	public void implementingtreeSet() {}
	
	public void implementingHashMap() {
		mm=new LinkedHashMap<Character,String>();
		mm.put('D',"don");
		mm.put('n',"don1");
		System.out.println(mm);
		this.displayMapElements(mm);
		
	}
	public void displayMapElements(Map<Character,String> map) {
		Set<Character>keys=map.keySet();
		for(Character kk:keys) {
			System.out.println("value of key="+kk+":is"+map.get(kk));
			
		}
	}
	
	public void implementingTreeList() {
		lll=new TreeSet<String>();
	//	lll=new add();
		lll.add("anuja");
		System.out.println(ll);
		ll.add(null);
	}
	
	}