import java.util.*;
import BankAccountManage.*;

public class Bank{
	
	BankAccountManage BAM;
	
	Bank(){
		BAM = new BankAccountManage(); 
	}
	
	void start(){
		BAM.loadUsers();
		System.out.println("欢迎光临本银行!");
		while(true){
			try{
				System.out.println("请选择您的操作:");
				System.out.println("1. 账户管理");
				System.out.println("0. 退出系统");
				Scanner sc = new Scanner(System.in);
				int op = sc.nextInt();
				switch(op){
					case 1:
						BAM.BAMstrat();//开始银行账户的管理
						break;
					case 0:
						BAM.storeUsers();
						System.out.println("成功退出系统!");
						System.exit(0);
						break;
					default:
						System.out.println("输入有误, 请重新输入!");
				}
			}
			catch(java.util.InputMismatchException e){
				System.out.println("请勿输入与说明不符的操作符, 否则会退回主界面!");
			}
		}
	}
}
