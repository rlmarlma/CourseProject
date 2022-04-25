package com.example.courseproject

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class MealsAdapter(private val listener: RecipiesFragment) : RecyclerView.Adapter<MealsAdapter.MealsViewHolder>() {

    private val meals = mutableListOf<Meal>()

    inner class MealsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val mealImageView: ImageView = itemView.findViewById(R.id.mealImage)
        val mealNameView: TextView = itemView.findViewById(R.id.mealName)
        val mealCookingTimeView: TextView = itemView.findViewById(R.id.mealCookingTime)

//        init {
//            itemView.setOnClickListener(this)
//        }
//
//        override fun onClick(v: View?) {
//            val position = adapterPosition
//            if (position != RecyclerView.NO_POSITION) {
//                listener.onItemClick(position)
//            }
//        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MealsAdapter.MealsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.meal_list_item, parent, false)
        return MealsViewHolder(view)
    }

    override fun onBindViewHolder(holder: MealsAdapter.MealsViewHolder, position: Int) {
        val meal = meals[position]
        holder.mealNameView.text = meal.mealName
        holder.mealCookingTimeView.text = meal.mealCookingTime

        Glide.with(holder.mealImageView.context)
            .load(meal.mealImageUrl)
            .centerCrop()
            .into(holder.mealImageView)
    }

    override fun getItemCount(): Int {
        return meals.size
    }

    interface OnItemClickListener {
        fun onItemClick(position: Int)
    }

    fun reload(data: List<Meal>){
        meals.clear()
        meals.addAll(data)
        notifyDataSetChanged()
    }
}