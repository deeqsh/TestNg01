package com.java.collections;


		
		import java.util.ArrayList;
		import java.util.HashMap;
		import java.util.HashSet;
		import java.util.Hashtable;
		import java.util.Iterator;
		import java.util.LinkedList;
		import java.util.Map;
		import java.util.TreeMap;
		import java.util.TreeSet;
		class Collections {
			public static void main(String args[]) {
				 testArrayList();
				 testLinkedList();
				 testHashSet();
				testHashmap();
			}
			public static void testArrayList() {
				ArrayList<String> arrList = new ArrayList<String>();
				arrList.add("Sohrab");
				arrList.add("Ahmad");
				arrList.add("Testing");
				arrList.add(0, "xyz");
				// System.out.print(arrList);
				System.out.println("List Size Before::: " + arrList.size());
				
				Iterator itr = arrList.iterator();
				
				while (itr.hasNext()) {
					System.out.println(itr.next());
				}
				arrList.remove("xyz");
				System.out.println("List Size After::: " + arrList.size());
			}
			public static void testLinkedList() {
				LinkedList<String> linkedList = new LinkedList<String>();
				linkedList.add("Sohrab");
				linkedList.add("Ahmad");
				linkedList.add("Testing");
				Iterator itr = linkedList.iterator();
				while (itr.hasNext()) {
					System.out.println(itr.next());
				}
			}
			public static void testHashSet() {
				ArrayList<String> hashSet = new ArrayList<String>();
				hashSet.add("Sohrab");
				hashSet.add("Ahmad");
				hashSet.add("Testing");
				hashSet.add("Sohrab");
				hashSet.add("Ahmad");
				hashSet.add("Testing");
				Iterator itr = hashSet.iterator();
				while (itr.hasNext()) {
					System.out.println(itr.next());
				}
			}
			public static void testHashmap() {
				HashMap<String, String> map = new HashMap<String, String>();// Creating
				// HashMap
				//TreeMap<String, String> map = new TreeMap<>();
				map.put("1", "Sohrab"); // Put elements in Map
				map.put("2", "Ahmad");
				map.put("3", "Testing");
				map.put("4", null);
			   // map.put("1", "Test"); // trying duplicate key
				System.out.println("Iterating Hashmap...");
				for (Map.Entry m : map.entrySet()) {
					System.out.println(m.getKey() + " " + m.getValue());
				}

}
		}
