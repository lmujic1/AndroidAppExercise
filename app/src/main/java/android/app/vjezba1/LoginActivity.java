package android.app.vjezba1;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    private EditText username;
    private EditText password;
    private Button btnLogin;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

        username = findViewById(R.id.ed_username);
        password = findViewById(R.id.ed_password);
        btnLogin = findViewById(R.id.btn_login);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strUnsername = username.getText().toString();

                //explicit intent
                Intent intent = new Intent(LoginActivity.this, WelcomeActivity.class);
                intent.putExtra("Username", strUnsername);
                startActivity(intent);
            }
        });
    }
}
