package com.automak_sensors.automak_device_management.common;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class IdGenerator {
    public static Long generateId() {
        LocalDateTime now = LocalDateTime.now();
        String idStr = now.format(DateTimeFormatter.ofPattern("yyyyMMddHHmmssSSS"))
                + String.format("%09d", now.getNano());
        return Long.parseLong(idStr);
    }
}