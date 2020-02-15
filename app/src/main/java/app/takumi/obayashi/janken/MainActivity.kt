package app.takumi.obayashi.janken

import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun goo(view: View) {
        player.setImageResource(R.drawable.goo)
        val number = Random.nextInt(3)

        when (number) {
            0 -> {
                cpu.setImageResource(R.drawable.goo)
                result.text = "あいこです"
                result.setTextColor(Color.BLACK)
            }
            1 -> {
                cpu.setImageResource(R.drawable.choki)
                result.text = "あなたの勝ちです"
                result.setTextColor(Color.RED)
            }
            2 -> {
                cpu.setImageResource(R.drawable.paa)
                result.text = "あなたの負けです"
                result.setTextColor(Color.BLUE)
            }
        }
    }

    fun choki(view: View) {
        player.setImageResource(R.drawable.choki)
        val number = Random.nextInt(3)

        when (number) {
            0 -> {
                cpu.setImageResource(R.drawable.goo)
                result.text = "あなたの負けです"
                result.setTextColor(Color.BLUE)
            }
            1 -> {
                cpu.setImageResource(R.drawable.choki)
                result.text = "あいこです"
                result.setTextColor(Color.BLACK)
            }
            2 -> {
                cpu.setImageResource(R.drawable.paa)
                result.text = "あなたの勝ちです"
                result.setTextColor(Color.RED)
            }
        }
    }

    fun paa(view: View) {
        player.setImageResource(R.drawable.paa)
        val number = Random.nextInt(3)

        when (number) {
            0 -> {
                cpu.setImageResource(R.drawable.goo)
                result.text = "あなたの勝ちです"
                result.setTextColor(Color.RED)
            }
            1 -> {
                cpu.setImageResource(R.drawable.choki)
                result.text = "あなたの負けです"
                result.setTextColor(Color.BLUE)
            }
            2 -> {
                cpu.setImageResource(R.drawable.paa)
                result.text = "あいこです"
                result.setTextColor(Color.BLACK)
            }
        }

    }
}
