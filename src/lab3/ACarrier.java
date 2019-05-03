package lab3;

import java.util.List;

public abstract class ACarrier implements Icarrier {
List<Package> packages;

 abstract public double getPrice(Package pack);

public List<Package> getPackages() {
	return packages;
}
public void addPackage(Package pack) {
	packages.add(pack);
}
public void setPackages(List<Package> packages) {
	this.packages = packages;
}


}
