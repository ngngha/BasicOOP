package Assignment;

import java.util.Scanner;

public class Job {
    private String jId;
    private String jName;
    private String date;
    private String jDetail;
    private Employee jobOwner;
    Scanner scanString;
    Scanner scanNum;

    public String getjId() {
        return this.jId;
    }

    public void setjId(String jId) {
        this.jId = jId;
    }

    public String getjName() {
        return this.jName;
    }

    public void setjName(String jName) {
        this.jName = jName;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getjDetail() {
        return this.jDetail;
    }

    public void setjDetail(String jDetail) {
        this.jDetail = jDetail;
    }

    public Employee getJobOwner() {
        return this.jobOwner;
    }

    public void setJobOwner(Employee jobOwner) {
        this.jobOwner = jobOwner;
    }

    public Job() {
    }

    public Job(String jId, String jName, String date, String jDetail, Employee jobOwner) {
        this.scanString = new Scanner(System.in);
        this.scanNum = new Scanner(System.in);
        this.jId = jId;
        this.jName = jName;
        this.date = date;
        this.jDetail = jDetail;
        this.jobOwner = jobOwner;
    }

    void add(Employee employee) {
        System.out.print("Mã công việc: ");
        this.jId = this.scanString.nextLine();
        System.out.print("Tên công việc: ");
        this.jName = this.scanString.nextLine();
        System.out.print("Từ ngày: ");
        this.date = this.scanString.nextLine();
        System.out.print("Chi tiết việc: ");
        this.jDetail = this.scanString.nextLine();
        this.jobOwner = employee;
        System.out.println();
    }

    public void showjobOwner() {
        System.out.println(this.jobOwner.gethName());
    }

    public void display() {
        System.out.println(this);
    }

    public String toString() {
        return "jId='" + this.jId + "', jName='" + this.jName + "', date='" + this.date + "', jDetail='" + this.jDetail + "', jobOwner=" + this.jobOwner;
    }
}
