package dataaccess;

import logic.entity.Employee;
import logic.entity.Shift;

import java.time.LocalDateTime;

public interface IDataAccessFacade {
    Shift createShift(int employeeId, LocalDateTime start, LocalDateTime end);
    Shift editShift();
    Shift getShift();
    Employee createEmployee();
    Employee editEmployee();
    Employee getEmployeeById(int id);
}
