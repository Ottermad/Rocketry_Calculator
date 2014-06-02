<h1>Rocketry Calculator</h1>

This is a project that aims to create a program calculate the stability of rockets. It uses the Barrowmen Eqautions to calculate the Center of Pressure (CoP or CP) and a seperate equation to calculate the Center of Gravity (CoG or CG).

<h2>Center of Pressure</h2>

To calculate the CoP I am using the Barrowmen Equations which are detailed here [link](http://my.execpc.com/~culp/rockets/Barrowman.html) and below:

<img src="http://my.execpc.com/~culp/rockets/coniceqn.gif">

LN	=	length of nose
d	=	diameter at base of nose
dF	=	diameter at front of transition
dR	=	diameter at rear of transition
LT	=	length of transition
XP	=	distance from tip of nose to front of transition
CR	=	fin root chord
CT	=	fin tip chord
S	=	fin semispan
LF	=	length of fin mid-chord line
R	=	radius of body at aft end
XR	=	distance between fin root leading edge and fin tip leading edge parallel to body
XB	=	distance from nose tip to fin root chord leading edge
N	=	number of fins

<h3>Nose Cone Terms</h3>

(CN)N = 2 <\n>
For Cone: XN = 0.666LN 
For Ogive: XN = 0.466LN

<h3>Conical Transition Terms</h3>

<img src="http://my.execpc.com/~culp/rockets/coniceqn.gif">

<h3>Fin Terms</h3>

<img src="http://my.execpc.com/~culp/rockets/fineqn.gif">

<h3>Finding the Center of Pressure</h3>

Sum up coefficients: (CN)R = (CN)N + (CN)T + (CN)F

<h4>Find CP Distance from Nose Tip:</h4>

<img src="http://my.execpc.com/~culp/rockets/cpeqn.gif">

