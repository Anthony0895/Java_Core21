package lgs;

public class Animal {
	@MyAnnotation(value = "Animal type")
	private String type;
	@MyAnnotation(value = "Animal country")
	private String country;
	@MyAnnotation(value = "Animal amount")
	private int amount;

	public Animal(String type, String country, int amount) {
		super();
		this.type = type;
		this.country = country;
		this.amount = amount;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Animal [type=" + type + ", country=" + country + ", amount=" + amount + "]";
	}

}
