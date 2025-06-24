package com.automak_sensors.automak_device_management.common;

import io.hypersistence.tsid.TSID;

public class IdGenerator {
    public static TSID generateTSID() {
        return TSID.fast();
    }
}