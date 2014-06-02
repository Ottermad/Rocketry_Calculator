public class center_of_pressure  {
	
	public double calculate (
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