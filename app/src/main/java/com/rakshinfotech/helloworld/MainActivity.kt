package com.rakshinfotech.helloworld

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),View.OnClickListener {
    override fun onClick(v: View?) {
        if(txtName.text.toString().trim().length==0)
        {
            txtName.setError("can not be blank")
            return
        }

        Toast.makeText(this,txtName.text.toString(),Toast.LENGTH_LONG).show()

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.e("Actvity","onCreate")
        btnDisplay.setOnClickListener(this)

        cbMusic.setOnCheckedChangeListener { buttonView, isChecked ->
            Toast.makeText(this,"$isChecked",Toast.LENGTH_LONG).show()
        }

        rgGender.setOnCheckedChangeListener { group, checkedId ->
            var gender : String = when(checkedId)
            {
                R.id.rbMale-> "Male"
                R.id.rbFemale-> "Female"
                else -> ""
            }
            Toast.makeText(this,"$gender",Toast.LENGTH_LONG).show()

        }

    }

    override fun onStart() {
        super.onStart()
        Log.e("Actvity","onStart")
    }


    override fun onResume() {
        super.onResume()
        Log.e("Actvity","onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.e("Actvity","onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.e("Actvity","onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("Actvity","onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e("Actvity","onRestart")
    }
}
