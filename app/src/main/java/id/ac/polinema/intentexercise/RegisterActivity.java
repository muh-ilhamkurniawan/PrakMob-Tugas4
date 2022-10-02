package id.ac.polinema.intentexercise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    private EditText fullnameInput;
    private EditText emailInput;
    private EditText homeInput;
    private EditText aboutInput;
    private Button LoginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        fullnameInput = findViewById(R.id.text_fullname);
        emailInput = findViewById(R.id.text_email);
        homeInput = findViewById(R.id.text_homepage);
        aboutInput = findViewById(R.id.text_about);
        LoginBtn = findViewById(R.id.button_ok);

        LoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(RegisterActivity.this, ProfileActivity.class);
                intent.putExtra("fullname",fullnameInput.getText().toString());
                intent.putExtra("email",emailInput.getText().toString());
                intent.putExtra("home",homeInput.getText().toString());
                intent.putExtra("about",aboutInput.getText().toString());

                startActivity(intent);
            }
        });

    }
}
