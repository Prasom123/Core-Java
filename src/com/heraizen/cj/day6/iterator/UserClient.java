package com.heraizen.cj.day6.iterator;
public class UserClient {
	public static void main(String[] args) {

		MyIterator a = UserList.getIterator();
		while (a.hasNext()) {
			System.out.println(a.next());

		}
	}

}