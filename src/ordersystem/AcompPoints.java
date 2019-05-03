package ordersystem;

public abstract class AcompPoints implements ICompPoints{
	protected double points;
	
public AcompPoints(double points) {
		super();
		this.points = points;
	}

public abstract double getPoints();

}
