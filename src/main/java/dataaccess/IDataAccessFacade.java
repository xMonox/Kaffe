package dataaccess;

import logic.entity.Employee;
import logic.entity.Shift;

import java.time.LocalDateTime;
import java.util.List;

public interface IDataAccessFacade {
    Shift createShift(int employeeId, LocalDateTime start, LocalDateTime end);
    Shift editShift();
    Shift getShift();
    List<Shift> getShifts();
    Employee createEmployee();
    Employee editEmployee();
    Employee getEmployeeById(int id);
}
