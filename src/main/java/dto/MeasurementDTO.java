package dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MeasurementDTO {
    private Double temperature;
    private Boolean raining;
    private SensorDTO sensor;
}
