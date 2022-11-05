package com.example.todolist

import android.annotation.SuppressLint
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private var x = 0
    private var parentLinearLayout: LinearLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        parentLinearLayout = findViewById(R.id.taskViewArea)
    }
    @SuppressLint("InflateParams")
    fun addTask(view: View){
        val inflater = getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val rowView: View = inflater.inflate(R.layout.task_item, null)

        // change the text of the task as per the clicked icon
        val label:String = view.contentDescription.toString()
        rowView.findViewById<TextView>(R.id.task).text = label

        // update the task to the linear layout
        Toast.makeText(this, "$label task added successfully", Toast.LENGTH_SHORT).show()
        parentLinearLayout!!.addView(rowView, parentLinearLayout!!.childCount)
    }
}

