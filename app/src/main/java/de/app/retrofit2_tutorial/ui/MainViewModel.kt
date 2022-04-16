package de.app.retrofit2_tutorial.ui

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import de.app.retrofit2_tutorial.data.University
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainViewModel(application: Application) : AndroidViewModel(application) {

    private var listOfUniversities: MutableLiveData<List<University>> = MutableLiveData()

    // Requests:
    fun getUniversitiesByCountry(country: String) {
        TODO("call interface method with coroutines")
    }


    // Livedata Getter:
    fun getLiveListOfUniversities(): LiveData<List<University>> = listOfUniversities

}