
public class Eagle extends Bird implements Fly{

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    @Override
    public void takeOff(){
        if(!this.flying && altitude == 0){
            this.flying = true;
            System.out.println(this.getName() + " takes off into the air.");
        }
    }

    @Override
    public int ascend(int meters) {
        if (this.flying) {
            this.altitude = Math.min(this.altitude + meters, 1500);
            System.out.println(this.getName() + " flies upwards, altitude : " + this.getAltitude());
        }
        return this.altitude;
    }

    @Override
    public int descend(int meters) {
        if (this.flying) {
            this.altitude = Math.max(this.altitude - meters, 0);
            System.out.println(this.getName() + " flies downwards, altitude : " + this.getAltitude());
        }
        return this.altitude;
    }

    @Override
    public void land() {
        if(isFlying() && this.altitude <= 1){
            System.out.println(this.getName() + " lands on the ground.");
        }
        else {
            System.out.println(this.getName() + " is too high, it cannot land!");
        }
    }
}
