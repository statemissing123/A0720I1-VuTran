package model;

import java.util.Date;

public class Contract {
    private int id;
    private Date starContract;
    private Date endContract;
    private int deposit;
    private int totalMoney;

    public Contract() {
    }

    public Contract(int id, Date starContract, Date endContract, int deposit, int totalMoney) {
        this.id = id;
        this.starContract = starContract;
        this.endContract = endContract;
        this.deposit = deposit;
        this.totalMoney = totalMoney;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getStarContract() {
        return starContract;
    }

    public void setStarContract(Date starContract) {
        this.starContract = starContract;
    }

    public Date getEndContract() {
        return endContract;
    }

    public void setEndContract(Date endContract) {
        this.endContract = endContract;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public int getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(int totalMoney) {
        this.totalMoney = totalMoney;
    }
}
