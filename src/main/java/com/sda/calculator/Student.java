package com.sda.calculator;

public  class Student extends Entity {
    private double scholarship;

    public Student(String city, double scholarship) {
        super(city);

        if (scholarship > 0) {
            this.scholarship = scholarship;
        } else {
            throw new InvalidDataException("Scholarship must be greater than 0");
        }
    }

    public double amountReceived() {
        return this.scholarship;

    }
}

