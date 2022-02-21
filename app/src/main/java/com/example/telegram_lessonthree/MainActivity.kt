package com.example.telegram_lessonthree

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

     fun initViews() {
         recyclerView=findViewById<RecyclerView>(R.id.recyclerView)
         recyclerView.setLayoutManager(GridLayoutManager(this,1))

         refreshAdapter(getAllChats())
    }

     fun getAllChats(): ArrayList<Chat> {
        val chats:ArrayList<Chat> = ArrayList<Chat>()
         chats.add(Chat(R.drawable.me,"Mirzayev Shaxzod","something diffrent"))
         chats.add(Chat(R.drawable.me,"Mirzayev Shaxzod","something diffrent"))
         chats.add(Chat(R.drawable.me,"Mirzayev Shaxzod","something diffrent"))
         chats.add(Chat(R.drawable.me,"Mirzayev Shaxzod","something diffrent"))
         chats.add(Chat(R.drawable.me,"Mirzayev Shaxzod","something diffrent"))
         chats.add(Chat(R.drawable.me,"Mirzayev Shaxzod","something diffrent"))
         chats.add(Chat(R.drawable.me,"Mirzayev Shaxzod","something diffrent"))
         chats.add(Chat(R.drawable.me,"Mirzayev Shaxzod","something diffrent"))
         chats.add(Chat(R.drawable.me,"Mirzayev Shaxzod","something diffrent"))
         chats.add(Chat(R.drawable.me,"Mirzayev Shaxzod","something diffrent"))
         chats.add(Chat(R.drawable.me,"Mirzayev Shaxzod","something diffrent"))
         chats.add(Chat(R.drawable.me,"Mirzayev Shaxzod","something diffrent"))
         chats.add(Chat(R.drawable.me,"Mirzayev Shaxzod","something diffrent"))
         chats.add(Chat(R.drawable.me,"Mirzayev Shaxzod","something diffrent"))
         return chats
    }

    fun refreshAdapter(chats:ArrayList<Chat>) {
         val adapter=ChatAdapter(this,chats)
         recyclerView.adapter=adapter

    }
}