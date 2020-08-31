package com.example.shopinglist

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.shoping_item.view.*

data class
ShoppingItem(val name: String,
             val quantity: Int,
             val unit: String)

//class ShopinggItemAdapter(context: Context, items: List<shopping_item_list>) :
//        ArrayAdapter<ShoppingItem>(context, 0, items)
//
//override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
//    val view = convertView ?: LayoutInflater.from(context)
//        .inflate(R.layout.shoping_item, parent, false)
//    val item = shoppingItems(position)!!
//
//    view.item_name.text = item.itemName
//    view.item_count.text = context.resources
//        .getString(R.string.quantity_text, item.quantity, item.unit)
//}
//
//return view

class MainActivity : AppCompatActivity() {
    private val shoppingItems = mutableListOf("pirmais", "otrais", "trešais",
            "ceturtais", "pirmais", "otrais", "trešais", "ceturtais", "pirmais", "otrais", "trešais",
            "ceturtais", "pirmais", "otrais", "trešais", "ceturtais", "pirmais", "otrais", "trešais",
            "ceturtais", "pirmais", "otrais", "trešais", "ceturtais", "pirmais", "otrais", "trešais",
            "ceturtais")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, shoppingItems)
        main_list.adapter = adapter
        main_list.setOnItemClickListener {
            parent, view, position, id ->
            Toast.makeText(this, shoppingItems[position], Toast.LENGTH_SHORT).show()
        }
    }
}