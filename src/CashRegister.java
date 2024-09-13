public class CashRegister {
    private double purchase;
    /**
     * egulo class level er normal global variable
     */
    private double payment;
    public CashRegister(double purchase,double payment) {
       this.purchase=purchase;
        /**
         * First purchase come from globally & the 2nd purchase comes locally as parameter
         */
       this.payment=payment;
    }

    public CashRegister() {
        this.purchase=0.0;
        this.payment=0.0;
    }
    public void recordPurchase(double amount)
    {
        purchase=purchase+amount;/**
     method*/
    }

    public void receivePayment(int dollars,int quarters,int dimes,int nickels,int pennies) {
        payment=dollars+quarters*Constants.QUARTER_VALUE+dimes*Constants.DIME_VALUE+
                nickels*Constants.NICKEL_VALUE+pennies*Constants.PENNY_VALUE;
    }
    public double giveChange(){
        double change= payment-purchase;
        purchase=0.0;
        return change;
    }
}
