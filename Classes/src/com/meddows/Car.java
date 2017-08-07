package com.meddows;

public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    // Setter
    public void setModel(String model){
        String validModel = model.toLowerCase();
        if(validModel.equals("carrera") || validModel.equals("commodore")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }

    }

    // Getter
    public String getModel(){
        return this.model;
    }

}


