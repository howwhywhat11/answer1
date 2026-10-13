package numberone;

import java.util.Scanner;

public class bank {
    public static void main(String[] args) {
        long money = 0L ;//使用一个long变量来存储账户余额，初始值为 0。（不考虑小数情况）
        int xuanze;//定义出一个“选择”
        do {
        /*程序启动后，显示一个欢迎菜单，提供以下选项：
        1.存款
        2.取款
        3.查询余额
        4.退出                                    */
            System.out.println("欢迎，请选择一个选项（填写数字）");
            System.out.println("1.存款");
            System.out.println("2.取款");
            System.out.println("3.查询余额");
            System.out.println("4.退出");

            Scanner sc = new Scanner(System.in);

            xuanze = sc.nextInt(); //记录用户的选择

            switch (xuanze) {
                case 1:System.out.println("输入存款金额");
                    long cunkuan = sc.nextLong();
                    money = money + cunkuan;
                    System.out.println("当前余额为" + money);
                    break;
                case 2:System.out.println("输入取款金额");
                    long qukuan = sc.nextLong();
                    if (qukuan <= money) {
                        money = money - qukuan;
                        System.out.println("当前余额为" + money);
                    } else {
                        System.out.println("余额不足");
                    }
                    break;
                case 3:
                    System.out.println("当前余额为" + money);
                    break;
                case 4:
                    System.out.println("谢谢使用！");
                    break;
                default:
                    System.out.println("请输入有效选项");
                    break;
            }
        }while (xuanze != 4);

    }
}
