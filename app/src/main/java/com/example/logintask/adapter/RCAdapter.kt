package com.example.logintask.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.logintask.R
import com.example.logintask.model.UserDataModel

class RCAdapter(val user_data: ArrayList<UserDataModel>): RecyclerView.Adapter<RCAdapter.RCViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RCViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.recycle_row,parent,false)
        return RCViewHolder(view)
    }

    override fun onBindViewHolder(holder: RCViewHolder, position: Int) {
        holder.textName.text = user_data[position].name
        holder.textAge.text = user_data[position].age.toString()
        holder.textAddress.text = user_data[position].address
    }
    
    override fun getItemCount(): Int {
        return user_data.size
    }
    
    class RCViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var textName = itemView.findViewById<TextView>(R.id.rc_name)
        var textAge = itemView.findViewById<TextView>(R.id.rc_age)
        var textAddress = itemView.findViewById<TextView>(R.id.rc_address)
    }
    
    
}


