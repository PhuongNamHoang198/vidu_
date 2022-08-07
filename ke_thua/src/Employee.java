public class Employee extends Person{
    String ten;
    public void thongTin() {
        this.ten = "'b";
        System.out.println("thong tin cua ham b la " + this.ten);
        System.out.println("---------------");
        super.thongTin();
    }

}
