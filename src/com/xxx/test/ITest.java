package com.xxx.test;


public interface ITest {
	default void sysHello() {
		System.out.println("hello world");
	}
}

