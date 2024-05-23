package ru.gb.HW5.model;

import lombok.Builder;
import org.springframework.boot.context.properties.bind.DefaultValue;

public enum TaskStatus {
    HAS_NOT_STARTED, IN_PROGRESS, COMPLETED
}
