package br.com.caelum.goodbuy;

import java.util.ArrayList;
import java.util.List;

import br.com.caelum.vraptor.Resource;

@Resource
public class Mundo {
	
	public String boasVindas() {
		return "olá mundo!";
	}
	
	public List<String> paises(){
		List<String> result = new ArrayList<>();
	    result.add("Brasil");
	    result.add("Portugal");
	    result.add("Japão");
	    result.add("Canadá");
	    result.add("Paraguai");
	    return result;
	}

	
	public Integer soma() {
		int num1 = 3;
		int num2 = 2;
		Integer sum = num1 + num2;
		return sum;
	}
}
