package com.birzavitalvarez.myapproomdb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.birzavitalvarez.myapproomdb.Entity.UserEntity
import com.birzavitalvarez.myapproomdb.databinding.ActivityMainBinding
import kotlinx.coroutines.launch
import androidx.lifecycle.lifecycleScope
import com.birzavitalvarez.myapproomdb.DataBase.DBHandler

class MainActivity : AppCompatActivity() {

    private var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        var db = DBHandler.getDB(this)
        binding?.btnHello?.setOnClickListener {
            lifecycleScope.launch {
                //db.userDao.insertUser(UserEntity(1,"birza","birza@gmail.com"))
                println(db.userDao.getAllUsers())
            }

        }

    }

//    override fun onDestroy() {
//        super.onDestroy()
//        binding = null
//    }
}

