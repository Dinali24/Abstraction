abstract class CentralBank {
    abstract int interestRate();
}
class Boc extends CentralBank{
    @Override
    int interestRate() {
        return 5;
    }
}
class NDB extends CentralBank{
    @Override
    int interestRate() {
        return 10;
    }
}
class Run {
    public static void main(String[] args) {
        CentralBank cb;
        cb = new Boc();
        System.out.println("Rate of Interest is = " + cb.interestRate() + "%");
        cb = new NDB();
        System.out.println("Rate of Interest is = " + cb.interestRate() + "%");
    }
}
