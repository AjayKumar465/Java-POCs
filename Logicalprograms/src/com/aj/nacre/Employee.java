package com.aj.nacre;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Employee {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Iterator<Entry<String, String>> it = null;
		Map<String, String> map = new HashMap<String, String>();
		map.put("101", "ajay");
		map.put("301", "cyan");
		map.put("201", "zen");
		map.put("202", "ben");


		System.out.println("emp details are");
		Set<Entry<String, String>> e1 = map.entrySet();
		it = e1.iterator();
		while (it.hasNext())
			System.out.println(it.next());

		System.out.println("Sort by ");
		System.out.println(" Name for enter 1 or Sort by Number for 2");
		String sort = sc.nextLine();
		if (sort != null && sort.equals("2")) {
			TreeMap<String, String> map1 = new TreeMap<String, String>(map);
			Set<Entry<String, String>> e = map1.entrySet();
			it = e.iterator();
			while (it.hasNext())
				System.out.println(it.next());

		} else if (sort != null && sort.equals("1")) {
			map = sortByValue(map);
			Set<Entry<String, String>> e2 = map.entrySet();
			it = e2.iterator();
			while (it.hasNext())
				System.out.println(it.next());
		}
	}

	public static <K, V extends Comparable<? super V>> Map<K, V> sortByValue(Map<K, V> unsortMap) {

		List<Map.Entry<K, V>> list = new LinkedList<Map.Entry<K, V>>(unsortMap.entrySet());

		Collections.sort(list, new Comparator<Map.Entry<K, V>>() {
			public int compare(Map.Entry<K, V> o1, Map.Entry<K, V> o2) {
				return (o1.getValue()).compareTo(o2.getValue());
			}
		});

		Map<K, V> result = new LinkedHashMap<K, V>();
		for (Map.Entry<K, V> entry : list) {
			result.put(entry.getKey(), entry.getValue());
		}

		return result;

	}
}
