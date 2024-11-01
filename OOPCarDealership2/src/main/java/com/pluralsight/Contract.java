package com.pluralsight;

public abstract class Contract {

    private String date;
    private String customerName;
    private String customerEmail;
    private double vehicleSold;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public double isVehicleSold() {
        return vehicleSold;
    }

    public void setVehicleSold(double vehicleSold) {
        this.vehicleSold = vehicleSold;
    }

    public abstract double getMonthlyPayment();

    public abstract double getTotalPayment();

}
