package fr.arthurvimond.processingmultitemplate.wear

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.FragmentActivity
import fr.arthurvimond.processingmultitemplate.sketch.Sketch
import kotlinx.android.synthetic.main.activity_main.*
import processing.android.PFragment
import processing.core.PApplet

class MainActivity : FragmentActivity() {

    private val sketch = Sketch()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Enables Always-on
//        setAmbientEnabled()

        val fragment = PFragment(sketch)
        fragment.setView(sketchContainer, this)

    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<String>, grantResults: IntArray) {
        val pApplet = sketch as PApplet
        pApplet.onRequestPermissionsResult(requestCode, permissions, grantResults)
    }

    public override fun onNewIntent(intent: Intent) {
        val pApplet = sketch as PApplet
        pApplet.onNewIntent(intent)
    }

}
