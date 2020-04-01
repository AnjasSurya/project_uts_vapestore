package com.example.projectuts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.projectuts.Adapter.VapeAdapter;
import com.example.projectuts.Model.Choice;

import java.util.ArrayList;
import java.util.List;

public class DaftarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);
        RecyclerView teamsView = findViewById(R.id.recyclerView);

        List<Choice> teams = new ArrayList<>();
        teams.add(new Choice("https://i2.wp.com/versedvaper.com/wp-content/uploads/2018/10/Foxy-8.jpg?resize=500%2C500&ssl=1", "Augvape Druga Foxy", "MOD SYSTEM", 650000));
        teams.add(new Choice("https://www.evolutionvaping.co.uk/media/catalog/product/cache/1/image/9df78eab33525d08d6e5fb8d27136e95/a/e/aegis_x_mod_gunmetal_camo.jpg","Geekvape Aeigust X", "MOD SYSTEM", 700000));

        VapeAdapter adapter = new VapeAdapter(this, teams);
        teamsView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        teamsView.setLayoutManager(layoutManager);
    }
}
