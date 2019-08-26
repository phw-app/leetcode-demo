package com.phw.demo;

import java.util.HashMap;
import java.util.Map;

public class demo1501 {
    public static void main(String[] args) {
        String[] words={"cat","bt","hat","tree"};
        Map<Character,Integer> charMap=new HashMap<Character,Integer>();
        int[] wordsL=new int[words.length];
        String chars="atach";
        int res=0;
        for (int i = 0; i < chars.length(); i++) {
            if(charMap.containsKey(chars.charAt(i))){
                charMap.put(chars.charAt(i),charMap.get(chars.charAt(i))+1);
            }else{
                charMap.put(chars.charAt(i),1);
            }
        }
        for (int i = 0; i < words.length; i++) {
            Map<Character,Integer> charMapNew=new HashMap<Character,Integer>();
            charMapNew.putAll(charMap);
            boolean b=true;
            for (int j = 0; j < words[i].length(); j++) {
                if(charMapNew.containsKey(words[i].charAt(j))&&charMapNew.get(words[i].charAt(j))>0){
                    charMapNew.put(chars.charAt(i),charMapNew.get(chars.charAt(i))-1);
                }else{
                    b=false;
                    break;
                }
            }
            if(b){
                res+=words[i].length();
            }
        }
    }
}
