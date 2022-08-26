package com.turnitin.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class WordCountFrequency {
	public static void main(String[] args) {
        String str = "the cat is in the bag";

        Map<String,Integer> map=new HashMap<>();
        String strings[]=str.split(" ");

        for(int i=0;i<strings.length;i++){
            if(map.containsKey(strings[i]))
                map.put(strings[i], map.get(strings[i])+1);
            else
                map.put(strings[i],1);
        }

        Map<String,Integer> sortedMap = sortByValue(map);

        for(Map.Entry<String,Integer> entry: sortedMap.entrySet())
        {
            System.out.println(entry.getValue() + " " + entry.getKey());
        }
    }

    public static HashMap<String, Integer> sortByValue(Map<String, Integer> hm)
    {
        List<Map.Entry<String, Integer> > list = new ArrayList<>(hm.entrySet());

        Collections.sort(list, (o1, o2) -> (o2.getValue()).compareTo(o1.getValue()));

        HashMap<String, Integer> sorted = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            sorted.put(entry.getKey(), entry.getValue());
        }
        return sorted;
    }

}