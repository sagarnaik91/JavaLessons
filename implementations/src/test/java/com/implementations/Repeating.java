package com.implementations;

import java.util.HashMap;
import java.util.Map;

public class Repeating {

	public static void main(String[] args) {
		String s1 = "i.am.an.automation.engineer";
		char[] c1=s1.toCharArray();
		Map<Character,Integer> map=new HashMap<>();
		for(int i=0;i<c1.length;i++)
		{
			if(map.containsKey(c1[i]))
			{
				map.put(c1[i], map.get(c1[i])+1);
			}
			else
			{
				map.put(c1[i], 1);
			}
		}
		for(Map.Entry<Character, Integer> m:map.entrySet())
		{
			if(m.getValue()>1)
			{
				System.out.println(m.getKey());
			}
		}

	}

}
