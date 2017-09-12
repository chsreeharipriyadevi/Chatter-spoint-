package com.model;

public class Friend {

	private int UserID,FriendID;
	private String Status;
	public int getUserID() {
		return UserID;
	}
	public void setUserID(int userID) {
		UserID = userID;
	}
	public int getFriendID() {
		return FriendID;
	}
	public void setFriendID(int friendID) {
		FriendID = friendID;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
}
