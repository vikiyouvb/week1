package com.test;

import com.temp.Bag;

public class BagDemo
{
	public static void main(String args[])
	{
		Bag<Integer> b=new Bag<Integer>();
		b.add(1);
		b.add(2);
		b.add(3);
		for(Integer i:b)
		{
			System.out.println(i);
		}
	}
}
