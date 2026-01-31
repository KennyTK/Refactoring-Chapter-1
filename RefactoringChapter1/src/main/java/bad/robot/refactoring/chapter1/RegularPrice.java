package main.java.bad.robot.refactoring.chapter1;

public class RegularPrice extends Price 
{

    @Override
    public int getPriceCode() {
        return Movie.REGULAR;
    }
}
