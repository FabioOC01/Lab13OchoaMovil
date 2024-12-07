package com.ochoa.orlando.lab13

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.ochoa.orlando.lab13.databinding.ListItemImgBinding
import java.io.File

class GalleryAdapter(private val fileArray: Array<File>) : RecyclerView.Adapter<GalleryAdapter.ViewHolder>() {

    class ViewHolder(private val binding: ListItemImgBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(file: File) {
            Glide.with(binding.root).load(file).into(binding.localImg)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ListItemImgBinding.inflate(layoutInflater, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(fileArray[position])
    }

    override fun getItemCount(): Int {
        return fileArray.size
    }
}