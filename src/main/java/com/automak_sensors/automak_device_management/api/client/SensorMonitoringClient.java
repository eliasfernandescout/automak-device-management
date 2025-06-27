package com.automak_sensors.automak_device_management.api.client;

public interface SensorMonitoringClient {
    void enableMonitoring(String sensorId);
    void disableMonitoring(String sensorId);

}
