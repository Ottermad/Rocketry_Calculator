Rocketry Calculator
===================

This is a project that aims to create a program calculate the stability of rockets. It uses the Barrowmen Eqautions to calculate the Center of Pressure (CoP or CP) and a seperate equation to calculate the Center of Gravity (CoG or CG).

Center of Pressure
------------------

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

Nose Cone Terms

(CN)N = 2 
For Cone: XN = 0.666LN 
For Ogive: XN = 0.466LN

Conical Transition Terms

<img src="http://my.execpc.com/~culp/rockets/coniceqn.gif">

Fin Terms

<img src="http://my.execpc.com/~culp/rockets/fineqn.gif">

Finding the Center of Pressure

Sum up coefficients: (CN)R = (CN)N + (CN)T + (CN)F

Find CP Distance from Nose Tip:

<img src="http://my.execpc.com/~culp/rockets/cpeqn.gif">

