package com.dao;

import com.model.ProfilePicture;

public interface ProfilePictureDAO {
	void saveProfilePicture(ProfilePicture profilePicture);
	ProfilePicture getProfilePicture(String username);
	
}