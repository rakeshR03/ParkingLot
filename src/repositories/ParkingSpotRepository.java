package repositories;

import models.ParkingSpot;
import models.SpotStatus;
import models.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class ParkingSpotRepository {
    List<ParkingSpot> parkingSpots = new ArrayList<>();

    public ParkingSpot save(ParkingSpot spot){
        parkingSpots.add(spot);
        return spot;
    }

    public ParkingSpot findOneByVehicleTypeAndStatusAvailable(VehicleType type){
        for(ParkingSpot spot : parkingSpots){
            if(spot.getSpotStatus() == SpotStatus.AVAILABLE && spot.getVehicleType() == type){
                return spot;
            }
        }
        return null;
    }

    public ParkingSpot getSpot(Integer spotId){
        for(ParkingSpot spot: parkingSpots){
            if(spot.getSpotId() == spotId){
                return spot;
            }
        }
        throw new RuntimeException();
    }
}
