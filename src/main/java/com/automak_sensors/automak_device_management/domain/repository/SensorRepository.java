package com.automak_sensors.automak_device_management.domain.repository;

import com.automak_sensors.automak_device_management.domain.model.Sensor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SensorRepository extends JpaRepository<Sensor, String> {
}

