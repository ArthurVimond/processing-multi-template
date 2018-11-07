package fr.arthurvimond.processingmultitemplate.sketch

import processing.core.PApplet

class Sketch : PApplet() {

    override fun settings() {
        fullScreen()

    }

    override fun setup() {
        orientation(PORTRAIT)
    }

    override fun draw() {
        background(0)
        fill(255f, 0f, 0f)
        ellipse(mouseX.toFloat(), mouseY.toFloat(), 80f, 80f)
    }

}