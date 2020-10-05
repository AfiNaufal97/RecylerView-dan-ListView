package id.ac.politeknikharber.latihanrecylerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class Adapter(private val data:ArrayList<Users>) : RecyclerView.Adapter<Adapter.Holder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list, parent, false)
        return Holder(view)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        val bingkai = data[position]
        holder.isi.text = bingkai.isi
        Glide.with(holder.itemView.context)
            .load(bingkai.foto)
            .into(holder.photo)

        holder.itemView.setOnClickListener {
            Toast.makeText(holder.itemView.context, "hallo ${bingkai.isi}", Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int {
        return data.size
    }

    inner class Holder(view: View):RecyclerView.ViewHolder(view){
        val isi:TextView = view.findViewById(R.id.lbList)
        val photo:ImageView = view.findViewById(R.id.foto)
    }

}