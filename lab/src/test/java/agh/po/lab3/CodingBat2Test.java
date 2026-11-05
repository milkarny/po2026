package agh.po.lab3;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.HashMap;
import java.util.Map;

public class CodingBat2Test {

    CodingBat2 cb=new CodingBat2();

    @Test
    public void mapAB2() {
        Map<String,String> m1=new HashMap<>(Map.of("a","aaa","b","aaa","c","cake"));
        assertEquals(Map.of("c","cake"),cb.mapAB2(m1));

        Map<String,String> m2=new HashMap<>(Map.of("a","aaa","b","bbb"));
        assertEquals(Map.of("a","aaa","b","bbb"),cb.mapAB2(m2));

        Map<String,String> m3=new HashMap<>(Map.of("a","aaa","b","bbb","c","aaa"));
        assertEquals(Map.of("a","aaa","b","bbb","c","aaa"),cb.mapAB2(m3));
    }

    @Test
    public void wordCount() {
        assertEquals(Map.of("a",2,"b",2,"c",1),cb.wordCount(new String[]{"a","b","a","c","b"}));
        assertEquals(Map.of("a",1,"b",1,"c",1),cb.wordCount(new String[]{"c","b","a"}));
        assertEquals(Map.of("c",4),cb.wordCount(new String[]{"c","c","c","c"}));
    }
}