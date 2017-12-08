package logic;

import dataaccess.IDataAccessFacade;
import dataaccess.temporary.FacadeDataAccess;
import logic.entity.Shift;

import java.time.LocalDateTime;
import java.util.List;

public class Controller {
    private IDataAccessFacade dataAccessFacade;
    public Controller() {
        dataAccessFacade = new FacadeDataAccess();
    }

    public Shift createShift(int employeeId, LocalDateTime start, LocalDateTime end) {
        return dataAccessFacade.createShift(employeeId, start, end);
    }

    public List<Shift> getShifts() {
        return dataAccessFacade.getShifts();
    }
}
