package com.phw.demo;

import java.util.HashMap;
import java.util.Map;

class demo4 {
    private int[] arr;
    public demo4(int[] arr) {
        this.arr = arr;
    }

    public int query(int left, int right, int threshold) {
        int[] cnt = new int[20010];
        for (int i = left; i <= right; i++) {
            int num = this.arr[i];
            cnt[num]++;
            if (cnt[num] >= threshold) return num;
        }
        return -1;
    }
    public int query1(int left, int right, int threshold) {
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = left; i <= right; i++) {
            if(map.containsKey(arr[i])){
                int t=map.get(arr[i])+1;
                map.put(arr[i],t);
            }else{
                map.put(arr[i],1);
            }
        }
        for (Integer i:map.keySet()) {
            if(map.get(i)>=threshold){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        demo4 majorityChecker = new demo4(new int[]{1, 1, 2, 2, 1, 1});
        System.out.println(majorityChecker.query(0,5,4)); // 返回 1
        System.out.println(majorityChecker.query(0,3,3)); // 返回 -1
        System.out.println(majorityChecker.query(2,3,2));
    }
}
