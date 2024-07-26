import org.testng.annotations.Test;

public class CreateOrder {
@Test
public void CreateOrder() {
	System.out.println("execute CreateOrder");
}
@Test(dependsOnMethods = "CreateOrder")
public void BillingOrder() {
	System.out.println("execute CreateOrder");
	System.out.println("execute BillingOrder");
}
}

