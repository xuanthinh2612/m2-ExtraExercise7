import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<CBGV> cbgvList = new ArrayList<>();
        Manager manager = new Manager();
        System.out.println("Menu");
        System.out.println("1.Them thong tin can bo giao vien\n2.Hien thi thong tin ca nhan theo ten\n" +
                "3.Xem luong thuc linh theo ten\n4.Xem danh sach CBGV co luong >= 8 trieu" +
                "\n0.Exit");
        int choice = scanner.nextInt();
        while (true) {

            switch (choice) {
                case 1:
                    System.out.println("ho va ten");
                    scanner.nextLine();
                    String name = scanner.nextLine();
                    System.out.println("ngay sinh");

                    String dateOfBirth = scanner.next();
                    System.out.println("dia chi");
                    scanner.nextLine();
                    String address = scanner.nextLine();
                    System.out.println("luong cung");

                    double salary = scanner.nextDouble();
                    System.out.println("thuong");

                    double bonus = scanner.nextDouble();
                    System.out.println("tien phat");
                    double monetaryFine = scanner.nextDouble();
                    CBGV cbgv = new CBGV(name, dateOfBirth, address, salary, bonus, monetaryFine);
                    manager.addStaff(cbgvList, cbgv);
                    break;
                case 2:
                    System.out.println("nhap ten cbgv");
                    scanner.nextLine();
                    String nameToFind = scanner.nextLine();
                    for (CBGV c : cbgvList) {
                        if (c.getName().equals(nameToFind)){
                            System.out.println("Name: "+c.getName()+",date of birth: "+ c.getDateOfBirth()+",Address: "+c.getAddress());
                        }
                    }
                    break;

                case 3:
                    System.out.println("nhap ten cbgv");
                    scanner.nextLine();
                    String key = scanner.nextLine();
                    for (CBGV c : cbgvList){
                        if (c.getName().equals(key)){
                            System.out.println(manager.ReceiveMoney(c));;
                        }
                    }
                    break;
                case 4:
                    List<CBGV> temp = manager.showStaffWithSalaryOver8m(cbgvList);
                    for (CBGV c:temp){
                        System.out.println(c);
                    }
                    break;
                case 0:
                    System.exit(0);
            }
            System.out.println("Menu");
            System.out.println("1.Them thong tin can bo giao vien\n2.Hien thi thong tin ca nhan theo ten\n" +
                    "3.Xem luong thuc linh theo ten\n4.Xem danh sach CBGV co luong >= 8 trieu" +
                    "\n0.Exit");

            choice = scanner.nextInt();
        }
    }
}
