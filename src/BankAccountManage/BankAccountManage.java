package BankAccountManage;

import java.util.Scanner;
import java.util.ArrayList;
import java.lang.String;

//
public class BankAccountManage {


    public ArrayList<User> users=new ArrayList<User>();//所有的用户
    public void BAMstrat(){
		while(true){
			System.out.println("请选择您的操作:\n1. 注册\n2. 登陆\n0. 退出账户管理");
			Scanner scanner=new Scanner(System.in);
			
			int choose=scanner.nextInt();
			if(choose==0)
				return;
			while(choose!=1&&choose!=2){
				System.out.println("输入错误, 请重新输入!");
				choose=scanner.nextInt();
			}
			switch(choose) {
				case 1:
					addAccount();
					break;
				case 2:
					login();
					break;
			}
		}
    }
    public boolean addAccount(){

        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入用户名:");
        String userName=scanner.next();
        boolean nameNotExist=true;

        for(int i=0;i<users.size();i++){
            if(users.get(i).getName().equals(userName)){
                nameNotExist=false;
            }
        }


        if(userName.length()>=3&&userName.length()<=20&&nameNotExist) {

            System.out.println("请输入密码:");
            String p1=scanner.next();
            System.out.println("请再次输入密码:");
            String p2=scanner.next();
            if(p1.length()>0&&p1.equals(p2)){
                User temp=new User(userName,p1);
                users.add(temp);

                System.out.println("创建成功!");
                return true;
            }
            else{
                System.out.println("密码不同, 创建失败!");
                return false;
            }
        }
        else{
            System.out.println("用户名长度不符或用户名已经被占用, 创建失败!");
        }
        return false;
    }
    public void login(){
        Scanner scanner=new Scanner(System.in);
        int times=0;
        for(;times<3;times++) {
            System.out.println("请输入用户名:");
            String userName = scanner.next();
            System.out.println("请输入密码:");
            String password = scanner.next();
            boolean nameExist=false;
            int rightUser=0;
            for(;rightUser<users.size();rightUser++){
                if(users.get(rightUser).getName().equals(userName)){
                    nameExist=true;
                    break;//只跳出了找正确的用户的循环
                }
            }
            if (!nameExist) {//
                //没找到用户名
                System.out.println("用户名错误!");
                continue;
            }
            else if(!users.get(rightUser).login(userName,password)){
                //用户名对,密码不对
                System.out.println("密码错误!");
                continue;
            }


            break;
        }
        if(times==3)
            System.out.println("您已经三次输入错误, 退出登录!");

    }

}
