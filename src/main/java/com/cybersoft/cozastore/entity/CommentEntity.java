package com.cybersoft.cozastore.entity;

import javax.persistence.*;

@Entity(name = "Comment")
public class CommentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String ID;
    @Column(name = "content")
    private String content;
    @Column(name = "email")
    private String email;
    @Column(name = "name")
    private String name;
    @Column(name = "websize")
    private String websize;

    @ManyToOne
    @JoinColumn(name = "BlogID")
    private BlogEntity blog;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWebsize() {
        return websize;
    }

    public void setWebsize(String websize) {
        this.websize = websize;
    }

    public BlogEntity getBlog() {
        return blog;
    }

    public void setBlog(BlogEntity blog) {
        this.blog = blog;
    }
}
