package com.example.DemoJPA.model;

public enum JobTitle {
    NAD("Network Administrator"),
    MDV("Mobile Developer"),
    FDV("FrontEnd Developer"),
    BDV("BackEnd Developer"),
    SEG("Software Engineer"),
    SDV("Software Developer"),
    UDS("UX Designer"),
    DAN("Data Analyst"),
    DEG("Data Engineer"),
    DAD("Database Admin");

    private final String displayValue;

    JobTitle(String displayValue) {
        this.displayValue = displayValue;
    }

    public String getDisplayValue() {
        return displayValue;
    }

}
