package main;

import calc.Calculator;

public class Main {

	public static void main(String[] args) {
		System.out.println("로컬저장소 ");
System.out.println("원격저장소사용가능");
System.out.println("일베저장소사용가능");
System.out.println("팀장코드마지막입니다");


System.out.println("팀장새코드시작");
System.out.println("끝");

		System.out.println("팀1입니다");
		System.out.println("팀2입니다");
		System.out.println("팀3입니다");

		Calculator cal = new Calculator();
		int addResult = cal.add(2, 1);
		System.out.println(addResult);
	}

}
