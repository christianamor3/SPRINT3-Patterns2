package n3exercici1.Converters;

public class YenConverter implements MoneyConverter{

	private final float typeConverter = 160.77f;
	private final String name = "Yen";

	@Override
	public String getName() {
		return name;
	}


	@Override
	public float converter(float quantity) {
		return quantity * typeConverter;
		
	}
}
