package com.heraizen.cj.day6.iterator;

public class UserList implements MyIterator {
	private String[] name = new String[10];
		{
			name = new String[] { "pravas", "puspok", "Badal", "Manu", "Subash", "Muna", "Lucy", "Lucky", "Anu", "Kutu" };
	
		}
	
		private UserList() {
	
		}
	
		int check = 0;
	
		@Override
		public boolean hasNext() {
			return check < name.length;
		}
	
		@Override
		public String next() {
			return name[check++];
		}
	
		public static MyIterator getIterator() {
			return new UserList();
		}
}

