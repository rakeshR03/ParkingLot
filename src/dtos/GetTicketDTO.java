package dtos;

import lombok.Builder;
import lombok.Getter;
import models.VehicleType;

import java.time.LocalDateTime;

@Getter
@Builder
public class GetTicketDTO {
    private VehicleType type;
    private LocalDateTime entryTime;
}

//data transfer object (DTO)
// not all method in getTicket will be mentioned here.
// there might be some data that you don't want to expose to user(privacy) for that we use DTO.
