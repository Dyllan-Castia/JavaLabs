public class Dolphin extends Animal implements Swim {

    //Attributes
    private String color;
    private int swimmingSpeed;

    //Constructor
    public Dolphin() {
        super("Dolphin");
    }

    //Actions
    public void swimming() {
        System.out.println("Dolphin: I am swimming at the speed of " +
                           swimmingSpeed + " nautical miles per hour");
    }

    @Override
    public void eatingFood() {
        System.out.println("I am eating delicious fish");
    }

    @Override
    public void eatingCompleted() {
        System.out.println("I have eaten fish");
    }

    //Mutators & Accessors
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(int swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }
}
