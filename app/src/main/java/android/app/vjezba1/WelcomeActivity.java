package android.app.vjezba1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {
    private TextView txt_welcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        String strUsername = getIntent().getStringExtra("Username");
        txt_welcome = findViewById(R.id.txt_welcome);

        txt_welcome.setText("Welcome " + strUsername);
    }
}
