package services;

import models.ParkingSpot;
import models.VehicleType;
import repositories.ParkingSpotRepository;

public class SpotAllocationService {
    private ParkingSpotRepository parkingSpotRepository = new ParkingSpotRepository();

    public ParkingSpot allocateSpot(VehicleType type){
        return parkingSpotRepository.findOneByVehicleTypeAndStatusAvailable(type);
    }
}
