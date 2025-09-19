import java.util.ArrayList;
import java.util.Scanner;

// Lớp Nguoi
class Nguoi {
    private String hoTen248;
    private String ngaySinh248;
    private String queQuan248;

    public Nguoi() {}

    public Nguoi(String hoTen248, String ngaySinh248, String queQuan248) {
        this.hoTen248 = hoTen248;
        this.ngaySinh248 = ngaySinh248;
        this.queQuan248 = queQuan248;
    }

    public void nhapThongTin248(Scanner sc) {
        System.out.print("Nhập họ tên: ");
        hoTen248 = sc.nextLine();
        System.out.print("Nhập ngày sinh (dd/MM/yyyy): ");
        ngaySinh248 = sc.nextLine();
        System.out.print("Nhập quê quán: ");
        queQuan248 = sc.nextLine();
    }

    public void hienThiThongTin248() {
        System.out.println("Họ tên: " + hoTen248);
        System.out.println("Ngày sinh: " + ngaySinh248);
        System.out.println("Quê quán: " + queQuan248);
    }
}

// Lớp CBGV (Cán bộ giáo viên)
class CBGV {
    private Nguoi nguoi248;
    private double luongCung248;
    private double thuong248;
    private double phat248;

    public CBGV() {}

    public void nhapThongTin248(Scanner sc) {
        nguoi248 = new Nguoi();
        System.out.println("== Nhập thông tin cán bộ giáo viên ==");
        nguoi248.nhapThongTin248(sc);

        System.out.print("Nhập lương cứng: ");
        luongCung248 = Double.parseDouble(sc.nextLine());

        System.out.print("Nhập tiền thưởng: ");
        thuong248 = Double.parseDouble(sc.nextLine());

        System.out.print("Nhập tiền phạt: ");
        phat248 = Double.parseDouble(sc.nextLine());
    }

    public void hienThiThongTin248() {
        System.out.println("==== Hồ sơ cán bộ giáo viên ====");
        nguoi248.hienThiThongTin248();
        System.out.println("Lương cứng: " + luongCung248);
        System.out.println("Thưởng: " + thuong248);
        System.out.println("Phạt: " + phat248);
        System.out.println("Lương thực lĩnh: " + tinhLuong248());
    }

    public double tinhLuong248() {
        return luongCung248 + thuong248 - phat248;
    }
}

// Chương trình chính
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<CBGV> dsCanBo248 = new ArrayList<>();

        System.out.print("Nhập số lượng cán bộ giáo viên: ");
        int n248 = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n248; i++) {
            System.out.println("\n--- Nhập thông tin cán bộ giáo viên thứ " + (i + 1) + " ---");
            CBGV cbgv248 = new CBGV();
            cbgv248.nhapThongTin248(sc);
            dsCanBo248.add(cbgv248);
        }

        // Hiển thị toàn bộ danh sách
        System.out.println("\n===== DANH SÁCH CÁN BỘ GIÁO VIÊN =====");
        for (CBGV cbgv248 : dsCanBo248) {
            cbgv248.hienThiThongTin248();
            System.out.println("---------------------------");
        }

        // In ra danh sách cán bộ có lương thực lĩnh >= 8 triệu
        System.out.println("\n===== DANH SÁCH CÁN BỘ LƯƠNG >= 8 TRIỆU =====");
        for (CBGV cbgv248 : dsCanBo248) {
            if (cbgv248.tinhLuong248() >= 8000000) {
                cbgv248.hienThiThongTin248();
                System.out.println("---------------------------");
            }
        }
    }
}
