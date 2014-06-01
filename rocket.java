import java.lang.Math;

public class rocket {

	

	public static void main(String[] args) {
		
		// Declare and Assign Variables for CP
		double ln = 5; // Nosecone length
		double d = 2.5; // diameter at base of nose
		double df = 2.4; // diameter at front of transition
		double dr = 2.4; // diameter at rear of transition
		double lt = 0; // length of transition
		double xp = 0; // distance from tip of nose to front of transition
		double cr = 4; // fin root chord
		double ct = 2; // fin tip chord
		double s = 2; // fin semispan
		double lf = 2; // length of fin midchord line
		double r = 1.2; // radius of body at aft end
		double xr = 1; // distance between fin root leading edge and fin tip leading edge parallel to body
		double xb = 25.5; // distance from nose tip to fin root chord leading edge 
		double n = 4; // number of fins
		String nose_type = "Ogive"; // Nosecone type

		// Declare and Assign Variables for CG

		double nose_weight = 0;
		double nose_ref = 0;


	


	}

	public double cp (
		double ln, double d, double df, double dr, double lt, double xp, double cr, 
		double ct, double s, double lf, double r, double xr, double xb, double n, String nose_type) {

		// Nose Cone
			double cnn = 2;

			if (nose_type == "Cone") {

				// Cone
				double xn = 0.666 * ln;

			}

			else {

				// Ogive
				double xn = 0.466 * ln;

			}
			
			

		// Transition
			double cnt = 2 * (
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
			);

		// Fins

			double cnf = (
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
			);

			double xf = xb + (
								(xr/3) * 
								((cr + (2 * ct)) / (cr + ct))
								+
								1/6 * (
									(cr + ct) - ((cr*ct)/(cr*ct))
									)
							);

		// Center of Pressure

			double cnr = cnn + cnt + cnf;

			double x = ((cnn * xn) + (cnt * xt) + (cnf * xf)) / cnr;

			return x;
	}
}