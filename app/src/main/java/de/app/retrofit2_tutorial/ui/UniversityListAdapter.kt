package de.app.retrofit2_tutorial.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import de.app.retrofit2_tutorial.R
import de.app.retrofit2_tutorial.data.University

class UniversityListAdapter(var unis: List<University>, var callback: (url: String) -> Unit) :
    RecyclerView.Adapter<UniversityListAdapter.ViewHolder>() {


    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvName: TextView = itemView.findViewById(R.id.item_tv_name)
        val tvCountry: TextView = itemView.findViewById(R.id.item_tv_country)
        val tvWebPage: TextView = itemView.findViewById(R.id.item_tv_webpage)

        init {
            itemView.setOnClickListener {
                callback(tvWebPage.text.toString())
            }
        }
    }


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): UniversityListAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: UniversityListAdapter.ViewHolder, position: Int) {
        TODO("Please insert logic")
    }

    override fun getItemCount(): Int {
        return unis.size
    }

    fun updateContent(unis: List<University>) {
        this.unis = unis
        notifyDataSetChanged()
    }

}