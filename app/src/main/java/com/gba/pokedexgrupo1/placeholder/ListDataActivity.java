package com.gba.pokedexgrupo1.placeholder;

import android.database.Cursor;
import android.os.Bundle;
import android.Support.annotation.Nullable;
import android.util.Log;
import android.widget.ListView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ListDataActivity extends AppCompatActivity {

    private static final String TAG = "ListDataActivity";
    DatabaseHelper mDatabaseHelper;
    private ListView mListView;

    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(SavedInstanceState);
        setContentView(R.layout.List_Layout);
        mDatabaseHelper = new DatabaseHelper(this);
        
        pokemonListView();
    }

    private void pokemonListView() {
        Log.d(TAG, "populateListView: Displaying data in the ListView.");
        Cursor data = mDatabaseHelper.getData();
        ArrayList<String> listData = new ArrayList<>();
        while(data.moveToNext()){

        }

    }
}
