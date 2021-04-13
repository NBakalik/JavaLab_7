package com.company;

public class Ladder {
    private String brand;
    private double maxLength;
    private int maxWeight;
    private String material;

    private boolean isFoldable;
    private String color;
    private int amountOfSteps;
    private int stepWidth;
    private boolean isAntiSlipCoating;

    static int amountOfLadders = 0;

    protected String country;
    protected double weightInKg;

    Ladder() {
        amountOfLadders++;
    }

    Ladder(String brand, double maxLength, int maxWeight, String material) {
        this.brand = brand;
        this.maxLength = maxLength;
        this.maxWeight = maxWeight;
        this.material = material;
        amountOfLadders++;
    }

    Ladder(String brand, double maxLength, int maxWeight, String material, boolean isFoldable, String color,
           int amountOfSteps, int stepWidth, boolean isAntiSlipCoating, String country, double weightInKg) {
        this(brand, maxLength, maxWeight, material);
        this.isFoldable = isFoldable;
        this.color = color;
        this.amountOfSteps = amountOfSteps;
        this.stepWidth = stepWidth;
        this.isAntiSlipCoating = isAntiSlipCoating;
        this.country = country;
        this.weightInKg = weightInKg;
        amountOfLadders++;
    }

    @Override
    public String toString() {
        return "Ladder{" +
                "brand='" + brand + '\'' +
                ", maxLength=" + maxLength +
                ", maxWeight=" + maxWeight +
                ", material='" + material + '\'' +
                ", isFoldable=" + isFoldable +
                ", color='" + color + '\'' +
                ", amountOfSteps=" + amountOfSteps +
                ", stepWidth=" + stepWidth +
                ", isAntiSlipCoating=" + isAntiSlipCoating +
                ", country='" + country + '\'' +
                ", weightInKg=" + weightInKg +
                '}';
    }

    public static void printStaticAmountOfLadder() {
        System.out.println(amountOfLadders);
    }

    public void printAmountOfLadder() {
        System.out.println(amountOfLadders);
    }

    public void resetValues(String brand, double maxLength, int maxWeight, String material, boolean isFoldable, String color,
                     int amountOfSteps, int stepWidth, boolean isAntiSlipCoating, String country, double weightInKg) {
        this.brand = brand;
        this.maxLength = maxLength;
        this.maxWeight = maxWeight;
        this.material = material;
        this.isFoldable = isFoldable;
        this.color = color;
        this.amountOfSteps = amountOfSteps;
        this.stepWidth = stepWidth;
        this.isAntiSlipCoating = isAntiSlipCoating;
        this.country = country;
        this.weightInKg = weightInKg;
    }

    public boolean isFoldable() {
        return isFoldable;
    }

    public void setFoldable(boolean foldable) {
        isFoldable = foldable;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAmountOfSteps() {
        return amountOfSteps;
    }

    public void setAmountOfSteps(int amountOfSteps) {
        this.amountOfSteps = amountOfSteps;
    }

    public int getStepWidth() {
        return stepWidth;
    }

    public void setStepWidth(int stepWidth) {
        this.stepWidth = stepWidth;
    }

    public boolean isAntiSlipCoating() {
        return isAntiSlipCoating;
    }

    public void setAntiSlipCoating(boolean antiSlipCoating) {
        isAntiSlipCoating = antiSlipCoating;
    }
}

