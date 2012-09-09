package com.example.droppinmahbox;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import java.util.Date;


public class FileEntry extends Activity {
	
	private final String filename;
	private final Date postDate;
	private final String author;
	private final int icon;
	
	public FileEntry(final String filename, final String author, final Date postDate, final int icon){
		this.filename = filename;
		this.author = author;
		this.postDate = postDate;
		this.icon = icon;
	}
	
	
	public String getFilename() {
		return filename;
	}

	/**
	 * @return Author of file entry
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @return Post date of file entry
	 */
	public Date getPostDate() {
		return postDate;
	}

	/**
	 * @return Icon of this file entry
	 */
	public int getIcon() {
		return icon;
	}
}
