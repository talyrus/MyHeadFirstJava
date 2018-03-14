package com.taly.StaticTests;

/**
 * Created by Taly on 14.03.2018.
 */
class StaticSuper{
	static {
		System.out.println("Родительский статический блок");
	}
	StaticSuper(){ //** конструктор
		System.out.println("Родительский конструктор");
	}
}

public class StaticTests extends StaticSuper {
	static int rand;

	static {
		rand = (int) (Math.random() * 6);
		System.out.println("Статический блок " + rand);
	}

	StaticTests(){
		System.out.println("Конструктор");
	}

	public static void main(String[] args) {
		System.out.println("Внутри main");
		StaticTests st = new StaticTests();
	}
}
