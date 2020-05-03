package commands

import java.awt.MouseInfo
import java.awt.Robot
import java.awt.event.InputEvent

class TrackPadEmulator {

    val robot = Robot()

    fun moveMouse(xVal: Int?, yVal: Int?) {

        val currentMouseLocation = MouseInfo.getPointerInfo().location
        robot.mouseMove(
                (currentMouseLocation.getX() + xVal!!).toInt(),
                (currentMouseLocation.getY() + yVal!!).toInt()
        )
    }

    fun leftClick(){

        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK)
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK)
    }

    fun rightClick(){

        robot.mousePress(InputEvent.BUTTON3_DOWN_MASK)
        robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK)
    }

    fun scrollUp() {
        robot.mouseWheel(-5)
    }

    fun scrollDown() {
        robot.mouseWheel(5)
    }
}