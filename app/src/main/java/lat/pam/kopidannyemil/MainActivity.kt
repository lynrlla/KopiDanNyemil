package lat.pam.kopidannyemil

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // Tombol "Start now" di halaman splash
        val btnStart = findViewById<Button>(R.id.btnStart)
        btnStart.setOnClickListener {
            // Berpindah ke halaman Sign Up saat tombol diklik (tambahkan .java di sini)
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }
    }
}