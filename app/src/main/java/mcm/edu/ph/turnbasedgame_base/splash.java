package mcm.edu.ph.turnbasedgame_base;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class splash extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Button slash = findViewById(R.id.slash);


        slash.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {

        Intent i = new Intent(splash.this, MainActivity.class);

        startActivity(i);




        switch (v.getId()) {
            case R.id.slash:
                startActivity(i);


                break;

        }
    }
}

