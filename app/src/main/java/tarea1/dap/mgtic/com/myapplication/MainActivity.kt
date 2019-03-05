package tarea1.dap.mgtic.com.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    var bandera: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("onCreate")
    }
    override fun onStart() {
        super.onStart()
        println("onStart")
    }
    override fun onPause() {
        super.onPause()
        println("onPause")
    }
    override fun onResume() {
        super.onResume()
        println("onResume")
    }
    override fun onStop() {
        super.onStop()
        println("onStop")
    }
    override fun onRestart() {
        super.onRestart()
        println("onRestart")
    }
    override fun onDestroy() {
        super.onDestroy()
        println("onDestroy")
    }

}
