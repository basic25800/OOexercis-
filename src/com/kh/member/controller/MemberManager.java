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
		System.out.println("�Է��� �Ϸ�Ǿ����ϴ�. ���θ޴��� ���ư��ϴ�.");

	}
	public void searchId() {
		System.out.print("�˻��� ���̵� �Է��ϼ��� : ");
		String id = sc.nextLine();
		for(int i = 0; i < marr.length; i++) {
			if(marr[i].getUserId().equalsIgnoreCase(id)) {
				printOne(marr[i]);
				break;
			} else {
				System.out.println("������ ȸ�� ������ �������� �ʽ��ϴ�.");
				break;
			}
		}
	}
	public void searchName() {
		System.out.println("�˻��� �̸��� �Է��ϼ��� : ");
		String name = sc.nextLine();
		for(int i = 0; i < marr.length; i++) {
			if(marr[i].getUserName().equalsIgnoreCase(name)) {
				printOne(marr[i]);
				break;
			} else {
				System.out.println("�˻��� ȸ�� ������ �������� �ʽ��ϴ�.");
				break;
			}
		}
	}
	public void searchEmail() {
		System.out.println("�˻��� �̸����� �Է��ϼ��� : ");
		String email = sc.nextLine();
		for(int i = 0; i < marr.length; i++) {
			if(marr[i].getEmail().equalsIgnoreCase(email)) {
				printOne(marr[i]);
				break;
			} else {
				System.out.println("�˻��� ȸ�� ������ �������� �ʽ��ϴ�. ");
				break;
			}
		}
	}
	public void updatePwd() {
		System.out.println("������ ȸ���� ���̵� �Է��ϼ��� : ");
		String id = sc.nextLine();
		for(int i = 0; i < marr.length; i++) {
			if(marr[i].getUserId().equalsIgnoreCase(id)) {
				System.out.println("������ ��й�ȣ : ");
				marr[i].setUserPwd(sc.nextLine());
				break;
			} else {
				System.out.println("�˻��� ȸ�� ������ �������� �ʽ��ϴ�.");
				break;
			}
		}
	}


	public void updateName() {
		System.out.println("������ ȸ���� �̸��� �Է��ϼ��� : ");
		String name = sc.nextLine();
		for(int i = 0; i < marr.length; i++) {
			if(marr[i].getUserName().equalsIgnoreCase(name)) {
				System.out.println("������ �̸� : ");
				marr[i].setUserName(sc.nextLine());
				break;
			} else {
				System.out.println("�˻��� ȸ�� ������ �������� �ʽ��ϴ�.");
				break;
			}
		}
			
	}
	public void updateEmail() {
		System.out.println("������ ȸ���� �̸����� �Է��ϼ��� : ");
		String email = sc.nextLine();
		for(int i = 0; i < marr.length; i++) {
			if(marr[i].getEmail().equalsIgnoreCase(email)) {
				System.out.println("������ �̸��� : ");
				marr[i].setEmail(sc.nextLine());
				break;
			}	else {
				System.out.println("�˻��� ȸ�� ������ �������� �ʽ��ϴ�.");
				break;
			}
		}
	}
	public void deleteOne() {
		System.out.println("Ż���� ȸ���� ���̵� �Է��ϼ��� : ");
		String id = sc.nextLine();
		for(int i = 0; i < marr.length; i++) {
			if(marr[i].getUserId().equalsIgnoreCase(id)) {
				marr[i+1] = marr[i];
				break;
			} else {
				System.out.println("������ ȸ�� ������ �������� �ʽ��ϴ�.");
				break;
			}
		}
		
	}
}