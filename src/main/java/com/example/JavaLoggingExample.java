package com.example;

import java.util.logging.Logger;

public class JavaLoggingExample {

	
	static Logger log = Logger.getLogger(JavaLoggingExample.class.getName());
	
	
	public static void main(String[] args) {

		System.out.println("Hello Sysout logging....");
		
		/*
		 * 로깅 라이브러리
		 * 로그에 대한 메타 데이터까지 출력 : 파일 이름, 메소드
		 * but 실제로 이 자바의 로거 객체를 사용하는 경우가 거의 없고, 다른 라이브러리를 사용한다.
		 * 제일 대표적인건 commons log --> 하둡, spring도 이거 사용
		 */
		log.info("Hello Java 내장 로그로 출력...");
		
	}

}
