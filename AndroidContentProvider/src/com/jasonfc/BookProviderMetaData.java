package com.jasonfc;

import android.net.Uri;
import android.provider.BaseColumns;

public class BookProviderMetaData {

	public static final String AUTHPRITY = "com.jasonfc.BookProvider";
	public static final String DATABASE_NAME = "book.db";
	public static final int DATABASE_VERSION = 1;
	public static final String BOOKS_TABLE_NAME = "books";

	private BookProviderMetaData() {
	}

	// inner class describling BookTable
	public static final class BookTableMetaData implements BaseColumns {

		private BookTableMetaData() {
		};

		public static final String TABLE_NAME = "books";
		public static final Uri CONTEBT_URI = Uri.parse("content://" + AUTHPRITY + "/books");
		public static final String CONTENT_TYPE = "vnd.android.cursor.dir/vnd/androidbook.book";
		public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/vnd/androidbook.book";
		public static final String DEFAULT_SORT_ORDER = "modified DESC";

		// additional columns start here
		public static final String BOOK_NAME = "name";
		public static final String BOOK_ISBN = "isbn";
		public static final String BOOK_AUTHOR = "author";
		public static final String CREATE_DATE = "created";
		public static final String MODIFIED_DATE = "nodified";

	}

}
