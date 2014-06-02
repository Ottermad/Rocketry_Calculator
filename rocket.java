import java.lang.Math;
import center_of_gravity.java;
import center_of_pressure.java;

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

		double nose_mass = 0;
		double nose_ref = 0;

		double recov_mass = 0;
		double recov_ref = 0;

		double body_mass = 0;
		double body_ref = 0;

		double fin_mass = 0;
		double fin_ref = 0;

		double motor_mass = 0;
		double motor_ref = 0;

		double[] mass = {nose_mass, recov_mass, body_mass, fin_mass, motor_mass};
		double[] ref = {nose_ref, recov_ref, body_ref, fin_ref, motor_ref};

		double cop = center_of_pressure.calculate(ln, d, df, dr, lt, xp, cr, ct, s, lf, r, xr, xb, n, nose_type);
		double cog = center_of_gravity.calculate(mass, ref);
	}
	
}