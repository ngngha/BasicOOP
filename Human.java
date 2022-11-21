package Assignment;

import java.util.Scanner;

class Human {
    private String hName;
    private double phoneNumber;
    private String hMail;
    private int age;
    private String gender;
    Scanner scanString;
    Scanner scanNum;

    public void add() {
        System.out.print("Họ và tên: ");
        this.hName = this.scanString.nextLine();
        System.out.print("Số điện thoại: ");
        this.phoneNumber = (double)this.scanNum.nextInt();
        System.out.print("Email: ");
        this.hMail = this.scanString.nextLine();
        System.out.print("Tuổi: ");
        this.age = this.scanNum.nextInt();
        System.out.print("Giới tính: ");
        this.gender = this.scanString.nextLine();
    }

    public String toString() {
        return "hName='" + this.hName + "', phoneNumber=" + this.phoneNumber + ", hMail='" + this.hMail + "', age=" + this.age + ", gender='" + this.gender;
    }

    public void display() {
        System.out.println(this);
    }

    public Human() {
    }

    public Human(String hName, double phoneNumber, String hMail, int age, String gender) {
        this.scanString = new Scanner(System.in);
        this.scanNum = new Scanner(System.in);
        this.hName = hName;
        this.phoneNumber = phoneNumber;
        this.hMail = hMail;
        this.age = age;
        this.gender = gender;
    }

    public String gethName() {
        return this.hName;
    }

    public void sethName(String hName) {
        this.hName = hName;
    }

    public double getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(double phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String gethMail() {
        return this.hMail;
    }

    public void sethMail(String hMail) {
        this.hMail = hMail;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
