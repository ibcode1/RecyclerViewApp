package com.ib.makerlist

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ListItemViewHolder(itemview: View) : RecyclerView.ViewHolder(itemview) {
    val taskTextView = itemView.findViewById(R.id.textView_task) as TextView
}