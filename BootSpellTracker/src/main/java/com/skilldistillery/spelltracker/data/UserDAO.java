package com.skilldistillery.spelltracker.data;

import com.skilldistillery.spelltracker.entities.User;

public interface UserDAO {
	User authenticateUser(String username, String password);
}
