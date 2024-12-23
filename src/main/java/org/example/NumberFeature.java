package org.example;

import java.util.Scanner;

public class NumberFeature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 读取输入的非负整数
        int number = scanner.nextInt();
        int result = 0;
        int position = 1; // 数位从1开始计数
        int bitValue = 1; // 二进制位值，从1开始

        while (number > 0) {
            int digit = number % 10; // 取出当前最低位的数字
            number /= 10; // 去掉最低位

            // 判断数字和位数的奇偶性是否相同
            boolean isDigitOdd = (digit % 2 != 0);
            boolean isPositionOdd = (position % 2 != 0);

            if (isDigitOdd == isPositionOdd) {
                result += bitValue; // 如果奇偶性相同，累加二进制位值
            }

            position++; // 进入下一个数位
            bitValue *= 2; // 二进制位值翻倍
        }

        result = inputNumber;

        System.out.println(result);
        scanner.close();
    }
}
