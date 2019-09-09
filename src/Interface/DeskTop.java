package Interface;

public class DeskTop implements HardWare,SoftWare{
public void desktopModel() {
	System.out.println("Hp");



}

@Override
public void softwareResorses() {
	System.out.println("Soft");
	
}

@Override
public void hardwareResourses() {
	System.out.println("Hard");
}
public static void main(String[] args) {
	DeskTop d=new DeskTop();
	d.hardwareResourses();
	d.softwareResorses();
	d.desktopModel();
}
}
