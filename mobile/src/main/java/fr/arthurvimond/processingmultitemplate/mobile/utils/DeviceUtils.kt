package fr.arthurvimond.processingmultitemplate.mobile.utils

import android.view.Window
import android.view.WindowManager

class DeviceUtils {

    companion object {

        fun fullscreen(window: Window) {
            window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        }

        fun wakeLock(window: Window) {
            window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
        }

    }

}