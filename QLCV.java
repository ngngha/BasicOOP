package Assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QLCV {
    static Scanner scan = new Scanner(System.in);
    static List<Employee> employeeeList = new ArrayList<>();
    static List<Job> jobsList = new ArrayList<>();

    public QLCV() {
    }

    public static void showMenu() {
        System.out.println("Lựa chọn yêu cầu");
        System.out.println("1. Thêm nhân viên");
        System.out.println("2. Thêm dự án");
        System.out.println("3. Tìm kiếm nhân viên theo tên");
        System.out.println("4. Tìm dự án theo tên");
        System.out.println("5. Hiển thị thông tin nhân viên");
        System.out.println("6. Hiển thị thông tin dự án");
        System.out.println("7. Thoát");
        System.out.println();
    }

    static Employee createEmployee() {
        System.out.println("Nhập thông tin nhân viên");
        Employee employee = new Employee();
        employee.add();
        return employee;
    }

    static Job createJob(Employee employee) {
        System.out.println("Nhập thông tin dự án");
        Job job = new Job();
        job.add(employee);
        return job;
    }

    static void inputEData() {
        System.out.println("Nhập số nhân viên cần thêm: ");
        int n = Integer.parseInt(scan.nextLine());

        for(int i = 0; i < n; ++i) {
            Employee employee = createEmployee();
            employeeeList.add(employee);
        }

    }

    static Job inputJData(Employee employee) {
        Job job = createJob(employee);
        jobsList.add(job);
        return job;
    }

    static void searchByNameE() {
        System.out.println("Nhập tên nhân viên cần tìm kiếm: ");
        String name = scan.nextLine();
        for(Employee employee : employeeeList){
            if(employee.gethName().equals(name)){
                employee.display();
            }
        }

    }

    static void searchByNameJ() {
        System.out.println("Nhập tên công việc cần tìm kiếm: ");
        String name = scan.nextLine();
        for(Job job : jobsList){
            if(job.getjName().equals(name)){
                job.display();
            }
        }

    }

    static void showEData() {
        for (Employee employee:employeeeList){
            employee.display();
        }

    }

    static void showJData() {
        for (Job job:jobsList){
            job.display();
        }

    }

    static void showEmp() {
        System.out.println("Chọn nhân viên cần giao công việc");

        for(int i = 0; i < employeeeList.size(); ++i) {
            System.out.println("" + i + " - ID: " + ((Employee)employeeeList.get(i)).geteId() + " Name: " + ((Employee)employeeeList.get(i)).gethName());
        }

    }

    public static void main(String[] args) {
        new Employee();
        new Job();
        showMenu();

        int choose;
        do {
            choose = Integer.parseInt(scan.nextLine());
            switch (choose) {
                case 1:
                    inputEData();
                    System.out.println("Thêm thành công");
                    showMenu();
                    break;
                case 2:
                    showEmp();
                    int chooseEmp = Integer.parseInt(scan.nextLine());
                    if (chooseEmp < employeeeList.size()) {
                        Job job = inputJData((Employee)employeeeList.get(chooseEmp));
                        job.showjobOwner();
                        System.out.println("Thêm thành công");
                    } else {
                        System.err.println("Vị trí bạn nhập không tồn tại nhân viên nào");
                    }

                    showMenu();
                    break;
                case 3:
                    searchByNameE();
                    showMenu();
                    break;
                case 4:
                    searchByNameJ();
                    showMenu();
                    break;
                case 5:
                    showEData();
                    showMenu();
                    break;
                case 6:
                    showJData();
                    showMenu();
                case 7:
                    System.exit(0);
                default:
                    System.out.println("Nhập sai, hãy chọn lại 1 trong các mục trên");
            }
        } while(choose != 7);

    }
}
