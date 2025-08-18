package com.example.wishoclock.ViewLayer

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.wishoclock.R
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class BottomSheetForm : BottomSheetDialogFragment(){
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val formView : View = inflater.inflate(R.layout.bottom_sheet_user_form,container,false)

        val usrNameText : EditText = formView.findViewById<EditText>(R.id.usr_name)
        val usrDateText : EditText = formView.findViewById<EditText>(R.id.usr_date)
        val usrCityText : EditText = formView.findViewById<EditText>(R.id.usr_city)

        val usrTimeZone : TextView = formView.findViewById<TextView>(R.id.usr_time_zone)
        val recpTimeZone : TextView = formView.findViewById<TextView>(R.id.recipent_time_zone)

        val cancelBtn : Button = formView.findViewById<Button>(R.id.cancel_button)
        val saveBtn : Button = formView.findViewById<Button>(R.id.save_button)

        val occasionList : TextView = formView.findViewById<TextView>(R.id.occasion_list)


        return formView
    }
}