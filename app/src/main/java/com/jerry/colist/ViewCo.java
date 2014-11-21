package com.jerry.colist;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


public class ViewCo extends Activity {

    //Variable
    private Global g = Global.getInstance();
    private ArrayList <ListItem> arrayListViewCo = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_co);

        ListView listViewCo = (ListView) findViewById(R.id.lstViewComp);
        arrayListViewCo = new ArrayList<ListItem>();

        //ListItem listItemViewCo = (ListItem)getApplication();
        arrayListViewCo = g.getArrayListItem();
        final ListItemAdapter listItemAdapter = new ListItemAdapter(getBaseContext(), arrayListViewCo);
        listViewCo.setAdapter(listItemAdapter);
        //notify the adapter the list has changed with new data and any view reflecting the data set should refresh itself..
        listItemAdapter.notifyDataSetChanged();

        //set on click listeners
        listViewCo.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //show header of the item clicked on a toast
                Toast.makeText(getBaseContext(), arrayListViewCo.get(i).getCoName() + " pressed", Toast.LENGTH_SHORT).show();
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_view_co, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
