package dts.apps.ass4_mobdev

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import dts.apps.ass4_mobdev.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        onListener()
    }

    private fun onListener() {
        val clickable : List<View> = listOf(
            binding.firstBox , binding.secondBox , binding.thirdBox , binding.fourthBox ,
            binding.fifthBox , binding.mainActLayout , binding.btnRed , binding.btnBlue , binding.btnGreen
        )

        for (item in clickable) {
            item.setOnClickListener { setColor(it) }
        }
    }

    private fun setColor(view : View) {
        when(view.id) {
            R.id.first_box -> view.setBackgroundColor(Color.DKGRAY)
            R.id.second_box -> view.setBackgroundColor(Color.GRAY)
            R.id.third_box -> view.setBackgroundColor(Color.BLUE)
            R.id.fourth_box -> view.setBackgroundColor(Color.MAGENTA)
            R.id.fifth_box -> view.setBackgroundColor(Color.BLUE)

            R.id.btn_blue -> binding.thirdBox.setBackgroundResource(R.color.blue_)
            R.id.btn_red -> binding.fourthBox.setBackgroundResource(R.color.red_)
            R.id.btn_green -> binding.fifthBox.setBackgroundResource(R.color.green_)
        }
    }

}