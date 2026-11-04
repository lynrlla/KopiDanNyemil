package lat.pam.kopidannyemil

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class OrderActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)

        // Hubungkan tombol navigasi bawah
        val navHome = findViewById<Button>(R.id.navHome)
        val navOrder = findViewById<Button>(R.id.navOrder)
        val navProfile = findViewById<Button>(R.id.navProfile)

        // Tombol Kirim Pesanan di dalam form alamat (Sesuaikan ID-nya dengan XML kamu, misal: R.id.btnSubmit)
        val btnSubmitOrder = findViewById<Button>(R.id.btnSubmit) // Ganti jika ID tombolnya beda
        btnSubmitOrder?.setOnClickListener {
            // Pindah ke halaman Konfirmasi / Sukses Pesanan
            val intent = Intent(this, ConfirmationActivity::class.java)
            startActivity(intent)
        }

        // Navigasi ke Home
        navHome?.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }

        // Navigasi ke Order (Sedang di halaman Order)
        navOrder?.setOnClickListener {
            // Sudah di halaman Order
        }

        // Navigasi ke Profile
        navProfile?.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}