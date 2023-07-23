package com.oops;

import com.string.StringOccurCharacter;

public class InstanceBlock {
	public InstanceBlock() {
		System.out.println("siddiqui...");
	}
	{
		System.out.println("sameer...");
	}
	{
		System.out.println("byy...");
	}
	public static void main(String args[])
	{
		new InstanceBlock();
		new InstanceBlock();
	}

}
