package com.automak_sensors.automak_device_management.api.controller;

import com.automak_sensors.automak_device_management.api.model.SensorId;
import com.automak_sensors.automak_device_management.api.model.SensorInput;
import com.automak_sensors.automak_device_management.common.IdGenerator;
import com.automak_sensors.automak_device_management.domain.model.Sensor;
import com.automak_sensors.automak_device_management.domain.repository.SensorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/sensors")
@RequiredArgsConstructor
public class SensorController {

    private final SensorRepository sensorRepository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Sensor createSensor(@RequestBody SensorInput input) {
        Sensor sensor = Sensor.builder()
                .id(new SensorId(IdGenerator.generateTSID()))
                .name(input.getName())
                .ip(input.getIp())
                .location(input.getLocation())
                .protocol(input.getProtocol())
                .model(input.getModel())
                .enabled(false)
                .build();

        return  sensorRepository.saveAndFlush(sensor);

    }


}
