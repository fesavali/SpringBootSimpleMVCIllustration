package com.savali;

import java.util.ArrayList;
import java.util.List;

public class FriendDao {

    public static List<Friend> friends;
	{
		friends = new ArrayList<>();
		friends.add(new Friend(1, "Anthony Omollo", "Anto", "active", "10 years"));
		friends.add(new Friend(2, "Victor Munyi", "Vic", "active", "2 year"));
		friends.add(new Friend(301, "Cleophas ngumbau", "Madmau", "active", "5 years"));
	}
    
    public static List getFriends() {
		return friends;
	}

    public static Friend getfriendById(Integer id) {

		for (Friend rafiki : friends) {
			if (rafiki.getId().equals(id)) {
				return rafiki;
			}
		}
		return null;
	}
}
