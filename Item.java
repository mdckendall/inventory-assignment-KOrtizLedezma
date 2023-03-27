class Item{
  private String name;
  private String serialNumber;
  private int value;

  public Item(String name, String serialNumber, int value){
    this.name = name;
    this.serialNumber = serialNumber;
    this.value = value;
  }
  
  public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

  public String toString() {
		return name + "," + serialNumber + "," + value;
	}
}