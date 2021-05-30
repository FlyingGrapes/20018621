package sg.edu.rp.c346.day4.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class DetailsAcivity extends AppCompatActivity {

    TextView tvInfo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_acivity);

        tvInfo = findViewById(R.id.info);
        registerForContextMenu(tvInfo);

        Intent intentReceived = getIntent();
        int rank = intentReceived.getIntExtra("ranking", 0);
        tvInfo.setText("Ranking in Singapore: " + rank);
        String location = intentReceived.getStringExtra("location");
        tvInfo.setText("Ranking in Singapore: " + rank + "\nDirections: " + location);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.add(0, 0, 0, "Zoom in");
        menu.add(0, 1, 1, "Zoom out");

    }

    //context menu selection
    @Override
    public boolean onContextItemSelected(MenuItem item) {

//        int wordSize = 10;
//        if (item.getItemId() == 0) {
//            wordSize = wordSize + 5;
//        }else if(item.getItemId()==1){
//            wordSize = wordSize - 5;
//        }
//        tvInfo.setTextSize(wordSize);

        int defaults = 14;
        int minus = -5;
        int plus = +5;
        if (item.getItemId()==0){
            tvInfo.setTextSize(defaults + plus);
        }else if (item.getItemId()==1){
            tvInfo.setTextSize(defaults + minus);
        }

        return super.onOptionsItemSelected(item);


//        return super.onContextItemSelected(item);
    }


}