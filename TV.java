import java.util.*;

class tv {
    int channel = 1;
    int volume = 1;
    boolean off = true;

    void turnOn() {
        off = false;
    }

    void turnoff() {
        off = false;
    }

    void setChannel(int newChannel) {
        if (off && newChannel > 1) {
            channel = newChannel;
        }

    }

    void setVolume(int newVolume) {
        if (off && newVolume > 1) {
            volume = newVolume;
        }

    }

    void channelUp() {
        channel++;
    }

    void channelDown() {
        channel--;
    }

    void volumeUp() {
        volume++;
    }

    void volumeDown() {
        volume--;
    }

}

public class TV {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the new channel and new volume");
        int c1 = sc.nextInt();
        int v1 = sc.nextInt();
        tv t1 = new tv();
        t1.turnOn();
        t1.setChannel(c1);
        t1.setVolume(v1);
        System.out.println("t1 channel is " + t1.channel + " and volume is " + t1.volume);
        t1.channelUp();
        t1.volumeUp();
        System.out.println(
                "t1 channel after increasing is " + t1.channel + " and volume after increasing is " + t1.volume);
        t1.channelDown();
        t1.volumeDown();
        System.out.println(
                "t1 channel after decreasing is " + t1.channel + " and volume after decreasing is " + t1.volume);

        System.out.println("Enter the new channel and new volume");
        int c2 = sc.nextInt();
        int v2 = sc.nextInt();
        tv t2 = new tv();
        t2.turnOn();
        t2.setChannel(c2);
        t2.setVolume(v2);
        System.out.println("t2 channel is " + t2.channel + " and volume is " + t2.volume);
        t2.channelUp();
        t2.channelDown();
        System.out.println(
                "t2 channel after increasing is " + t2.channel + " and volume after increasing is " + t2.volume);
        t2.volumeUp();
        t2.volumeDown();
        System.out.println(
                "t1 channel after decreasing is " + t2.channel + " and volume after decreasing is " + t2.volume);

    }
}