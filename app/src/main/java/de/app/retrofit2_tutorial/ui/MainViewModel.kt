package de.app.retrofit2_tutorial.ui

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import de.app.retrofit2_tutorial.data.RetrofitInstance
import de.app.retrofit2_tutorial.data.University
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainViewModel(application: Application) : AndroidViewModel(application) {

    private var listOfUniversities: MutableLiveData<List<University>> = MutableLiveData()

    // Requests:
    fun getUniversitiesByCountry(country: String) {

        viewModelScope.launch {
            val response = RetrofitInstance.api.getUniversitiesByCountry(country)
            if (response.isSuccessful) {
                Log.d("Test", "Succesful")
                listOfUniversities.value = response.body()
            } else {
                Log.d("Test", "Not Succesful: ${response.code()}")
            }
        }
    }


    // Livedata Getter:
    fun getLiveListOfUniversities(): LiveData<List<University>> = listOfUniversities

}