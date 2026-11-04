package lat.pam.kopidannyemil

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        val btnToRegister = findViewById<Button>(R.id.btnToRegister)
        val btnToLogin = findViewById<Button>(R.id.btnToLogin)

        btnToRegister.setOnClickListener {
            // Tambahkan .java di sini
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }

        btnToLogin.setOnClickListener {
            // Tambahkan .java di sini
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}