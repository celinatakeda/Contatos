package com.example.contatobootcamp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContactsAdapter (val contactsList: ArrayList<Contact>): RecyclerView.Adapter<ContactsAdapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsAdapter.ViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.contact_view, parent, false)
       return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ContactsAdapter.ViewHolder, position: Int) {
        holder.bindIem(contactsList[position])
    }

    override fun getItemCount(): Int {
       return contactsList.size
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        //receber os contatos
        fun bindIem(contact: Contact) {

            val textName = itemView.findViewById<TextView>(R.id.contact_name)
            val textPhone = itemView.findViewById<TextView>(R.id.contact_phone_number)
            val textNameAlternative = itemView.findViewById<TextView>(R.id.display_name_alternative)

            textName.text = contact.name
            textPhone.text = contact.phoneNumber
            textNameAlternative.text = contact.displayNomeAlternative

        }

    }
}