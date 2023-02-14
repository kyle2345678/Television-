public class KyleDunnMod9TV
{
    //creates instance variables
    private String onoff;
    private int channel; 
    private int volume; 
    //defaults the TV to off, channel 1, and volume 5 
    public KyleDunnMod9TV() {
        onoff = "Off";
        channel = 1;
        volume = 5; 
    }

    //creates power method to turn the TV on and off
    public String power() {
        if (onoff == "Off") 
        {
            onoff = "On";
        }
        else if (onoff == "On")
        {
            onoff = "Off";
        }
        return onoff; 
    }

    //creates change channel method to change the channel 
    public String changeChannel(int newChannel) {
        String channelChange; 
        if (0 < newChannel && newChannel <= 5) {
            channel = newChannel; 
            channelChange = "You are now watching Channel " + newChannel;
        }
        else {
            channelChange = "That is an invalid channel number"; 
        }
        return channelChange; 
    }

    //creates changeVolume method to change the volume 
    public String changeVolume(int newVolume) {
        String volumeChange = " "; 
        if(newVolume >= 0 && newVolume <= 10) {
            volume = newVolume;
            volumeChange = "The volume is now at level " + newVolume;
        }
        else if (volume < 0) {
            volumeChange = "The volume is at its minimum.";
        }
        else if(volume > 10) {
            volumeChange = "The volume is at its maximum";
        }
        
        return volumeChange;
    }
    
    //creates toString method to be able to print the TV status 
    public String toString() 
    {
        String str = "Power: " + onoff; 
        str += "\nChannel: " + channel;
        str += "\nVolume: " + volume; 
        return str; 
    }
}
/*
Welcome to your tv!
What would you like to do?
1. Power your TV
2. Change the Channel
3. Change the Volume
4. See the status of the TV 
5. Exit

4
Power: Off
Channel: 1
Volume: 5

Welcome to your tv!
 What would you like to do?
1. Power your TV
2. Change the Channel
3. Change the Volume
4. See the status of the TV 
5. Exit

1
On

Welcome to your tv!
 What would you like to do?
1. Power your TV
2. Change the Channel
3. Change the Volume
4. See the status of the TV 
5. Exit

2
What channel would you like to change it to?
3
You are now watching Channel 3

Welcome to your tv!
 What would you like to do?
1. Power your TV
2. Change the Channel
3. Change the Volume
4. See the status of the TV 
5. Exit

3
What volume would you like? 1-10
7
The volume is now at level 7

Welcome to your tv!
 What would you like to do?
1. Power your TV
2. Change the Channel
3. Change the Volume
4. See the status of the TV 
5. Exit

4
Power: On
Channel: 3
Volume: 7

Welcome to your tv!
 What would you like to do?
1. Power your TV
2. Change the Channel
3. Change the Volume
4. See the status of the TV 
5. Exit

5
 */