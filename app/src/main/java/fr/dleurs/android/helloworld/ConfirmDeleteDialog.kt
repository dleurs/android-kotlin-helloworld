package fr.dleurs.android.helloworld

import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.DialogFragment

class ConfirmDeleteDialog(var context: android.content.Context) {
    fun createDialog(): AlertDialog.Builder {
        val builder = AlertDialog.Builder(context)

        builder.setMessage("Delete user ?")
        builder.setPositiveButton("Yes", object : DialogInterface.OnClickListener {
            override fun onClick(dialog: DialogInterface?, which: Int) {
                Log.i("TAG","Success : User deleted")
            }
        })
        builder.setNegativeButton("No", object: DialogInterface.OnClickListener {
            override fun onClick(dialog: DialogInterface?, which: Int) {
                Log.i("TAG","Cancelled : User not deleted")
            }

        })
        return builder
    }

}