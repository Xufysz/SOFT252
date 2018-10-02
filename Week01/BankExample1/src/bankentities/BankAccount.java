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
    
    public BankAccount(String holder, Integer balance, Integer overdraft){
        this.balance = balance;
        this.overdraft = overdraft;
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
    
    public TransactionOutput DepositMoney(String amount){
        try{
            return this.DepositMoney(Integer.parseInt(amount));
        }
        catch (NumberFormatException e){
            return TransactionOutput.EXCEPTION;
        }
    }

    public TransactionOutput DepositMoney(int amount) {
        try {
            this.balance += amount;
            return TransactionOutput.COMPLETED;
        } catch (NumberFormatException e) {
            return TransactionOutput.EXCEPTION;
        }
    }
    
    public TransactionOutput WithdrawMoney(String amount){
        try{
            return this.WithdrawMoney(Integer.parseInt(amount));
        }
        catch (NumberFormatException e){
            return TransactionOutput.EXCEPTION;
        }
    }

        public TransactionOutput WithdrawMoney(int amount) {
        try {
            if ((balance + overdraft) < amount) {
                return TransactionOutput.INSUFFICIENT_FUNDS;
            } else {
                balance -= amount;
                return TransactionOutput.COMPLETED;
            }
        } catch (NumberFormatException e) {
            return TransactionOutput.EXCEPTION;
        }
    }
    
    public enum TransactionOutput{
        COMPLETED,
        INSUFFICIENT_FUNDS,
        EXCEPTION,     
    }

}
