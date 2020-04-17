package com.example.ujikompwpbadmin


import android.content.Context
import android.os.Bundle
import android.os.Message
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_generate.*
import kotlinx.android.synthetic.main.fragment_generate.view.*
import java.time.Duration

/**
 * A simple [Fragment] subclass.
 */
class GenerateFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_generate, container, false)

        view.card_pdf.setOnClickListener {
            view -> ( Toast.makeText(context, "The report will be printed in PDF format", Toast.LENGTH_SHORT).show())
        }
        view.card_excel.setOnClickListener {
                view -> ( Toast.makeText(context, "The report will be printed in Excel format", Toast.LENGTH_SHORT).show())
        }
        view.img_pdf.setOnClickListener {
                view -> ( Toast.makeText(context, "The report will be printed in PDF format", Toast.LENGTH_SHORT).show())
        }
        view.img_excel.setOnClickListener {
                view -> ( Toast.makeText(context, "The report will be printed in Excel format", Toast.LENGTH_SHORT).show())
        }
        return view
    }



}
