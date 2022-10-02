package id.ac.polinema.intentexercise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class ProfileActivity extends AppCompatActivity {

    private TextView fullname;
    private TextView email;
    private TextView home;
    private TextView about;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        fullname = findViewById(R.id.label_fullname);
        email = findViewById(R.id.label_email);
        home = findViewById(R.id.label_homepage);
        about = findViewById(R.id.label_about);

        Bundle extras = getIntent().getExtras();
        if (extras != null){
            fullname.setText(extras.getString("fullname"));
            email.setText(extras.getString("email"));
            home.setText(extras.getString("home"));
            about.setText(extras.getString("about"));
        }
        else {
            Toast.makeText(this, "Intent is missing", Toast.LENGTH_SHORT).show();
        }
    }

    public void handlHome (View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://muh-ilhamkurniawan.github.io/portofolio/"));
        startActivity(browserIntent);
    }
}
