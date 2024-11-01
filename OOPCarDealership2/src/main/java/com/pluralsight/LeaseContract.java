package com.pluralsight;

public class LeaseContract extends Contract{


    @Override
    public double getMonthlyPayment() {
        return 0;
    }

    @Override
    public double getTotalPayment() {
        return 0;
    }
}
