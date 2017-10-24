package com.dao;

import java.util.List;

import com.model.Friend;
import com.model.User;

public interface FriendDAO {

	List<User> listOfSuggestedUsers(String Username);
	void friendRequest(String fromUsername, String toUsername);
	List<Friend> listOfPendingRequest(String loggedInUsername);
	void updatePendingRequest(String fromId,String toId,char status);
	List<Friend> listOfFriends(String Username);
}