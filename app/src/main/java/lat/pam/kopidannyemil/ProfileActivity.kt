package lat.pam.kopidannyemil

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val tvGreeting = findViewById<TextView>(R.id.tvProfileGreeting)
        val etProfileName = findViewById<EditText>(R.id.etProfileName)
        val btnSaveProfile = findViewById<Button>(R.id.btnSaveProfile)

        // 1. Ambil data dari SharedPreferences saat halaman dibuka
        val sharedPreferences = getSharedPreferences("UserPrefs", MODE_PRIVATE)
        val savedName = sharedPreferences.getString("PREF_NAME", "")

        if (!savedName.isNullOrEmpty()) {
            etProfileName?.setText(savedName)
            tvGreeting.text = "Halo $savedName,"
        }

        // 2. Saat tombol Save dipencet, SIMPAN dan KIRIM
        btnSaveProfile?.setOnClickListener {
            val nameString = etProfileName?.text.toString().trim()

            if (nameString.isNotEmpty()) {
                // Simpan ke memori HP
                sharedPreferences.edit().putString("PREF_NAME", nameString).apply()

                tvGreeting.text = "Halo $nameString,"

                // Langsung oper juga lewat Intent ke HomeActivity agar langsung nyantol
                val intent = Intent(this, HomeActivity::class.java)
                intent.putExtra("EXTRA_NAME", nameString)
                startActivity(intent)
                finish()
            }
        }

        // Navigasi Bawah
        findViewById<Button>(R.id.navHome)?.setOnClickListener {
            val nameCurrent = etProfileName?.text.toString().trim().ifEmpty { savedName }
            val intent = Intent(this, HomeActivity::class.java)
            intent.putExtra("EXTRA_NAME", nameCurrent)
            startActivity(intent)
        }
        findViewById<Button>(R.id.navOrder)?.setOnClickListener {
            val nameCurrent = etProfileName?.text.toString().trim().ifEmpty { savedName }
            val intent = Intent(this, OrderActivity::class.java)
            intent.putExtra("EXTRA_NAME", nameCurrent)
            startActivity(intent)
        }
    }
}