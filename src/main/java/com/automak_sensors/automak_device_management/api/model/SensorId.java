package com.automak_sensors.automak_device_management.api.model;

import io.hypersistence.tsid.TSID;
import jakarta.persistence.Embeddable;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Embeddable
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class SensorId implements Serializable {
    private TSID id;

    public SensorId(TSID id) {
        Objects.requireNonNull(id);
        this.id = id;
    }

    public SensorId(Long id) {
        Objects.requireNonNull(id);
        this.id = TSID.from(id);
    }

    public SensorId(String id) {
        Objects.requireNonNull(id);
        this.id = TSID.from(id);
    }

    @Override
    public String toString() {
        return id.toString();
    }


}
