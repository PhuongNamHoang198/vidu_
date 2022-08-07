import java.util.Scanner;

public class  Main {
    public static void main(String[] args) {
        Employee[] ep =  new Employee[3];
        Scanner sc = new Scanner(System.in);

        System.out.println("nhap vao gia tri: ");
        for (int i=0; i< ep.length;i++) {
            String Duong = sc.nextLine();
            String ten = sc.nextLine();
            double luong = sc.nextDouble();

            Address add = new Address(Duong);
            Employee nhanvien = new Employee(ten, luong);
            nhanvien.setAddress(add);

            ep[i]=nhanvien;
        }
        System.out.println("thong tin nhan vien nhap vao ");
        for(Employee dsfh: ep) {
            System.out.println(dsfh.getTen() + " " +dsfh.getAddress().getTenDuong() +" " + dsfh.getLuong());
        }
    }
}
