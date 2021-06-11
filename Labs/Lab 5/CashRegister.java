import java.text.*;

/**
 * The cash register stores cash.
 *
 * You can add cash to the cash register.
 */
public class CashRegister {
    private double cash;
    
    public CashRegister() {
        cash = 0;
    }
    
    // insert 1 method here
    public void addAmount(double cashAmount) {
        cash = cash + cashAmount;
    }
    
    /**
     * Return a string in the form:
     *
     * Cash register: $[cash]
     *
     * e.g. "Cash register: $29.90"
     *
     * If there is no cash, instead return:
     *
     * "Cash register: empty"
     */
    private String decimalFormat(double amount) {
    	return new DecimalFormat("###,##0.00").format(amount);
    }
    
    @Override
    public String toString() {
        if(cash > 0) {
            return "Cash register: $" + decimalFormat(cash);
        }
        else {
            return "Cash register: empty";
        }
    }
}
