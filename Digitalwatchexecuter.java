class Digitalwatchexecuter
{
	public static void main(String[] args)
	{
		double price = Digitalwatch.getPrice();
		System.out.println(price);
		String brand = Digitalwatch.getBrand();
		System.out.println(brand);
		String Case = Digitalwatch.getCaseDiameter();
		System.out.println(Case);
		String bandcolour = Digitalwatch.getBandColour();
		System.out.println(bandcolour);
		String bandtype = Digitalwatch.getBandMaterialType();
		System.out.println(bandtype);
		String warranty = Digitalwatch.getWarrantyType();
		System.out.println(warranty);
		String watchmovement = Digitalwatch.getWatchMovementType();
		System.out.println(watchmovement);
		String weight = Digitalwatch.getItemWeight();
		System.out.println(weight);
		String origin = Digitalwatch.getCountryOfOrigin();
		System.out.println(origin);
	}
}