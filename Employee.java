package Assignment;

import java.util.Scanner;

public class Employee extends Human {
    private String eId;
    private String position;
    private String role;
    Scanner scanString;
    Scanner scanNum;

    public Employee(String hName, double phoneNumber, String hMail, int age, String gender, String eId, String position, String role) {
        super(hName, phoneNumber, hMail, age, gender);
        this.scanString = new Scanner(System.in);
        this.scanNum = new Scanner(System.in);
        this.eId = eId;
        this.position = position;
        this.role = role;
    }

    public Employee() {
    }

    public String geteId() {
        return this.eId;
    }

    public void seteId(String eId) {
        this.eId = eId;
    }

    public String getPosition() {
        return this.position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void add() {
        super.add();
        System.out.println("Mã nhân viên: ");
        this.eId = this.scanString.nextLine();
        System.out.println("Vai trò: ");
        this.position = this.scanString.nextLine();
        System.out.println("Vị trí: ");
        this.role = this.scanString.nextLine();
        System.out.println();
    }

    public String toString() {
        String var10000 = super.toString();
        return var10000 + ", eId='" + this.eId + "', position='" + this.position + "', role='" + this.role;
    }

    public void display() {
        System.out.println(this);
    }
}

