package edu.hzuapps.androidlabs.soft1714080902110;

public class Number {
    private int number;
    private int qian;
    private int bai;
    private int shi;
    private int ge;
    private int grade;

    public Number() {
        do {
            number = (int)(123 + Math.random() * (9999 - 123 + 1));
            qian = number / 1000;
            bai = (number % 1000) / 100;
            shi = (number % 100) / 10;
            ge = number % 10;
        } while (!((qian!=bai) && (qian!=shi) && (qian!=ge) && (bai!=shi) && (bai!=ge) && (shi!=ge)));
        grade = 100;
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

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }
}
