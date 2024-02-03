package lessonOOPDObserver.observers;

import lessonOOPDObserver.domain.Employee;

public interface IObserver {

  public void callMe(Employee emp, String msg);

}
