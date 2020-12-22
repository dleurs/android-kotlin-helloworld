package fr.dleurs.android.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class  MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val button = findViewById<Button>(R.id.start_activity_green_button)
        startActivityGreenButton.setOnClickListener {
            println("startActivityGreenButton clicked !")
            val intent = Intent(this, GreenActivity::class.java)
            intent.action = Intent.ACTION_VIEW
            intent.addCategory("UserViewer")
            var user: User = User("Dimitri", age = 23)
            intent.putExtra("user", user)
            startActivity(intent)
        }
    }
}

