package in.ineuron.dto;

import java.io.Serializable;

public class EmployeeDto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Integer eno;
	private String ename;
	private Integer bsal;
	private float gsal;
	private float nsal;
	
	static {
		System.out.println("Employee .class file is loading..");
	}
	
	public EmployeeDto() {
		System.out.println("Zero Constructor...");
	}

	public Integer getEno() {
		return eno;
	}

	public void setEno(Integer eno) {
		this.eno = eno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Integer getBsal() {
		return bsal;
	}

	public void setBsal(Integer bsal) {
		this.bsal = bsal;
	}

	public float getGsal() {
		return gsal;
	}

	public void setGsal(float gsal) {
		this.gsal = gsal;
	}

	public float getNsal() {
		return nsal;
	}

	public void setNsal(float nsal) {
		this.nsal = nsal;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
}
