package de.sanexio.kotlin.uibasics

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val meinLayout = findViewById<LinearLayout>(R.id.linear) as LinearLayout

        val radioGruppe = RadioGroup(this)
        val button1 = RadioButton(this)
        button1.text = "Gut"
        button1.id = View.generateViewId()
        button1.tag = "Test Button 1"
        radioGruppe.addView(button1)

        val button2 = RadioButton(this)
        button2.text = "Mittel"
        button2.id = View.generateViewId()
        button2.tag = "Test Button 2"
        radioGruppe.addView(button2)

        val button3 = RadioButton(this)
        button3.text = "Schlecht"
        button3.id = View.generateViewId()
        button3.tag = "Test Button 3"
        radioGruppe.addView(button3)

        meinLayout.addView(radioGruppe)

        val button = Button(this)
        button.text="Klick!"
        meinLayout.addView(button)

        button.setOnClickListener{

            val klickId = radioGruppe.checkedRadioButtonId
            val selectButton = findViewById<RadioButton>(klickId)

            val textDesButtons = selectButton.tag
            Toast.makeText(this,"Klick: $textDesButtons", Toast.LENGTH_LONG).show()
        }



    }
}
