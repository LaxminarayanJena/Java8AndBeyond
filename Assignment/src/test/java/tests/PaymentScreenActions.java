package tests;

import java.util.function.Consumer;

import org.testng.Assert;

import pages.PaymentScreenPage;

public class PaymentScreenActions {
	
	public static final Consumer<PaymentScreenPage> freeCoupon =(p) ->p.applyPromocode("FREEUDEMY");
	public static final Consumer<PaymentScreenPage> discountedCoupon =(p) ->p.applyPromocode("PARTIALUDEMY");
	public static final Consumer<PaymentScreenPage> validCC =(p) ->p.enterCC("4111111111111111", "2022", "123");
	public static final Consumer<PaymentScreenPage> invalidCC =(p) ->p.enterCC("411111111100111", "2022", "123");
	public static final Consumer<PaymentScreenPage> buy =(p) ->p.buyProduct();
	
	//validations
	public static final Consumer<PaymentScreenPage> sucessfulPurchase =(p) ->Assert.assertEquals(p.getStatus(), "PASS");
	public static final Consumer<PaymentScreenPage> failedPurchase =(p) ->Assert.assertEquals(p.getStatus(), "FAIL");

}
