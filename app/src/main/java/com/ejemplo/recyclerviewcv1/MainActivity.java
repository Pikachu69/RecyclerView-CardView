package com.ejemplo.recyclerviewcv1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ProductAdapter adapter;

    List<DataProvider> productList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        productList = new ArrayList<>();

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Aquí va la adición de elementos a la lista
        productList.add(
                new DataProvider("Rock", "Top", 4.3,R.drawable.imagen1)
        );
        productList.add(
                new DataProvider("Classic", "Most Played", 4.3,R.drawable.imagen2)
        );
        productList.add(
                new DataProvider("Hip-Hop", "Urban", 4.3,R.drawable.imagen3)
        );
        productList.add(
                new DataProvider("Symphony", "Bethoven", 4.3,R.drawable.imagen4)
        );

        adapter = new ProductAdapter(this,productList);
        recyclerView.setAdapter(adapter);





    }
}
