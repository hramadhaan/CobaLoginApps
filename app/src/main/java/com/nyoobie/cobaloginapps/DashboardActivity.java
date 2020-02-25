package com.nyoobie.cobaloginapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DashboardActivity extends AppCompatActivity {

    private TextView dari, ke;
    private Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        dari = findViewById(R.id.dashboard_asalkota);
        ke = findViewById(R.id.dashboard_kekota);
        submit = findViewById(R.id.dashboard_submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent maps = new Intent(DashboardActivity.this, MapsActivity.class);
                maps.putExtra("DARI", dari.getText().toString());
                maps.putExtra("KE", ke.getText().toString());
                maps.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(maps);
            }
        });
    }
}
