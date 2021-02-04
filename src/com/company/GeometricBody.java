package com.company;

public abstract class GeometricBody {
    private String name;
    public GeometricBody(String name) {
        this.name=name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public abstract double Area();

    @Override
    public String toString() {
        return "geometric body: "+getName()+"\narea: "+Area();
    }
}
