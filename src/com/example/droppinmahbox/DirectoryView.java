package com.example.droppinmahbox;

import java.util.*;

import 

import android.os.Bundle;
import android.app.Activity;
import android.app.ListActivity;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.view.Menu;
import android.widget.ListView;


public class DirectoryView extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_directory_view);
        
     // Setup the list view
        final ListView newsEntryListView = (ListView) findViewById(R.id.list);
        final FileEntryAdapter newsEntryAdapter = new FileEntryAdapter(this, R.layout.activity_file_entry);
        newsEntryListView.setAdapter(newsEntryAdapter);
        
        // Populate the list, through the adapter
        for(final FileEntry entry : getFileEntries()) {
        	newsEntryAdapter.add(entry);
        }
    }
    
    private List<FileEntry> getFileEntries() {
    	
    	// Let's setup some test data.
    	// Normally this would come from some asynchronous fetch into a data source
    	// such as a sqlite database, or an HTTP request
    	
    	
    	
    	final List<FileEntry> entries = new ArrayList<FileEntry>();
    	
    	for(int i = 1; i < 50; i++) {
    		entries.add(
	    		new FileEntry(
	    				"Test Entry " + i,
	    				"Anonymous Author " + i,
	    				new GregorianCalendar(2011, 11, i).getTime(),
	    				i % 2 == 0 ? R.drawable.news_icon_1 : R.drawable.news_icon_2
	    		)
	    	);
    	}
    	
    	return entries;
    }
    
}
