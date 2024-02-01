package lessonInterfaceSegregation;

public class AccountsReceivable {

  private Accouting transactionObject;

  public AccountsReceivable(Accouting aTransaction) {
    transactionObject = aTransaction;
  }

  public void postPayment() {
    transactionObject.chargeCustomer();
  }

  public void sendInvoice() {
    transactionObject.prepareInvoice();
    // send the invoice
  }


}
