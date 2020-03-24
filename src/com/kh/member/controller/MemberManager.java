package com.kh.member.controller;

import java.util.Scanner;

import com.kh.member.model.vo.Member;

public class MemberManager {
	private Member[] marr = new Member[10];
	private static int ctn = 0;
	private Scanner sc = new Scanner(System.in);

	public MemberManager() {}

	public void insertMember() {
		for(int i = 0; i < marr.length; i++) {
			System.out.print("Id : ");
			String id = sc.nextLine();
			System.out.print("Password : ");
			String pwd = sc.nextLine();
			System.out.print("Name : ");
			String name = sc.nextLine();
			System.out.print("age : ");
			int age = sc.nextInt();
			System.out.print("gender : ");
			char gender = sc.nextLine().charAt(0);
			System.out.print("email : ");
			String email = sc.nextLine();

			marr[i] = new Member(id, pwd, name, age, gender, email);
			ctn ++;

		}
		System.out.println("입력이 완료되었습니다. 메인메뉴로 돌아갑니다.");

	}


}
