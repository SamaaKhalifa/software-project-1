package com.company;

/**
 * @author samaa, sohaila, noura
 */

/**
 * this class ewallet that have the balance of any user
 */
public class Ewallet {
    private float balance;

    /**
     * this function is to set balance
     * @param balance is the balance of the user
     */
    public void setBalance(float balance) {
        this.balance = balance;
    }

    /**
     * this function is to get balance
     * @return user's balance
     */
    public float getBalance() {
        return balance;
    }

    public float checkBalance(){
        return balance;
    }
}
