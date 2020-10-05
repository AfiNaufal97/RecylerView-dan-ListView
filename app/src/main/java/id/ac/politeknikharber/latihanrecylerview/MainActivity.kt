package id.ac.politeknikharber.latihanrecylerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adp:RecyclerView
    val data:ArrayList<Users> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        runRecylerView()
    }

    private fun runRecylerView(){

        // deklarasikan recylerview
        adp = findViewById(R.id.r_view)

        // atur recylerview
        r_view.setHasFixedSize(true)
        r_view.layoutManager = LinearLayoutManager(this)

        // masukan data
        data.addAll(DataUsers.dataLengkap)

        val masukan = Adapter(data)
        adp.adapter = masukan
    }
}