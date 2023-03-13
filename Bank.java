// Lớp cha Bank
public abstract class Bank {
    public abstract double nhanLaiXuat(); // Phương thức trừu tượng để lấy lãi suất
}

// Các lớp con kế thừa từ Bank và triển khai phương thức getInterestRate() để cung cấp lãi suất cho từng ngân hàng
public class VCB extends Bank {
    @Override
    public double nhanLaiXuat() {
        return 0.08;
    }
}

public class AGR extends Bank {
    @Override
    public double nhanLaiXuat() {
        return 0.07;
    }
}

public class CTG extends Bank {
    @Override
    public double nhanLaiXuat() {
        return 0.09;
    }
}
