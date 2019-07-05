package BankAccountManage;

import java.util.Scanner;
import java.util.ArrayList;
import java.lang.String;

//
public class BankAccountManage {
    public ArrayList<String> userAndPassword;
    //TODO  上方 是文件中的用户名和密码

    public ArrayList<User> users;//所有的用户
    public void BAMstrat(){
        System.out.println("注册/1 登陆/2");
        Scanner scanner=new Scanner(System.in);
        int choose=scanner.nextInt();
        switch(choose) {
            case 1:
                addAccount();
                break;
            case 2:
                login();
                break;
        }
    }
    public boolean addAccount(){

        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入用户名");
        String userName=scanner.next();
        if(userName.length()>=3&&userName.length()<=20&&true) {//TODO

            System.out.println("请输入密码");
            String p1=scanner.next();
            System.out.println("请再次输入密码");
            String p2=scanner.next();
            if(p1.length()>0&&p1.equals(p2)){
                //放入数组  TODO
                user temp=new user(userName,p1);

                //需要修改  TODO
                System.out.println("创建成功");
                return true;
            }
            else{
                System.out.println("密码不同,创建失败");
                return false;
            }
        }
        return false;
    }
    public void login(){
        Scanner scanner=new Scanner(System.in);

        for(int times=0;times<3;times++) {
            System.out.println("请输入用户名");
            String userName = scanner.next();
            System.out.println("请输入密码");
            String password = scanner.next();
            if () {//TODO
                //没找到用户名
                System.out.println("用户名错误");
                continue;
            }
            if(){//TODO
                //用户名对,密码不对
                System.out.println("密码错误");
                continue;
            }
            manage(userName);
            break;
        }
        System.out.println("您已经三次输入错误,系统退出");

    }
    public void manage(String userName){
        //TODO

        for(int i=0;i<users.size();i++){
            if(users[i].name.equals(userName)&&) {//TODO
                user.start();//TODO
                break;
            }
        }

    }
}
