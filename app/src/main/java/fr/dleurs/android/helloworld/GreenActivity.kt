package fr.dleurs.android.helloworld

import android.app.AlertDialog
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.FragmentActivity
import kotlinx.android.synthetic.main.activity_green.*

class GreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_green)
        val action = intent.action
        val isUserViewer: Boolean = intent.hasCategory("UserViewer")
        val user:User? = intent.getParcelableExtra<User>("user")
        println("action : $action, isUserViewer : $isUserViewer, extras' user : $user")
        nameText.text = user?.name
        ageText.text = user?.age.toString()

        deleteUserButton.setOnClickListener{
            val builder = ConfirmDeleteDialog(this).createDialog()
            builder.show()
            //fragment.show(android.support.v4.app.FragmentActivity.getSupportFragmentManager(), "Hello")
        }
    }
}