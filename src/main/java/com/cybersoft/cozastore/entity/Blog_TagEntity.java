package com.cybersoft.cozastore.entity;

import com.cybersoft.cozastore.entity.ids.Blog_TagIds;

import javax.persistence.*;

@Entity(name = "Blog_Tag")
public class Blog_TagEntity {
    @EmbeddedId
    private Blog_TagIds blogTagIds;
    @ManyToOne
    @JoinColumn(name = "tagID", insertable = false,updatable = false)
    private TagEntity tag;

    @ManyToOne
    @JoinColumn(name = "BlogID", insertable = false,updatable = false)
    private BlogEntity blog;

    public Blog_TagIds getBlogTagIds() {
        return blogTagIds;
    }

    public void setBlogTagIds(Blog_TagIds blogTagIds) {
        this.blogTagIds = blogTagIds;
    }

    public TagEntity getTag() {
        return tag;
    }

    public void setTag(TagEntity tag) {
        this.tag = tag;
    }

    public BlogEntity getBlog() {
        return blog;
    }

    public void setBlog(BlogEntity blog) {
        this.blog = blog;
    }
}
