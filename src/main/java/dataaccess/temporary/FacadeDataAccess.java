package dataaccess.temporary;

import dataaccess.IDataAccessFacade;
import logic.entity.Employee;
import logic.entity.Role;
import logic.entity.Shift;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class FacadeDataAccess implements IDataAccessFacade {
    List<Shift> shifts;
    List<Employee> employees;
    List<Role> roles;
    int shiftId;

    public FacadeDataAccess() {
        this.shifts = new ArrayList<>();
        this.employees = new ArrayList<>();
        this.roles = new ArrayList<>();
        roles.add(new Role(0, "Manager", "Bestyrer"));
        roles.add(new Role(1, "Tjener", "En slave i skjorte"));
        roles.add(new Role(2, "Bartender", "Laver drinks"));

        Set<Role> managerRoles = new HashSet<>();
        managerRoles.add(roles.get(0));
        Set<Role> waiterRoles = new HashSet<>();
        waiterRoles.add(roles.get(1));
        Set<Role> bartenderRoles = new HashSet<>();
        bartenderRoles.add(roles.get(2));

        employees.add(new Employee(0, "manager@psbar.dk", "plain", "Julie", "BANG", "88888888", managerRoles));
        employees.add(new Employee(1, "waiter@psbar.dk", "plain", "Jesper", "Rudolf", "88888888", waiterRoles));
        employees.add(new Employee(2, "bartender@psbar.dk", "plain", "Svend", "B", "44448888", bartenderRoles));

        Shift shift1 = new Shift(0, LocalDateTime.now().withHour(15).withMinute(0), LocalDateTime.now().withHour(18).withMinute(0), employees.get(1));
        shiftId = 1;
    }


    @Override
    public Shift createShift(int employeeId, LocalDateTime start, LocalDateTime end) {
        shiftId++;
        Shift shift = new Shift(shiftId, start, end, getEmployeeById(employeeId));
        shifts.add(shift);
        return shift;
    }

    @Override
    public Shift editShift() {
        return null;
    }

    @Override
    public Shift getShift() {
        return null;
    }

    @Override
    public Employee createEmployee() {
        return null;
    }

    @Override
    public Employee editEmployee() {
        return null;
    }

    @Override
    public Employee getEmployeeById(int id) {
        for (Employee e : employees) {
            if (e.getId() == id) {
                return e;
            }
        }
        return null;
    }
}
