package mehedi.codingwithmehedi.appscheduler.ui.activity.schedule

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.DatePicker
import mehedi.codingwithmehedi.appscheduler.R
import mehedi.codingwithmehedi.appscheduler.databinding.ActivityAddScheduleBinding

class AddScheduleActivity : AppCompatActivity(), DatePickerDialog.OnDateSetListener {
    lateinit var binding: ActivityAddScheduleBinding
    var day = 0;
    var month = 0;
    var year = 0;

    var savedDay = 0;
    var savedMonth = 0;
    var savedYear = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityAddScheduleBinding.inflate(layoutInflater)
        setContentView(binding.root)


        pickDate()
    }

    private fun pickDate() {

    }


    override fun onDateSet(view: DatePicker?, year: Int, month: Int, dayOfMonth: Int) {
        TODO("Not yet implemented")
    }
}