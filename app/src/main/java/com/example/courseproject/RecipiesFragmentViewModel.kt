package com.example.courseproject

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class RecipiesFragmentViewModel : ViewModel() {
    val recipies = MutableLiveData(Meal.getMockMeals())
}