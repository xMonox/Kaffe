package logic.entity;

import java.util.Date;

public class News {
    private int id;
    private String header;
    private String body;
    private Date timestamp;
    private Employee author;

    public News(int id, String header, String body, Date timestamp, Employee author) {
        this.id = id;
        this.header = header;
        this.body = body;
        this.timestamp = timestamp;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public String getHeader() {
        return header;
    }

    public String getBody() {
        return body;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public Employee getAuthor() {
        return author;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public void setAuthor(Employee author) {
        this.author = author;
    }
}
