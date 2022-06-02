package com.example.myclassroom;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Teacherhome extends AppCompatActivity {


    GridView gridinjava;
    String arrayofmenuname[] = {
            "My Courses",
            "Notifications",
            "Calender"
    };
    int images[] = {
            R.drawable.classapp,
            R.drawable.ic_notifications_black_24dp,
            R.drawable.calender_24dp,
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacherhome);
        getSupportActionBar().hide();
        Bundle bundle = getIntent().getExtras();
        String text= bundle.getString("name");
        Toast.makeText(this, "Welcome "+text, Toast.LENGTH_SHORT).show();

        gridinjava = (GridView) findViewById(R.id.gridhometeacher);

        GridAdaptor gridAdaptor = new GridAdaptor(Teacherhome.this, arrayofmenuname, images);
        gridinjava.setAdapter(gridAdaptor);
        gridinjava.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0){
                    Intent intentforfindyourtrain = new Intent(getBaseContext(),MyCourse.class);
                    startActivity(intentforfindyourtrain);
                }
                if (position == 1){
                    Intent intentforfindyourtrain = new Intent(getBaseContext(),Notifications.class);
                    startActivity(intentforfindyourtrain);
                }
                if (position == 2){
                    Intent intentforfindyourtrain = new Intent(getBaseContext(),Calender.class);
                    startActivity(intentforfindyourtrain);
                }

            }

        });


    }
}
