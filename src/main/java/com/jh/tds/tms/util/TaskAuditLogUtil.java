package com.jh.tds.tms.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jh.tds.tms.model.Task;

public class TaskAuditLogUtil {

    public static String convertUserToJson(Task task) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.writeValueAsString(task);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
