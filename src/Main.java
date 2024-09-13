public class Main {
    public static void main(String[] args) {
        CashRegister cashRegister1=new CashRegister();
        CashRegister cashRegister2=new CashRegister(3.0,2.0);
        cashRegister1.recordPurchase(30.0);
        cashRegister1.recordPurchase(20.0);
        cashRegister1.recordPurchase(12.13);
        cashRegister1.receivePayment(100,3,5,2,60);
        double change =cashRegister1.giveChange();
        System.out.printf("%.2f\n",change);
        cashRegister2.recordPurchase(2);
        cashRegister2.recordPurchase(2.3);
        cashRegister2.recordPurchase(1.67);
        cashRegister2.recordPurchase(3.67);
        cashRegister2.receivePayment(20,4,5,2,6);
        change =cashRegister2.giveChange();
        System.out.printf("%.2f",change);
    }
}
