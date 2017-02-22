package edu.ucsd.cs110.temperature;

public class Celsius extends Temperature
{
    public Celsius(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        return  this;
    }

    @Override
    public Temperature toFahrenheit() {
        Temperature a = new Fahrenheit((float) (super.getValue()*1.8+32));
        return a;
    }

    public String toString()
    {
        // TODO: Complete this method
        return super.getValue()+" C";
    }
}
