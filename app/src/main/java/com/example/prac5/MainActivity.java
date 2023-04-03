package com.example.prac5;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String[] places = {"Cape Town", "Jbay", "Durban"};
        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_main, R.id.travel, places));
    }

    protected void onListItemClick(ListView l, View v, int position, long id)
    {
        switch(position)
        {
            case 0:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Cape_Town")));
                break;
            case 1:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.jeffreysbaytourism.org")));
                break;
            case 2:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Durban")));
                break;
        }
    }
}