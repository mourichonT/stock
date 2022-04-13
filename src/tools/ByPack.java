package tools;

import java.util.Date;

public class ByPack {

	private int orderBuyRef;
	private String quantityBuying;
	private float UnitCost;
	private Date BuyingDate;

	public ByPack(int orderBuyRef, String quantityBuying, float unitCost, Date buyingDate) {
		super();
		this.orderBuyRef = orderBuyRef;
		this.quantityBuying = quantityBuying;
		UnitCost = unitCost;
		BuyingDate = buyingDate;
	}

	public int getOrderBuyRef() {
		return orderBuyRef;
	}

	public void setOrderBuyRef(int orderBuyRef) {
		this.orderBuyRef = orderBuyRef;
	}

	public String getQuantityBuying() {
		return quantityBuying;
	}

	public void setQuantityBuying(String quantityBuying) {
		this.quantityBuying = quantityBuying;
	}

	public float getUnitCost() {
		return UnitCost;
	}

	public void setUnitCost(float unitCost) {
		UnitCost = unitCost;
	}

	public Date getBuyingDate() {
		return BuyingDate;
	}

	public void setBuyingDate(Date buyingDate) {
		BuyingDate = buyingDate;
	}
	
	
	
	
}
