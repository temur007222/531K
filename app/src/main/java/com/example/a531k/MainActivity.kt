package com.example.a531k

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.widget.NestedScrollView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    var nestedScrollView: NestedScrollView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getAllChats()
    }

    private fun getAllChats() {

        val chat = ArrayList<Chat>()

        val recyclerView = findViewById<RecyclerView>(R.id.rv)
        nestedScrollView = findViewById(R.id.nestedScrollView)
        recyclerView.layoutManager = GridLayoutManager(this, 1)

        chat.add(Chat(R.drawable.f,  "Temur Xaydarov"))
        chat.add(Chat(R.drawable.nissan,  "Nick Johnson"))
        chat.add(Chat(R.drawable.volkswagen,  "Sarah Trevor"))
        chat.add(Chat(R.drawable.f,  "Temur Xaydarov"))
        chat.add(Chat(R.drawable.nissan,  "Nick Johnson"))
        chat.add(Chat(R.drawable.volkswagen,  "Sarah Trevor"))
        chat.add(Chat(R.drawable.f,  "Temur Xaydarov"))
        chat.add(Chat(R.drawable.nissan,  "Nick Johnson"))
        chat.add(Chat(R.drawable.volkswagen,  "Sarah Trevor"))
        chat.add(Chat(R.drawable.f,  "Temur Xaydarov"))
        chat.add(Chat(R.drawable.nissan,  "Nick Johnson"))
        chat.add(Chat(R.drawable.volkswagen,  "Sarah Trevor"))
        chat.add(Chat(R.drawable.f,  "Temur Xaydarov"))
        chat.add(Chat(R.drawable.nissan,  "Nick Johnson"))
        chat.add(Chat(R.drawable.volkswagen,  "Sarah Trevor"))

        val adapter = ChatAdapter(this, chat)
        recyclerView.adapter = adapter
        recyclerView.isNestedScrollingEnabled = false
    }
}