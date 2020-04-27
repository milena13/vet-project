package com.vetproject;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name = "OWNER")
public class Owner {

    String name;
    int ownerId;
    String email;
    String telephoneNumber;

    Owner() {

    }
}
