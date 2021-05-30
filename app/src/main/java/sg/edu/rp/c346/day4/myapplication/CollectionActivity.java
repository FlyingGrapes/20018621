package sg.edu.rp.c346.day4.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.View;
import android.widget.TextView;

public class CollectionActivity extends AppCompatActivity {
    TextView tvNtu, tvNus, tvSit, tvSuss, tvSutd, tvSmu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collection);

        tvNtu = findViewById(R.id.ntu);
        tvNus = findViewById(R.id.nus);


        tvNtu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CollectionActivity.this, DetailsAcivity.class);
                intent.putExtra("ranking", 2);
                intent.putExtra("location", "Boon Lay MRT");
                startActivity(intent);
            }
        });

        tvNus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CollectionActivity.this, DetailsAcivity.class);
                intent.putExtra("location", "Kent Ridge MRT");
                intent.putExtra("ranking", 1);
                startActivity(intent);
            }
        });

        tvSit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CollectionActivity.this, DetailsAcivity.class);
                intent.putExtra("location", "One-North MRT");
                intent.putExtra("ranking", 5);
                startActivity(intent);
            }
        });

        tvSmu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CollectionActivity.this, DetailsAcivity.class);
                intent.putExtra("location", "Bras Basah MRT");
                intent.putExtra("ranking", 3);
                startActivity(intent);
            }
        });

        tvSuss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CollectionActivity.this, DetailsAcivity.class);
                intent.putExtra("location", "Clementi MRT");
                intent.putExtra("ranking", 6);
                startActivity(intent);
            }
        });

        tvSutd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CollectionActivity.this, DetailsAcivity.class);
                intent.putExtra("location", "Expo MRT");
                intent.putExtra("ranking", 4);
                startActivity(intent);
            }
        });

    }

}