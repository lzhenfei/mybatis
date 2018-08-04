package com.tiamaes.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.junit.Test;

public class Test2 {

	@Test
	public void find() {
//		Map<String, String> map = new HashMap<>();
//		map.put("123", "adc");
//		map.get("123");
	}
	@Test
	public void test2() {
		int[] array={1,2,3,4,5};
		for (int i=0;i<array.length-1;i++){
			for (int j=i+1;j<array.length;j++){
				int temp=array[i];
				array[i]=array[j];
				array[j]=temp;
				
			}
		}
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
	}
	@Test
	public void test3(){
		float a=(float) 0.2;
		while(a<1){
			a=(float) (a+0.2);
			System.out.println(a);
		}
	}
	@Test
	public void test4(){
		int i=1;
		int a=i++;
		System.out.println(a);
	}
}
