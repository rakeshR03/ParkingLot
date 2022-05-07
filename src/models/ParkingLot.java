package models;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ParkingLot extends BaseModel{
    private String address;
    private List<ParkingFloor> floors = new ArrayList<>();
    private List<EntryGate> entryGates = new ArrayList<>();
    private List<ExitGate> exitGates = new ArrayList<>();
}
