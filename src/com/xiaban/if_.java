package com.xiaban;

import java.util.Scanner;

public class if_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("星期几：");
        String day = scanner.next();
        switch(day){
            case "Monday":
                System.out.println("星期一");
                break;
            case "Tuesday":
                System.out.println("星期二");
                break;
            case "Wednesday":
                System.out.println("星期三");
                break;
            case "Thursday":
                System.out.println("星期四");
                break;
            case "Friday":
                System.out.println("星期五");
                break;
            case "Saturday":
                System.out.println("星期六");
                break;
            case "Sunday":
                System.out.println("星期天");
                break;
            default:
                System.out.println("输入有误");
        }
    }
}
