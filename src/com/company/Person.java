package com.company;

public class Person
{
    //Simulates an actual person with respect to respiratory actions within an enclosed area
    //Attributes: x-position, y-position, isSick

    private boolean isSick;
    private int xCoordinate;
    private int yCoordinate;

    public Person(boolean isSick, int xCoordinate, int yCoordinate) {
        this.isSick = isSick;
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public boolean isSick()
    {
        return isSick;
    }

    public void infect(Person person)
    {
        person.isSick = true;
    }

    //Exhale function
    //Sneeze function
}
