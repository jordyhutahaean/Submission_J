package com.dicoding.picodiploma.submissionapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{
    private RecyclerView rvChara;
    private ArrayList<Chara> listchara = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        rvChara = findViewById(R.id.rv_charas);
        rvChara.setHasFixedSize(true);
        listchara.addAll(CharaData.getListData());
        showRecyclerList();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_about, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_about:
                Intent intent = new Intent(MainActivity.this, About.class);
                startActivity(intent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void showRecyclerList(){
        rvChara.setLayoutManager(new LinearLayoutManager(this));
        ListCharaAdapter ListCharaAdapter = new ListCharaAdapter(listchara);
        rvChara.setAdapter(ListCharaAdapter);
    }

}
