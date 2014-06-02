public static class center_of_gravity {
	
	public double calculate (
			 double[] mass, double[] reference) {

			double sub_total = 0;
			double weight = 0;
			double total = 0;

			for (int i = 0; i < mass.length; i++) {

				double sub_weight = mass[i] * 980;

				sub_total = sub_total + (weight * reference[i]);

				weight = weight + sub_weight;
			}

			total = sub_total / weight;

			return total;
	}
}