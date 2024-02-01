package lessonInterfaceSegregation;

import java.util.Date;
import java.util.List;

public class CustomerTransaction implements Accouting, Reporting {

  /*
  Interface Segregation - no clients should be forced to depends on methods they do not use

  fat class - class that have many responsbilities -> use interface to solve tightly coupling

  clients(Transaction Report Generator and Accounts Receivable) have a CustomerTransaction Object -> association relationship

  clients don't require all of the behavior the CustomerTransaction object

  when there is a change of method in CustomerTransaction, both clients need to recompiled and redeployed. even the 1 method
  is only used by one client. because client has a relationship with CustomerTransaction.

  use interface

  private Accouting transactionObject;


  */

  private List<Product> products;

  private Customer customer;

  public CustomerTransaction(Customer customer, List<Product> products) {
    this.customer = customer;
    this.products = products;

  }


  // method for reporting
  @Override
  public String getName() {
    return customer.getName();
  }

  @Override
  public Date getDate() {
    return new Date();
  }

  @Override
  public String productBreakDown() {
    String reportlisting = null;
    for(Product product: products) {
      reportlisting += product.getProductName();
    }
    return reportlisting;
  }

  // method for Account Receivable
  @Override
  public void prepareInvoice() {
    System.out.println("invoice prepared....");
  }

  @Override
  public void chargeCustomer() {
    System.out.println("changed the customer");
  }


}
