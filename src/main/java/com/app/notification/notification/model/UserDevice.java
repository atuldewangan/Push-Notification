package com.app.notification.notification.model;

import lombok.Data;

/**
 * Entity for User-Device Relation
 *
 * */
@Data
public class UserDevice {
    int id;
    int userId;
    int deviceId;
}
