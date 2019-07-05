import java.util.*;

public class Bank{
	BankAccountManage BAM;
	
	Bank(){
		BAM = new BankAccountManage(); 
	}
	
	void start(){
		while(true){
			System.out.println("欢迎光临本银行!");
			System.out.println("请选择您的操作:");
			System.out.println("1. 账户管理");
			System.out.println("0. 退出");
			Scanner sc = new Scanner(System.in);
			int op = sc.nextInt();
			switch(op){
				case 1:
					BAM.start();//开始银行账户的管理
					break;
				case 0:
					System.out.println("成功退出系统!");
					exit(0);
					break;
				default:
					System.out.println("输入有误, 请重新输入!");
			}
		}
	}
}
