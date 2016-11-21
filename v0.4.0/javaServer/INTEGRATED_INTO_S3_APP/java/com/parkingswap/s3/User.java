package com.parkingswap.s3;

import com.parkingswap.cognito.UserId;

/**
 * Created by jaskiratsingh on 10/29/16.
 */

public class User {

    private static String id;
    private static String latitude;
    private static String longitude;
    private static Car car;

    private static class Car{

        String make, model, color;

        Car(String make, String model, String color){
            this.make = make;
            this.model = model;
            this.color = color;
        }

    }

    public User() {
        id = UserId.getId();
        latitude = "69.696969";
        longitude = "96.969696";
        car = new Car("Toyota", "Solara", "White");
    }

    public User(String lat, String lon, Car c) {
        id = UserId.getId();
        latitude = lat;
        longitude = lon;
        car = c;
    }

    public Car getCar() {
        return car;
    }
    public String getID() {
        return id;
    }
    public String getLatitude() {
        return latitude;
    }
    public String getLongitude() {
        return longitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
    public void setCar(Car car) {
        this.car = car;
    }

    public static User getTheUser(){
        return new User("69.696969", "96.969696", new Car("Toyota", "Solara", "White"));
    }

    public String toString(){
        return ""+id+"\nlat="+latitude+"\nlong="+longitude+"\ncar="+car;
    }
}
