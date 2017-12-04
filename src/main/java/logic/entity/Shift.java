package logic.entity;

import java.time.LocalDateTime;
import java.util.Date;

public class Shift {
    private int id;
    private LocalDateTime start;
    private LocalDateTime end;
    private Employee employee;

    public Shift(int id, LocalDateTime start, LocalDateTime end, Employee employee) {
        this.id = id;
        this.start = start;
        this.end = end;
        this.employee = employee;
    }

    public int getId() {
        return id;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public LocalDateTime getEnd() {
        return end;
    }

    public Employee getEmployee() {
        return employee;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public void setEnd(LocalDateTime end) {
        this.end = end;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString(){
        return "BrugerID: " + employee.getId() + "\nNavn: " + employee.getFirstName() + " " + employee.getLastName() + "\n" + employee.getRoles().iterator().next().getTitle();
    }
}
