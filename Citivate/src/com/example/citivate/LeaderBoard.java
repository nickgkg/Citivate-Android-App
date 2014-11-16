package com.example.citivate;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v4.widget.DrawerLayout.DrawerListener;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;


public class LeaderBoard extends Activity {
	private String[] titles;
    private DrawerLayout mDrawerLayout;
    private ListView mDrawerList;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.drawer);

        titles = new String[]{"Home","LeaderBoard","Options"};
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawerList = (ListView) findViewById(R.id.left_drawer);

        // Set the adapter for the list view
        mDrawerList.setAdapter(new ArrayAdapter<String>(this,
                R.layout.nav_item, titles));
        // Set the list's click listener
        mDrawerList.setOnItemClickListener(new DrawerItemClickListener());

        
        Fragment fragment = new MyFragment();
	    //Bundle args = new Bundle();
	    //args.putInt(Fragment.ARG_PLANET_NUMBER, position);
	    //fragment.setArguments(args);

	    // Insert the fragment by replacing any existing fragment
	    FragmentManager fragmentManager = getFragmentManager();
	    fragmentManager.beginTransaction()
	                   .replace(R.id.content_frame, fragment)
	                   .commit();
    }

	@Override
	protected void onPostCreate(Bundle savedInstanceState) {
		super.onPostCreate(savedInstanceState);
		((TextView)findViewById(R.id.points)).setText("760");
	    ((TextView)findViewById(R.id.rank)).setText("#241");
	}

	View.OnClickListener listener = new View.OnClickListener() {

		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			
		}
	};
	private class DrawerItemClickListener implements ListView.OnItemClickListener {
	    @Override
	    public void onItemClick(AdapterView parent, View view, int position, long id) {
	        selectItem(position);
	    }
	}

	/** Swaps fragments in the main content view */
	private void selectItem(int position){
	    // Create a new fragment and specify the planet to show based on position
		if(position==0){
			Intent intent = new Intent(this, Menu.class);
			startActivity(intent);
			finish();
		}else if(position==1){
			Intent intent = new Intent(this, LeaderBoard.class);
			startActivity(intent);
			finish();
		}else if(position==2){
			
		}
	}

	@Override
	public void setTitle(CharSequence title) {
	    //mTitle = title;
	    getActionBar().setTitle(title);
	}
}
