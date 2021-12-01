package uz.azizbekxurramov.firebese

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /** Bu yerda firebase ni githab gab ga joylash uchun uzgratirish kirityapman*/
        Log.d("AZIZBEK", "Firebase mavzusi")
    }
}