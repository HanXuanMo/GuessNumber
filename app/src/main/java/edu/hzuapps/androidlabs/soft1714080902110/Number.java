package edu.hzuapps.androidlabs.soft1714080902110;

public class Number {
    private int qian;
    private int bai;
    private int shi;
    private int ge;

//    实现随机数的获取
    Number() {
        do {
            int number = (int) (123 + Math.random() * (9999 - 123 + 1));
            qian = number / 1000;
            bai = (number % 1000) / 100;
            shi = (number % 100) / 10;
            ge = number % 10;
        } while (!((qian!=bai) && (qian!=shi) && (qian!=ge) && (bai!=shi) && (bai!=ge) && (shi!=ge)));
    }

//    分别获取随机数的千位上的数字、百位、十位、个位
    Number(int number) {
        qian = number / 1000;
        bai = (number % 1000) / 100;
        shi = (number % 100) / 10;
        ge = number % 10;
    }

    public int getQian() {
        return qian;
    }

    public int getBai() {
        return bai;
    }

    public int getShi() {
        return shi;
    }

    public int getGe() {
        return ge;
    }
}
