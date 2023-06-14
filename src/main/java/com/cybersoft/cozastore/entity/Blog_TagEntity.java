package com.cybersoft.cozastore.entity;

import javax.persistence.*;

@Entity(name = "Blog_Tag")
public class Blog_TagEntity {
    @Id
    @ManyToOne
    @JoinColumn(name = "BlogID")
    private BlogEntity blog;
    @Id
    @ManyToOne
    @JoinColumn(name = "tagID")
    private TagEntity tag;


}
