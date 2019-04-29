public class Car extends Vehicle {
    private String model;


    @Override
    public void setSpeed(int speed) {
        super.setSpeed(speed);
        System.out.println("The Speed is now "+speed+" mph");
    }

    public String getModel() {
        return model;
    }

    public void start(){
        System.out.println("The car is starting");
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String accelerate(){
        return "The "+this.getColor()+" "+this.getModel()+" is accelerating";
    }

    public String stop(){
        return "The car is stopping";
    }

}
