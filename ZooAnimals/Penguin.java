public class Penguin extends Animal implements Walk, Swim{
    private boolean isSwimming = false;
    private int walkSpeed;
    private int swimSpeed;

    //Constructor
    public Penguin() {
        super("Penguin");
    }

    //Actions
    @Override
    public void eatingFood() {
        System.out.println("Eating delicious fish");
    }

    @Override
    public void eatingCompleted() {
        System.out.println("Penguin: I have eaten fish");
    }

    public void walking() {
        System.out.println("Penguin: I am walking at speed " + walkSpeed + " MPH");
    }

    public void swimming() {
        System.out.println("Penguin: I am swimming at speed " + swimSpeed + " nautical miles per hour");
    }

    //Mutators & Accessors
    public int getWalkSpeed() {
        return walkSpeed;
    }

    public void setWalkSpeed(int walkSpeed) {
        this.walkSpeed = walkSpeed;
    }

    public int getSwimSpeed() {
        return swimSpeed;
    }

    public void setSwimSpeed(int swimSpeed) {
        this.swimSpeed = swimSpeed;
    }

    public boolean isSwimming() {
        return isSwimming;
    }

    public void setSwimming(boolean swimming) {
        isSwimming = swimming;
    }

}
