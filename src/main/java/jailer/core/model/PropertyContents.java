package jailer.core.model;

public class PropertyContents {
	private String value;
	private boolean hide;
	
	public PropertyContents(){}
	
	public PropertyContents(String value, boolean hide) {
		super();
		this.value = value;
		this.hide = hide;
	}
	
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public boolean isHide() {
		return hide;
	}
	public void setHide(boolean hide) {
		this.hide = hide;
	}

	@Override
	public String toString() {
		return "PropertyContents [value=" + value + ", hide=" + hide + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (hide ? 1231 : 1237);
		result = prime * result + ((value == null) ? 0 : value.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PropertyContents other = (PropertyContents) obj;
		if (hide != other.hide)
			return false;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}
}
