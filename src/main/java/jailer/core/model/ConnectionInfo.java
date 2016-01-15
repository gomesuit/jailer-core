package jailer.core.model;

import java.util.Date;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class ConnectionInfo {
	private String host;
	private String ipAddress;
	private Date sinceConnectTime;
	private String driverName;
	private String connectUrl;
	private boolean hide;
	private Map<String, PropertyContents> propertyList;
	private Map<String, String> optionalParam;
	private boolean warning = false;
	
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public Date getSinceConnectTime() {
		return sinceConnectTime;
	}
	public void setSinceConnectTime(Date sinceConnectTime) {
		this.sinceConnectTime = sinceConnectTime;
	}
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public String getConnectUrl() {
		return connectUrl;
	}
	public void setConnectUrl(String connectUrl) {
		this.connectUrl = connectUrl;
	}
	public boolean isHide() {
		return hide;
	}
	public void setHide(boolean hide) {
		this.hide = hide;
	}
	public Map<String, PropertyContents> getPropertyList() {
		return propertyList;
	}
	public void setPropertyList(Map<String, PropertyContents> propertyList) {
		this.propertyList = propertyList;
	}
	public String getIpAddress() {
		return ipAddress;
	}
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	public Map<String, String> getOptionalParam() {
		return optionalParam;
	}
	public void setOptionalParam(Map<String, String> optionalParam) {
		this.optionalParam = optionalParam;
	}
	public boolean isWarning() {
		return warning;
	}
	public void setWarning(boolean warning) {
		this.warning = warning;
	}
	
	@Override
	public String toString() {
		return "ConnectionInfo [host=" + host + ", ipAddress=" + ipAddress
				+ ", sinceConnectTime=" + sinceConnectTime + ", driverName="
				+ driverName + ", connectUrl=" + connectUrl
				+ ", optionalParam=" + optionalParam + ", warning=" + warning
				+ "]";
	}
}
