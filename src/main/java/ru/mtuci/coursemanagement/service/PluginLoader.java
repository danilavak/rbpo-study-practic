package ru.mtuci.coursemanagement.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class PluginLoader {
    public void tryLoad() {
        log.info("Runtime loading of external plugins is disabled");
    }
}
