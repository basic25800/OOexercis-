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
	public void searchId() {
		System.out.print("검색할 아이디를 입력하세요 : ");
		String id = sc.nextLine();
		for(int i = 0; i < marr.length; i++) {
			if(marr[i].getUserId().equalsIgnoreCase(id)) {
				printOne(marr[i]);
				break;
			} else {
				System.out.println("삭제할 회원 정보가 존재하지 않습니다.");
				break;
			}
		}
	}
	public void searchName() {
		System.out.println("검새할 이름을 입력하세요 : ");
		String name = sc.nextLine();
		for(int i = 0; i < marr.length; i++) {
			if(marr[i].getUserName().equalsIgnoreCase(name)) {
				printOne(marr[i]);
				break;
			} else {
				System.out.println("검색할 회원 정보가 존재하지 않습니다.");
				break;
			}
		}
	}
	public void searchEmail() {
		System.out.println("검색할 이메일을 입력하세요 : ");
		String email = sc.nextLine();
		for(int i = 0; i < marr.length; i++) {
			if(marr[i].getEmail().equalsIgnoreCase(email)) {
				printOne(marr[i]);
				break;
			} else {
				System.out.println("검색한 회원 정보가 존재하지 않습니다. ");
				break;
			}
		}
	}
	public void updatePwd() {
		System.out.println("수정할 회원의 아이디를 입력하세요 : ");
		String id = sc.nextLine();
		for(int i = 0; i < marr.length; i++) {
			if(marr[i].getUserId().equalsIgnoreCase(id)) {
				System.out.println("변경할 비밀번호 : ");
				marr[i].setUserPwd(sc.nextLine());
				break;
			} else {
				System.out.println("검색할 회원 정보가 존재하지 않습니다.");
				break;
			}
		}
	}


	public void updateName() {
		System.out.println("수정할 회원의 이름을 입력하세요 : ");
		String name = sc.nextLine();
		for(int i = 0; i < marr.length; i++) {
			if(marr[i].getUserName().equalsIgnoreCase(name)) {
				System.out.println("변경할 이름 : ");
				marr[i].setUserName(sc.nextLine());
				break;
			} else {
				System.out.println("검색할 회원 정보가 존재하지 않습니다.");
				break;
			}
		}
			
	}
	public void updateEmail() {
		System.out.println("수정할 회원의 이메일을 입력하세요 : ");
		String email = sc.nextLine();
		for(int i = 0; i < marr.length; i++) {
			if(marr[i].getEmail().equalsIgnoreCase(email)) {
				System.out.println("변경할 이메일 : ");
				marr[i].setEmail(sc.nextLine());
				break;
			}	else {
				System.out.println("검색할 회원 정보가 존재하지 않습니다.");
				break;
			}
		}
	}
	public void deleteOne() {
		System.out.println("탈퇴할 회원의 아이디를 입력하세요 : ");
		String id = sc.nextLine();
		for(int i = 0; i < marr.length; i++) {
			if(marr[i].getUserId().equalsIgnoreCase(id)) {
				marr[i+1] = marr[i];
				break;
			} else {
				System.out.println("삭제할 회원 정보가 존재하지 않습니다.");
				break;
			}
		}
		
	}
}