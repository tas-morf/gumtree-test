package com.gumtree.android.test.controller.activity;

import com.gumtree.android.test.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MainActivity extends Activity implements AdapterView.OnItemClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView mainList = (ListView) findViewById(R.id.main_list);
        mainList.setOnItemClickListener(this);
        mainList.setAdapter(ArrayAdapter.createFromResource(this,
                R.array.navigation_items,
                android.R.layout.simple_list_item_1));
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        startActivity(AdDetailsActivity.getAdDetailsIntent(this, position));
    }
}
