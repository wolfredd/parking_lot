package org.example.vehicles;

import org.example.Owner;

import java.util.List;

public abstract class Vehicle {
    private String numberPlate;
    private List<Owner> owners;
    private double amountChargedPerMonth;
    private int numberedPermitNumber = 0;

    private String stringPermitNumber;

    private VehicleType type;


    public Vehicle(String numberPlate, List<Owner> owners, double amountChargedPerMonth){
        this.numberPlate = numberPlate;
        this.amountChargedPerMonth = amountChargedPerMonth;
        this.owners = owners;
    }

    public VehicleType getType() {
        return type;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }

//    public String getNumberPlate() {
//        return numberPlate;
//    }

//    public void setNumberPlate(String numberPlate) {
//        this.numberPlate = numberPlate;
//    }

    public List<Owner> getOwners() {
        return owners;
    }

//    public void addOwner(Owner owner) {
//        this.owners.add(owner);
//    }

    public double getAmountChargedPerMonth() {
        return amountChargedPerMonth;
    }

    public void setAmountChargedPerMonth(double amountChargedPerMonth) {
        this.amountChargedPerMonth = amountChargedPerMonth;
    }

    public int getNumberedPermitNumber() {
        return numberedPermitNumber;
    }

    public void setNumberedPermitNumber(int numberedPermitNumber) {
        this.numberedPermitNumber = numberedPermitNumber;
    }

    public abstract double calculateCharge();

    public String getStringPermitNumber() {
        return stringPermitNumber;
    }

    public void setStringPermitNumber(String stringPermitNumber) {
        this.stringPermitNumber = stringPermitNumber;
    }
}
