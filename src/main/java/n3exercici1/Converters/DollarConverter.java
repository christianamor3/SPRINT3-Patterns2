package n3exercici1.Converters;

public class DollarConverter implements MoneyConverter{

	private final float typeConverter = 1.09f;
	private final String name = "Dollar";
	
	@Override
	public String getName() {
		return name;
	}


	@Override
	public float converter(float quantity) {
		return quantity * typeConverter;
		
	}
}
