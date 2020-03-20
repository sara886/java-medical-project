
package gait_analysis;
import java.util.*;
public class Gait_analysis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
System.out.println("please enter total distance in cm");
float d=input.nextFloat();
System.out.println("please enter number of steps");
	int step=input.nextInt();
	System.out.println("please enter number of strides");
	float stride=input.nextFloat();
	System.out.println("please enter total time in sec");
	float t=input.nextFloat();
	float step_length=d/step;
	float stride_length=d/stride;
	float step_time=t/step;
	float stride_time=t/stride;
	float cadence=step*60/t;
	float velocity=cadence*step_length;

	System.out.println("step length= "+step_length+" cm");
	System.out.println("stride length= "+stride_length+" cm");
	System.out.println("step time= "+step_time+" sec");
	System.out.println("stride time= "+stride_time+" sec");
	System.out.println("cadence= "+cadence+" step/min");
	System.out.println("velocity "+velocity+" cm/min");
	}
	
}


