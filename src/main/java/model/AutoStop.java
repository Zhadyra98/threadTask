package model;

public class AutoStop {
    private int numberOfPlaces;
    private int currentNumberOfCars;

    public AutoStop(int numberOfPlaces){
        this.numberOfPlaces=numberOfPlaces;
        this.currentNumberOfCars=0;
    }

    public int getNumberOfPlaces() {
        return numberOfPlaces;
    }

    public void setNumberOfPlaces(int numberOfPlaces) {
        this.numberOfPlaces = numberOfPlaces;
    }

    public int getCurrentNumberOfCars() {
        return currentNumberOfCars;
    }

    public void setCurrentNumberOfCars(int currentNumberOfCars) {
        this.currentNumberOfCars = currentNumberOfCars;
    }

    @Override
    public String toString() {
        return currentNumberOfCars+"/"+numberOfPlaces;
    }
}
