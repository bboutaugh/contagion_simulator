package com.company;

public class Person
{
    //Simulates an actual person with respect to respiratory actions within an enclosed area
    //Attributes: x-position, y-position, isSick

    private boolean isSick;

    public int getXCoordinate() {
        return xCoordinate;
    }

    public void setXCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public int getYCoordinate() {
        return yCoordinate;
    }

    public void setYCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

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

    public int sneeze(Person person)
    {
        int contactCoordinate = -1;
        for(int i = 0; i<3;i++)
        {
            int currentXCoordinate = 0;
            currentXCoordinate += i;
            if(person.getXCoordinate() == currentXCoordinate)
            {
                contactCoordinate = person.getXCoordinate();
            }
        }
        return contactCoordinate;
    }

    //Exhale function
    //Sneeze function
}
