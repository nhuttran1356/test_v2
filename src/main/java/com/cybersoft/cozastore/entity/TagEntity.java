package com.cybersoft.cozastore.entity;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "Tag")
public class TagEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "tag")
    private Set<Blog_TagEntity> blog_tag;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Blog_TagEntity> getBlog_tag() {
        return blog_tag;
    }

    public void setBlog_tag(Set<Blog_TagEntity> blog_tag) {
        this.blog_tag = blog_tag;
    }
}
