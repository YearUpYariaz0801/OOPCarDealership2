package com.pluralsight;

public class SalesContract extends Contract{

    public float salesTaxAmount;
    //Change to double to use dollar amount
    //Float would apply to the percentage
    public int recordingFee;
    public boolean wantToFinance;
    public double monthlyPayment;

    public SalesContract(float salesTaxAmount, int recordingFee, boolean wantToFinance) {
        this.salesTaxAmount = salesTaxAmount;
        this.recordingFee = recordingFee;
        this.wantToFinance = wantToFinance;
    }

    public float getSalesTaxAmount() {
        return salesTaxAmount;
    }

    public void setSalesTaxAmount(float salesTaxAmount) {
        this.salesTaxAmount = salesTaxAmount;
    }

    public int getRecordingFee() {
        return recordingFee;
    }

    public void setRecordingFee(int recordingFee) {
        this.recordingFee = recordingFee;
    }

    public boolean isWantToFinance() {
        return wantToFinance;
    }

    public void setWantToFinance(boolean wantToFinance) {
        this.wantToFinance = wantToFinance;
    }


    @Override
    public double getMonthlyPayment() {
        return 0;
    }

    @Override
    public double getTotalPayment() {
        return 0;
    }
}
