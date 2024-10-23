package org.example;

import java.util.Scanner;

public class NumberFeature {

    // 方法：计算数字的特征值
    public static int calculateFeature(int number) {
        int position = 1; // 从个位开始计数
        int result = 0;   // 最终的十进制值
        int binaryValue = 1; // 二进制位值，从右向左依次是1, 2, 4, 8, ...

        // 循环处理数字的每一位
        while (number > 0) {
            int digit = number % 10; // 当前位的数字
            number /= 10; // 去掉已经处理过的最低位

            // 判断当前位数字和位数的奇偶性是否一致
            if ((digit % 2) == (position % 2)) {
                result += binaryValue; // 如果奇偶性一致，加入当前二进制位值
            }

            position++;       // 处理下一位数位
            binaryValue *= 2; // 二进制位值乘2，移动到下一位
        }

        return result; // 返回最终结果
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt(); // 输入一个非负整数
        System.out.println(calculateFeature(number)); // 输出特征值
    }
}
