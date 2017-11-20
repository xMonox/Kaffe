package logic.entity;

import java.util.Date;

public class Shift {
    private int id;
    private Date start;
    private Date end;
    private Employee employee;

    public Shift(int id, Date start, Date end, Employee employee) {
        this.id = id;
        this.start = start;
        this.end = end;
        this.employee = employee;
    }

    public int getId() {
        return id;
    }

    public Date getStart() {
        return start;
    }

    public Date getEnd() {
        return end;
    }

    public Employee getEmployee() {
        return employee;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
