/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Managments;

/**
 *
 * @author Jorge
 */
public class Vehicule {
    private String plate;
    private String brand;
    private String model;
    private int year;
    private String tipe;
    private String state;

    public String getPlate() {
        return plate;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getTipe() {
        return tipe;
    }

    public String getState() {
        return state;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setyear(int year) {
        this.year = year;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Vehicule(String plate, String brand, String model, int year, String tipe, String state) {
        this.plate = plate;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.tipe = tipe;
        this.state = state;
    }
    
    
    
}
