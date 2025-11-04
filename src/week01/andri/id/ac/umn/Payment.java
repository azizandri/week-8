package week01.andri.id.ac.umn;

public abstract class Payment {
	protected boolean isPaidOff;
	protected Item item;
	
	public Payment() {
		this.isPaidOff = false;
		this.item = null;
	}
	
	public Payment(Item item) {
		this.isPaidOff = false;
		this.item = item;
	}
	
	public boolean isPaidoff() {
		return isPaidOff;
	}
	
	public Item getItem() {
		return item;
	}
	
	public String getItemName() {
		return item.getName();
	}
	
	public String gerStatus() {
		if(isPaidOff) {
			return "FINISHED";
		}
		return "ON PROGRESS";
	}
	
	public int getRemainingAmount() {
		if(isPaidOff) {
			return 0;
		}
		return item.getPrice();
	}
}