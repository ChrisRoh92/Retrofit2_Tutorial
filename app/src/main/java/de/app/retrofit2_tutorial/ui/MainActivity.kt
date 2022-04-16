package de.app.retrofit2_tutorial.ui

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import de.app.retrofit2_tutorial.R

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel

    // Views:
    private lateinit var searchBar: EditText
    private lateinit var btnSearch: ImageButton

    // RecyclerView:
    private lateinit var rv: RecyclerView
    private lateinit var layoutManager: LinearLayoutManager
    private lateinit var adapter: UniversityListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initRecyclerView()
        initControlElements()

        TODO("init ViewModel + create Observer")

    }


    private fun initControlElements() {
        searchBar = findViewById(R.id.et_search)
        btnSearch = findViewById(R.id.btn_search)

        btnSearch.setOnClickListener {
            if (searchBar.text.toString().isNotEmpty()) {
                viewModel.getUniversitiesByCountry(searchBar.text.toString())
                searchBar.text.clear()
            }
        }
    }

    private fun initRecyclerView() {
        rv = findViewById(R.id.rv)
        layoutManager = LinearLayoutManager(rv.context, RecyclerView.VERTICAL, false)
        adapter = UniversityListAdapter(listOf()) {
            openBrowser(it)
        }

        rv.layoutManager = layoutManager
        rv.adapter = adapter
    }

    private fun openBrowser(url: String) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(browserIntent)
    }


}