package mehedi.codingwithmehedi.appscheduler.ui.fragments.home

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import mehedi.codingwithmehedi.appscheduler.databinding.FragmentHomeBinding
import mehedi.codingwithmehedi.appscheduler.ui.activity.schedule.AddScheduleActivity


class homeFragment : Fragment() {
    lateinit var binding: FragmentHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //binding = FragmentHomeBinding.bind()
        binding = FragmentHomeBinding.inflate(inflater,container,false)

        binding.imageButtonAddSchedule.setOnClickListener {
            val intent = Intent(context,AddScheduleActivity::class.java)
            startActivity(intent)
        }

        return binding.root
    }
}



