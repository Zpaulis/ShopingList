package com.example.shopinglist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

data class
ShoppingItem(val name: String,
             val quantity: Int,
             val unit: String)


class MainActivity : AppCompatActivity() {
    val shoppingItems = mutableListOf(
        ShoppingItem ("pirmais", 1, "trešais"),
        ShoppingItem ("ceturtais", 2, "otrais"),
        ShoppingItem ("trešais", 3, "pirmais"),
        ShoppingItem ("otrais", 4, "ceturtais"),
        ShoppingItem ("pirmais", 5, "trešais"),
        ShoppingItem ("ceturtais", 6, "otrais"),
        ShoppingItem ("trešais", 7, "pirmais"),
        ShoppingItem ("otrais", 8, "ceturtais"),
        ShoppingItem ("pirmais", 9, "trešais"),
        ShoppingItem ("ceturtais",10, "pēdējais"))
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, shoppingItems)
        val adapter = ShoppingItemAdapter(this, shoppingItems)
        main_list.adapter = adapter
        main_list.setOnItemClickListener {
            parent, view, position, id ->
//            Toast.makeText(this, shoppingItems[position], Toast.LENGTH_SHORT).show()
        }
    }
}