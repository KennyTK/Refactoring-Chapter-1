package main.java.bad.robot.refactoring.chapter1;

public class ChildrensPrice extends Price {

    @Override
    public int getPriceCode() {
        return Movie.CHILDREN;
    }
}
