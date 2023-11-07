package OOPs.Module2.Part1.Task1;

public class Television {
    private int channel;
    private  boolean powerStatus;

    // Create new television Constructor
    public Television(){
        channel = 1;
        powerStatus = false;
    }

    // methods
    public boolean isOn(){
        return powerStatus = true;
    }
    public void pressOnOff(){
        if (!powerStatus){
            powerStatus = false;
        }
        else{
            powerStatus = true;
        }
    }
    public int getChannel(){
        return channel;
    }
    public void setChannel(int channelX){
        channel = channelX;

    }


}
