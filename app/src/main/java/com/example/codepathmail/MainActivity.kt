package com.example.codepathmail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import layout.EmailAdapter

class MainActivity : AppCompatActivity() {

    lateinit var emails: List<Email>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Loookup the RecyclerView in activity layout
        val emailsRv = findViewById<RecyclerView>(R.id.emailRv)
        //Fetch the list of emails
        emails = EmailFetcher.getEmails()
        //Create an instance of EmailAdapterto pass in list of emails
        val adapter = EmailAdapter(emails)
        //Attach adapter to RecyclerView
        emailsRv.adapter = adapter
        //Position items
        emailsRv.layoutManager = LinearLayoutManager(this)
    }
}