package services;

import models.ParkingSpot;
import models.SpotStatus;
import repositories.ParkingSpotRepository;

public class ParkingSpotService {
    private ParkingSpotRepository parkingSpotRepository = new ParkingSpotRepository();

    public void markSpotStatus(ParkingSpot spot, SpotStatus status){
        spot.setSpotStatus(status.FILLED);
        parkingSpotRepository.save(spot);
    }
}
