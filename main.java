package baitapcaidatphuongthuc;

public class main {
    
        public static void main(String[] args) {
            Bank[] banks = new Bank[3];
            banks[0] = new VCB();
            banks[1] = new AGR();
            banks[2] = new CTG();
    
            for (Bank bank : banks) {
                System.out.println("lai xuat: " + bank.nhanLaiXuat());
            }
        }
    }
    
