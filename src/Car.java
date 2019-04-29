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
        System.out.printf("The %s %s is starting\n", this.getColor(), this.getModel());
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String accelerate(){
        return "The "+this.getColor()+" "+this.getModel()+" is accelerating";
    }

    public String emisionTest(){
        return "The "+this.getColor()+" "+this.getModel()+" has stopped to have its emissions checked.";
    }

    public String stop(){
        return "The car is stopping";
    }

}
