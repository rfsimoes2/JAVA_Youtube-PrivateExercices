public class Car {

    private String make;
    private String model;
    private int year;

    Car(String make, String model, int year) {

        this.setMake(make); //"this" is really needed?
        this.setModel(model);
        this.setYear(year);
    }
    Car(Car x) { // overloaded copy constructor
        this.copy(x);
    }

    public String getMake() {
        return this.make;
    }
    public String getModel() {
        return this.model;
    }
    public int getYear() {
        return this.year;
    }

    public void setMake(String make) {
        this.make = make;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void copy(Car x){
        this.make = x.getMake();
        this.model = x.getModel();
        this.year = x.getYear();
    }

}
