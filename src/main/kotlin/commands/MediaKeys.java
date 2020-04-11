/*
 * Original Author: Aidan Evans
 * Date: 3/23/2019
 */


package commands;


import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.net.URL;

public class MediaKeys {

    private  Robot robot;

    public MediaKeys(){

        System.setProperty("java.awt.headless", "false");
        System.load(new File("MediaKeys.dll").getAbsolutePath());
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public native void volumeMute();
    public native void volumeDown();
    public native void volumeUp();

    public void mediaForward(){

        robot.keyPress(KeyEvent.VK_RIGHT);
        robot.keyRelease(KeyEvent.VK_RIGHT);
    }

    public void mediaBackward(){

        robot.keyPress(KeyEvent.VK_LEFT);
        robot.keyRelease(KeyEvent.VK_LEFT);
    }

    public native void songPrevious();
    public native void songNext();
    public native void songPlayPause();

    public void pressSpacebar(){

        robot.keyPress(KeyEvent.VK_SPACE);
        robot.keyRelease(KeyEvent.VK_SPACE);
    }

}
