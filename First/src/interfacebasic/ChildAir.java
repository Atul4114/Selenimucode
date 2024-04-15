package interfacebasic;

import DemoPackage.Experiment;

public class ChildAir extends ParentAir{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildAir d = new ChildAir();
		d.bodycolor();
		d.engine();
		d.safety();
	//	ParentAir f =new ParentAir(); Abstarct class not able to create object.
		Experiment demo = new Experiment();
		demo.test();
		System.out.println(demo.j);

	}

	@Override
	public void bodycolor() {
		// TODO Auto-generated method stub
		System.out.println("blue colour");
	}

}
