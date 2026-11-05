package agh.po.lab3;

import java.util.HashMap;
import java.util.Map;

public class CodingBat2 {

    public Map<String,String> mapAB2(Map<String,String> map) {
        if(map.containsKey("a") && map.containsKey("b")) {
            if(map.get("a").equals(map.get("b"))) {
                map.remove("a");
                map.remove("b");
            }
        }
        return map;
    }

    public Map<String,Integer> wordCount(String[] strings) {
        Map<String,Integer> mapa=new HashMap<>();
        for(String s:strings) {
            if(mapa.containsKey(s)) {
                mapa.put(s,mapa.get(s)+1);
            } else {
                mapa.put(s,1);
            }
        }
        return mapa;
    }

    public static void main(String[] args){Map<String,String> m1=new HashMap<>();
        CodingBat2 cb=new CodingBat2();
        m1.put("a","aaa");
        m1.put("b","aaa");
        m1.put("c","cake");
        System.out.println(cb.mapAB2(m1));

        Map<String,String> m2=new HashMap<>();
        m2.put("a","aaa");
        m2.put("b","bbb");
        System.out.println(cb.mapAB2(m2));

        System.out.println(cb.wordCount(new String[]{"a","b","a","c","b"}));
        System.out.println(cb.wordCount(new String[]{"c","c","c","c"}));}
}
