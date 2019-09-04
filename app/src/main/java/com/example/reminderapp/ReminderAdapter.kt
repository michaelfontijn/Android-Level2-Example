package com.example.reminderapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class ReminderAdapter(private val reminders: List<Reminder>) :
    RecyclerView.Adapter<ReminderAdapter.ViewHolder>() {

    /**
     * Creates and returns a ViewHolder object, inflating a standard layout called simple_list_item_1.
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater
                .from(parent.context).inflate(android.R.layout.simple_list_item_1, parent, false)
        )
    }

    /**
     * Returns the size of the list
     */
    override fun getItemCount(): Int {
        return reminders.size
    }

    /**
     * Called by RecyclerView to display the data at the specified position.
     */
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(reminders[position])
    }


    //this is a inner class, not sure what this means /why
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        //TODO not sure what this does? text1??
        private val tvReminder: TextView = itemView.findViewById(android.R.id.text1)

        //binds a given reminder to the reminder text input
        fun bind(reminder: Reminder) {
            tvReminder.text = reminder.reminder
        }
    }

}
