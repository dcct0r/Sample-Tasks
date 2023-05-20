package sample_7.adapter;

class PBank {
    private int balance;
    public PBank() { balance = 100; }
    public void getBalance() {
        System.out.println("PBank balance = " + balance);
    }
}
class ABank {
    private int balance;
    public ABank() { balance = 200; }
    public void getBalance() {
        System.out.println("ABank balance = " + balance);
    }
}
class PBankAdapter extends PBank {
    private ABank abank;
    public PBankAdapter(ABank abank) {
        this.abank = abank;
    }
    public void getBalance() {
        abank.getBalance();
    }
}

public class adapt {
    public static void main(String[] args) {
        PBank pbank = new PBank();
        pbank.getBalance();
        PBankAdapter abank = new PBankAdapter(new ABank());
        abank.getBalance();
    }
}