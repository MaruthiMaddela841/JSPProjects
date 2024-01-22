package in.ineuron.service;

import in.ineuron.dto.EmployeeDto;

public class SalaryDetailsGeneratorImpl implements SalaryDetailsGenerator {

	@Override
	public void generateSalaryDetails(EmployeeDto dto) {
		float gsal=dto.getBsal()+(dto.getBsal()*0.3f);
		float nsal=gsal-(dto.getBsal()*0.2f);
		
		dto.setGsal(gsal);
		dto.setNsal(nsal);
	}

}
