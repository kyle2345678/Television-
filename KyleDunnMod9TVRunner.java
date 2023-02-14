import java.io.*;
import java.util.*; 

public class KyleDunnMod9TVRunner
{
    public static void main(String[] args) {
        //Creates new TV object
        KyleDunnMod9TV tv = new KyleDunnMod9TV();
        
        //starts while loop to keep the process repeating until the user forcibly stops it 
        while (true) {
            
            //creates a scanner object and prompts the user to enter a menu option 
            Scanner scan = new Scanner(System.in); 
            System.out.println("\nWelcome to your tv!\n What would you like to do?\n1. Power your TV\n2. Change the Channel\n3. Change the Volume\n4. See the status of the TV \n5. Exit\n");
            int selection = scan.nextInt();
            
            //depending on the selection selected, runs the correlating method 
            if(selection == 1) 
            {
                System.out.println(tv.power());
            }
            else if (selection == 2) 
            {
                System.out.println("What channel would you like to change it to?"); 
                int nextChannel = scan.nextInt(); 
                System.out.println(tv.changeChannel(nextChannel)); 
            }
            else if (selection == 3) {
                System.out.println("What volume would you like? 1-10");
                int nextVolume = scan.nextInt(); 
                System.out.println(tv.changeVolume(nextVolume)); 
            }
            else if(selection == 4) {
                System.out.println(tv);
            }
            else if (selection == 5) {
                break;
            }
            //closes the scanner 
            scan.close();
    }
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