package in.surjitsingh.recyclerviewandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import in.surjitsingh.recyclerviewandroid.gridrecyclerview.GridRVActivity;
import in.surjitsingh.recyclerviewandroid.json.JSONRVActivity;
import in.surjitsingh.recyclerviewandroid.linearrecyclerview.LinearRVActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.linearRVButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, LinearRVActivity.class));
            }
        });

        findViewById(R.id.gridRVButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, GridRVActivity.class));
            }
        });


        findViewById(R.id.jsonButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, JSONRVActivity.class));
            }
        });
    }
}
