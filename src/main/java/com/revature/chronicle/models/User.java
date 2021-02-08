package com.revature.chronicle.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Represents a user of Chronicle
 * -NOTE- may change depending on progress
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	@Id
	@Column(name = "user_id")
    private String userID;

    private String name;
    
    private String email;

    private boolean admin;
}
