package lat.pam.kopidannyemil

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        // Hubungkan tombol navigasi bawah di halaman Profile
        val navHome = findViewById<Button>(R.id.navHome)
        val navOrder = findViewById<Button>(R.id.navOrder)
        val navProfile = findViewById<Button>(R.id.navProfile)

        // Pindah ke Home
        navHome.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }

        // Pindah ke Order (kalau nanti ada halamannya)
        navOrder.setOnClickListener {
            // val intent = Intent(this, OrderActivity::class.java)
            // startActivity(intent)
        }

        // Tombol Profile (sedang di halaman Profile)
        navProfile.setOnClickListener {
            // Sudah di halaman Profile
        }
    }
}