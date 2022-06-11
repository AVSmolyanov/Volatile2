package com.company;
import java.util.concurrent.atomic.LongAdder;

public class Counter  {
    
    public static LongAdder sum = new LongAdder();

    public int[] sales(){
        int qty = (int) (Math.random()*100)+1;
        int data[] = new int[qty];

        for (int i=0;i<data.length;i++) {
            data[i] = (int) (Math.random()*1000)+1;
        }
        return data;
    }

    public void summa(int[] data) {
        Integer result = 0;
        for (int i:data) {
            this.sum.add(i);
        }
    }

    public Integer getSum(){
        return sum.intValue();
    }

}

