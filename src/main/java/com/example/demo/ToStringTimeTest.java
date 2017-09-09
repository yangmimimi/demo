package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ToStringTimeTest {

	public static void main(String[] args) {

		/***
		 * 把一个基本数据类型转为字符串，基本数据类型.toString()是最快的方式、String.valueOf(数据)次之、数据+””最慢
		 */

		int loopTime = 5000000;

		Integer i = 0;
		long startTime = System.currentTimeMillis();
		for (int j = 0; j < loopTime; j++) {

			String str = String.valueOf(i);

		}

		System.out.println("String.valueOf()：" + (System.currentTimeMillis() - startTime) + "ms");

		startTime = System.currentTimeMillis();
		for (int j = 0; j < loopTime; j++) {

			String str = i.toString();

		}

		System.out.println("Integer.toString()：" + (System.currentTimeMillis() - startTime) + "ms");

		startTime = System.currentTimeMillis();
		for (int j = 0; j < loopTime; j++) {

			String str = i + "";

		}

		System.out.println("i + \"\"：" + (System.currentTimeMillis() - startTime) + "ms");
	}
}
