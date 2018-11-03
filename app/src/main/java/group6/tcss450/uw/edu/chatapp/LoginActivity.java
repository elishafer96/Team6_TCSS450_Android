package group6.tcss450.uw.edu.chatapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import group6.tcss450.uw.edu.chatapp.utils.Credentials;

public class LoginActivity extends AppCompatActivity
        implements LoginFragment.OnFragmentInteractionListener{

//    Credentials mCredentials;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //TODO: this is just a temporary login option
//        Button b = findViewById(R.id.tmp_login_button);
//        b.setOnClickListener(v ->{
//            Credentials cred = new Credentials.Builder("test@test.com", "test123")
//                    .addUsername("Test UserName")
//                    .addFirstName("Firstname")
//                    .addLastName("Lastname")
//                    .build();
//            onLoginSuccess(cred);
//        });

        if (savedInstanceState == null) {
            if (findViewById(R.id.layout_acivitymain_container) != null) { // Good
                getSupportFragmentManager().beginTransaction()
                        .add(R.id.layout_acivitymain_container, new LoginFragment())
                        .commit();
            }
        }
    }

    public void onLoginSuccess(Credentials credentials) {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        intent.putExtra("credentials", credentials);
        startActivity(intent);
    }

    @Override
    public void onRegisterClicked() {
//        getSupportFragmentManager().beginTransaction()
//                        .replace(R.layout.fragment_login, new RegisterFragment())
//                        .commit();
    }
}
