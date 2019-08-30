package com.sda.calculator;

public abstract class Entity {
    private String city;

    public Entity(String city) {
        this.city = city;

        if ( city != null && !city.isEmpty()) {
            this.city = city;
        } else {
            throw new InvalidDataException("City not empty and not null");
        }
    }

    public String getCity() {
        return city;
    }

    public abstract double amountReceived();

    @Override
    public String toString() {
        return "Entity{" +
                "The city is: " + city + " amountReceived : " + amountReceived() + '\n' +
                '}';
    }
}
