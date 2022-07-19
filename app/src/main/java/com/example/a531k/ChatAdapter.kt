package com.example.a531k

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class ChatAdapter(var context: Context, var item: ArrayList<Chat>):
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_chat, parent, false)
        return MessageHolder(view)
    }

    class MessageHolder(view:View) : RecyclerView.ViewHolder(view) {

        var profile: ShapeableImageView
        var fullname: TextView

        init {
            profile = itemView.findViewById(R.id.iv_profile)
            fullname =itemView.findViewById(R.id.fullname)
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
       val chat = item[position]

        if (holder is MessageHolder){
            val shapeableImageView: ShapeableImageView = (holder as MessageHolder).profile
            val textView: TextView = (holder as MessageHolder).fullname
            shapeableImageView.setImageResource(chat.profile)
            textView.text = chat.fullname
        }
    }

    override fun getItemCount(): Int {
        return item.size
    }
}