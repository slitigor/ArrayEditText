package ru.slitigor.arrayedittexts;

public class Distance {
    private String unitName;
    private double unitValue;

    public Distance(String name, double value) {
        unitName = name;
        unitValue = value;
    }

    public void setUnitValue(double unitValue) {
        this.unitValue = unitValue;
    }

    public String getUnitName() {
        return unitName;
    }

    public double getUnitValue() {
        return unitValue;
    }
}
