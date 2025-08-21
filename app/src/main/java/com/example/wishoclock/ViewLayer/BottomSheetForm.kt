package com.example.wishoclock.ViewLayer

import android.app.DatePickerDialog
import android.os.Bundle
import android.provider.CalendarContract
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.wishoclock.R
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.google.android.material.textfield.TextInputLayout
import java.util.Calendar

class BottomSheetForm : BottomSheetDialogFragment(){
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val formView : View = inflater.inflate(R.layout.bottom_sheet_user_form,container,false)
        val dateInputLayout = formView.findViewById<TextInputLayout>(R.id.dateInputLayout)
        val nameInputLayout = formView.findViewById<TextInputLayout>(R.id.nameInputLayout)
        val cityInputLayout = formView.findViewById<TextInputLayout>(R.id.cityInputLayout)

        val usrNameText : EditText = formView.findViewById<EditText>(R.id.nameEditText)
        val dateEditText : EditText = formView.findViewById<EditText>(R.id.dateEditText)
        val cityEditText : EditText = formView.findViewById<EditText>(R.id.cityEditText)

        val usrTimeZone : TextView = formView.findViewById<TextView>(R.id.usr_time_zone)
        val recpTimeZone : TextView = formView.findViewById<TextView>(R.id.recipent_time_zone)

        val cancelBtn : Button = formView.findViewById<Button>(R.id.cancel_button)
        val saveBtn : Button = formView.findViewById<Button>(R.id.save_button)

        val occasionList : TextView = formView.findViewById<TextView>(R.id.occasion_list)

        val calendar = Calendar.getInstance()
        dateEditText.setOnClickListener {
            showDatePicker(dateEditText, calendar)
        }

        // Handle click on end icon
        dateInputLayout.setEndIconOnClickListener {
            showDatePicker(dateEditText, calendar)
        }



        return formView
    }

    fun showDatePicker(editText: EditText, calendar: Calendar) {

        val year = calendar.get(Calendar.YEAR)
        val month = calendar.get(Calendar.MONTH)
        val dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH)

        val datePickerDialog = DatePickerDialog(requireContext(), { _, y, m, d ->
            editText.setText(String.format("%02d/%02d/%04d", m + 1, d, y))
        }, year, month, dayOfMonth)

        datePickerDialog.show()
    }
}