package BankAccountManage;

import java.util.*;
import entity.card.*;
import entity.factory.*;

public class User{
	public static final int MAX_CARD_NUM = 5;
	public static final factory FACTORY = new factory();
	private String name;
	private String password;
	private Card []cards;
	private int cardNum;

	User(String name, String password){
		this.name=name;
		this.password=password;
		this.cardNum=0;
		cards = new Card[MAX_CARD_NUM];
	}

	String getName(){
		return this.name;
	}
	
	boolean setName(String oldName, String oldPassword, String newName){//日后设置用户名
		if(check(oldName, oldPassword)){
			this.name=newName;
			return true;
		}
		return false;
	}

	boolean setPassword(String oldName, String oldPassword, String newPassword){//日后设置密码
		if(check(oldName, oldPassword)){
			this.password=newPassword;
			return true;
		}
		return false;
	}

	private boolean check(String name, String password){//检查用户名和密码是否匹配
		if(this.name.equals(name) && this.password.equals( password))
			return true;
		return false;
	}

	boolean login(String name, String password){
		if(check(name, password)){
			System.out.println("登录成功!");
			while(true){
				System.out.println("请选择服务:");
				System.out.println("1. 办卡");
				System.out.println("2. 选卡");
				System.out.println("0. 退出登录");
				Scanner sc = new Scanner(System.in);
				int op = sc.nextInt();
				switch(op){
					case 1:
						makeCard();
						break;
					case 2:
						chooseCard();
						break;
					case 0:
						return true;
					default:
						System.out.println("输入有误, 请重新输入!");
				}
			}
		}
		return false;
	}

	private void makeCard(){
		if(cardNum==MAX_CARD_NUM){
			System.out.println("您办理的卡的数量已达到最大值(5), 不能继续办理!");
			return;
		}
		while(true){
			System.out.println("请输入您想办理的卡的种类:");
			System.out.println("1. 储蓄卡");
			System.out.println("2. 信用卡");
			System.out.println("0. 退出办卡");
			Scanner sc = new Scanner(System.in);
			int op = sc.nextInt();
			switch(op){
				case 1:
					cards[cardNum] = FACTORY.addCard(op);
					cards[cardNum].show();
					cardNum++;
					return;
				case 2:
					cards[cardNum] = FACTORY.addCard(op);
					cards[cardNum].show();
					cardNum++;
					return;
				case 0:
					return;
				default:
					System.out.println("输入有误, 请重新输入!");
			}
		}
	}

	private void chooseCard(){
		while(true){
			System.out.println("您的卡的信息如下:");
			for(int i=0;i<cardNum;++i){
				System.out.println("Card"+(i+1));
				cards[i].show();
			}
			System.out.println("请选择银行卡进行操作(输入 0 退出):");
			Scanner sc = new Scanner(System.in);
			int op = sc.nextInt();
			if(op<0 || op>cardNum)
				System.out.println("输入有误, 请重新输入");
			else if(op==0)
				return;
			else{
				cards[op-1].start();
				return;
			}
		}
	} 
}
