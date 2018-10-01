/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankentities;

/**
 *
 * @author krusby
 */
public class BankAccount {

    private int balance;
    private int overdraft;
    private String holder;

    public BankAccount(String holder) {
        this.balance = 100;
        this.overdraft = 500;
        this.holder = holder;
    }

    public String GetHolder() {
        return this.holder;
    }

    public int GetBalance() {
        return this.balance;
    }

    public int GetOverdraft() {
        return this.overdraft;
    }

    public boolean DepositMoney(int amount) {
        try {
            this.balance += amount;
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public boolean WithdrawMoney(int amount) {
        try {
            if ((balance + overdraft) < amount) {
                return false;
            } else {
                balance -= amount;
                return true;
            }
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
