package mkyoung.com;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
 
import mkyoung.com.Order;
import mkyoung.com.OrderBo;
import mkyoung.com.OrderNotFoundException;
import mkyoung.com.OrderSaveException;
import mkyoung.com.OrderUpdateException;
 
public class TestCheckedException 
{
 
  OrderBo orderBo;
  Order data;
 
  @BeforeTest
  void setup() {
	orderBo = new OrderBo();
 
	data = new Order();
	data.setId(1);
	data.setCreatedBy("mkyong");
  }
 
  @Test(expectedExceptions = OrderSaveException.class)
  public void throwIfOrderIsNull() throws OrderSaveException {
	orderBo.save(null);
  }
 
  /*
   * Example : Multiple expected exceptions
   * Test is success if either of the exception is thrown
   */
  @Test(expectedExceptions = { OrderUpdateException.class, OrderNotFoundException.class })
  public void throwIfOrderIsNotExists() throws OrderUpdateException, OrderNotFoundException {
	orderBo.update(data);
  }
 
}