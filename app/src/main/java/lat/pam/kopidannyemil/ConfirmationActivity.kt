package lat.pam.kopidannyemil

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ConfirmationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirmation)

        val tvGreeting = findViewById<TextView>(R.id.tvGreetingConfirmation)

        // Cek nama dari Intent dulu, kalau kosong ambil dari SharedPreferences
        var name = intent.getStringExtra("EXTRA_NAME")
        if (name.isNullOrEmpty()) {
            val sharedPreferences = getSharedPreferences("UserPrefs", MODE_PRIVATE)
            name = sharedPreferences.getString("PREF_NAME", "")
        }

        // Tampilkan namanya jika ada
        if (!name.isNullOrEmpty()) {
            tvGreeting.text = "Halo $name,"
        } else {
            tvGreeting.text = "Halo Nama,"
        }

        // Tombol Oke kembali ke Home
        val btnHome = findViewById<Button>(R.id.btnHome)
        btnHome?.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            intent.putExtra("EXTRA_NAME", name)
            startActivity(intent)
            finish()
        }
    }
}