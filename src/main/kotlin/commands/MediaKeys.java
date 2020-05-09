/*
 * Original Author: Aidan Evans
 * Date: 3/23/2019
 */


package commands;


import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.net.URL;

public class MediaKeys {

    private Robot robot;

    public MediaKeys() {

        System.setProperty("java.awt.headless", "false");
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public void volumeMute() {

        this.issueConsoleCommand("amixer -q -D pulse sset Master toggle");
    }

    public void volumeDown() {

        this.issueConsoleCommand("amixer set 'Master' 5%-");
    }

    public void volumeUp() {

        this.issueConsoleCommand("amixer set 'Master' 5%+");
    }

    public void mediaForward() {

        robot.keyPress(KeyEvent.VK_RIGHT);
        robot.keyRelease(KeyEvent.VK_RIGHT);
    }

    public void mediaBackward() {

        robot.keyPress(KeyEvent.VK_LEFT);
        robot.keyRelease(KeyEvent.VK_LEFT);
    }

    public void songPrevious() {

        this.issueConsoleCommand("python mpris2-remote.py previous");
    }

    public void songNext() {

        this.issueConsoleCommand("python mpris2-remote.py next");
    }

    public void songPlayPause() {

        this.issueConsoleCommand("python mpris2-remote.py playpause");
    }

    public void pressSpacebar() {

        robot.keyPress(KeyEvent.VK_SPACE);
        robot.keyRelease(KeyEvent.VK_SPACE);
    }

    private void issueConsoleCommand(String command) {

        try {
            Process process = Runtime.getRuntime().exec(command);
            process.waitFor();
            process.destroy();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
