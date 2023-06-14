package com.cybersoft.cozastore.entity;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "Blog")
public class BlogEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    @Column(name = "content")
    private String content;
    @Column(name = "image")
    private String image;
    @Column(name = "title")
    private String title;
    @ManyToOne
    @JoinColumn(name = "UserID")
    private UsersEntity users;

    @OneToMany(mappedBy = "blog")
    private Set<CommentEntity> comment;

    @OneToMany(mappedBy = "blog")
    private Set<Blog_TagEntity> blogTag;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public UsersEntity getUsers() {
        return users;
    }

    public void setUsers(UsersEntity users) {
        this.users = users;
    }

    public Set<CommentEntity> getComment() {
        return comment;
    }

    public void setComment(Set<CommentEntity> comment) {
        this.comment = comment;
    }

    public Set<Blog_TagEntity> getBlogTag() {
        return blogTag;
    }

    public void setBlogTag(Set<Blog_TagEntity> blogTag) {
        this.blogTag = blogTag;
    }
}
