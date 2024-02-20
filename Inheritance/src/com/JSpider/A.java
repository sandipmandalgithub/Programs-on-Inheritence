package com.JSpider;
// HIERARCHICAL LEVEL INHERITANCE IN JAVA

public class A {
	void see() {
		System.out.println("a is parent class ...........");
	}

}

class B extends A{
	void take1() {
	System.out.println("b extends properties from class a.....");
}
}

class C extends A{
	void take2() {
		System.out.println("c is also extends properties from class a.......");
	}
}

