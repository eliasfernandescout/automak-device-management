package com.automak_sensors.automak_device_management.api.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SensorOutput {
    private Long id;
    private String name;
    private String ip;
    private String location;
    private String protocol;
    private String model;
    private Boolean enabled;
}
