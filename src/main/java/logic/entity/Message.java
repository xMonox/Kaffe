package logic.entity;

public class Message {
    private int id;
    private Employee sender;
    private Employee receiver;
    private String subject;
    private String message;

    public Message(int id, Employee sender, Employee receiver, String subject, String message) {
        this.id = id;
        this.sender = sender;
        this.receiver = receiver;
        this.subject = subject;
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public Employee getSender() {
        return sender;
    }

    public Employee getReceiver() {
        return receiver;
    }

    public String getSubject() {
        return subject;
    }

    public String getMessage() {
        return message;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSender(Employee sender) {
        this.sender = sender;
    }

    public void setReceiver(Employee receiver) {
        this.receiver = receiver;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
