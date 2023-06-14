package com.cybersoft.cozastore.entity.ids;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class Blog_TagIds implements Serializable {
    @Column(name = "BlogID")
    private int blogId;
    @Column(name = "tagID")
    private int tagId;

    public Blog_TagIds() {
    }

    public Blog_TagIds(int blogId, int tagId) {
        this.blogId = blogId;
        this.tagId = tagId;
    }

    public int getBlogId() {
        return blogId;
    }

    public void setBlogId(int blogId) {
        this.blogId = blogId;
    }

    public int getTagId() {
        return tagId;
    }

    public void setTagId(int tagId) {
        this.tagId = tagId;
    }
}
