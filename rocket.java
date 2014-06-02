import java.lang.Math;

public class rocket {

	

	public static void main(String[] args) {
		
		// Declare and Assign Variables for CP
		double ln = 12.5; // Nosecone length
		double d = 5.54; // diameter at base of nose
		double df = 0; // diameter at front of transition
		double dr = 0; // diameter at rear of transition
		double lt = 0; // length of transition
		double xp = 0; // distance from tip of nose to front of transition
		double cr = 10; // fin root chord
		double ct = 0; // fin tip chord
		double s = 5.25; // fin semispan
		double lf = 6.5; // length of fin midchord line
		double r = 2.77; // radius of body at aft end
		double xr = 9; // distance between fin root leading edge and fin tip leading edge parallel to body
		double xb = 27; // distance from nose tip to fin root chord leading edge 
		double n = 3; // number of fins
		String nose_type = "Ogive"; // Nosecone type

		// Declare and Assign Variables for CG

		double nose_mass = 10;
		double nose_ref = 27.25;

		double trans_mass = 10;
		double trans_ref = 10;

		double recov_mass = 2;
		double recov_ref = 15;

		double body_mass = 2;
		double body_ref = 11;

		double fin_mass = 5;
		double fin_ref = 2;

		double motor_mass = 5;
		double motor_ref = 0;

		double[] mass = {nose_mass, trans_mass, recov_mass, body_mass, fin_mass, motor_mass};
		double[] ref = {nose_ref, trans_ref, recov_ref, body_ref, fin_ref, motor_ref};

		double cop = calculate_cp(ln, d, df, dr, lt, xp, cr, ct, s, lf, r, xr, xb, n, nose_type);
		double cog = calculate_cg(mass, ref);

		
	}	

	public static double calculate_cg (
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

	public static double calculate_cp (
			double ln, double d, double df, double dr, double lt, double xp, double cr, 
			double ct, double s, double lf, double r, double xr, double xb, double n, String nose_type) {

			// Nose Cone
				double cnn = 2;
				double xn = 0;

				if (nose_type == "Cone") {

					// Cone
					xn = 0.666 * ln;

				}

				else {

					// Ogive
					xn = 0.466 * ln;

				}
				System.out.println(xn);
				
				

			// Transition
				/*double cnt = 2 * (
					(
						(dr/d) * (dr/d)
					) 
					- 
					(
						(df/d) * (df/d)
					)
				);

				double xt = xp + (
					(
						lt / 3
					)
					*
					(
						1 + (

								(1- (df/dr)) / (1 - ((df/dr)*(df/dr)))

							)
					)
				);*/

			// Fins

				/*double cnf = (
					1 
					+ 
					(
						r / (s + r)
					)
					* 
					(
						(
							4 * n * (( s / d ) * ( s / d ))
						)
						/ 
						(
						1 * Math.sqrt(
										1 + (
											(2*lf) / (cr + ct) * ( 2 * lf ) / (cr + ct)
											)
										)
									)
					)
				);*/

				double cnf = (1+r/(s+r))*(4*n*(s/d)*(s/d)/(1+Math.sqrt(1+((2*lf/(cr+ct)) * (2*lf/(cr+ct))))));

				System.out.println(cnf);

				/*double xf = xb + (
									(xr/3) * 
									((cr + (2 * ct)) / (cr + ct))
									+
									1/6 * (
										(cr + ct) - ((cr*ct)/(cr*ct))
										)
								);*/
				double xf = xb + (xr / 3) * (
			(cr + (2 * ct)) / (cr + ct)
		)

		+ (
			(1/6) * (
					(cr + ct) - ((cr * ct) / (cr + ct))
			)
		);

		System.out.println(xf);
				
			// Center of Pressure

				//double cnr = cnn + cnt + cnf;

				//double x = ((cnn * xn) + (cnt * xt) + (cnf * xf)) / cnr;
				double cnr = cnn + cnf;
				System.out.println(cnr);
				double x = ((cnn * xn) + (cnf * xf)) / cnr;
				return x;
	}
	
}