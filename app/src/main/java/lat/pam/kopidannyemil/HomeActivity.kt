package lat.pam.kopidannyemil

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // 1. Logika sapaan nama yang dinamis
        val tvGreeting = findViewById<TextView>(R.id.tvGreeting)
        val name = intent.getStringExtra("EXTRA_NAME")

        if (!name.isNullOrEmpty()) {
            tvGreeting.text = "Halo $name,"
        }

        // 2. Logika tombol navigasi bawah agar bisa diklik dan berpindah halaman
        val btnNavHome = findViewById<Button>(R.id.navHome)
        val btnNavOrder = findViewById<Button>(R.id.navOrder)
        val btnNavProfile = findViewById<Button>(R.id.navProfile)

        btnNavHome?.setOnClickListener {
            // Sudah di halaman Home, bisa dikosongkan atau di-refresh
        }

        btnNavOrder?.setOnClickListener {
            val intent = Intent(this, OrderActivity::class.java)
            intent.putExtra("EXTRA_NAME", name) // Agar nama tetap terbawa ke halaman Order
            startActivity(intent)
        }

        btnNavProfile?.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            intent.putExtra("EXTRA_NAME", name) // Agar nama tetap terbawa ke halaman Profile
            startActivity(intent)
        }
    }
}