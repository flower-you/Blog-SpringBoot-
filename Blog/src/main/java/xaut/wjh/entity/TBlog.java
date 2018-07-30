package xaut.wjh.entity;

import java.util.Date;

public class TBlog {
    private Integer id;

    private Integer kid;

    private Integer uid;

    private String title;

    private String blogschema;

    private Integer clicks;

    private Date datetime;

    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getKid() {
        return kid;
    }

    public void setKid(Integer kid) {
        this.kid = kid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public String getBlogschema() {
		return blogschema;
	}

	public void setBlogschema(String blogschema) {
		this.blogschema = blogschema;
	}

	public Integer getClicks() {
        return clicks;
    }

    public void setClicks(Integer clicks) {
        this.clicks = clicks;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

	@Override
	public String toString() {
		return "TBlog [id=" + id + ", kid=" + kid + ", uid=" + uid + ", title=" + title + ", clicks=" + clicks
				+ ", datetime=" + datetime + "]";
	}
    
    
}