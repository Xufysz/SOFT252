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

    public void DepositMoney(int amount) {
        this.balance += amount;
    }

    public boolean WithdrawMoney(int amount) {
        if ((balance + overdraft) < amount) {          
            return false;
        }
        else{
            balance -= amount;
            return true;
        }
    }

}
