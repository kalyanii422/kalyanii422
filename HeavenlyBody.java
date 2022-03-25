package tasksCoreJava;

import java.util.HashSet;
import java.util.Set;

public class HeavenlyBody {
	
    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;

    public HeavenlyBody(String name, double orbitalPeriod) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public boolean addMoon(HeavenlyBody moon) {
        return this.satellites.add(moon);
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }

    
//    @Override
//    public boolean equals(Object obj){
//    	if(this == obj)
//            return true;
//    	if(obj == null || obj.getClass()!= this.getClass())
//            return false;
//    	HeavenlyBody obj1 = (HeavenlyBody) obj;
//    	//return (obj1.name.equals(this.name) && obj1.orbitalPeriod.equals(this.orbitalPeriod))
//    }
    

}
