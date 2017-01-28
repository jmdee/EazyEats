package com.example.jerrydengu.eazyeats;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class RecyclerViewTest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view_test);
        RecyclerView recview ;
        recview = (RecyclerView)findViewById(R.id.cuisinerview);
        recview.setHasFixedSize(true);
        recview.setLayoutManager(new LinearLayoutManager(this));
        recview.setAdapter(new RecyclerAdapter());

    }
}
