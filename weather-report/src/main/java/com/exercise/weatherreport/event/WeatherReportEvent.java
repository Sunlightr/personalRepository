package com.exercise.weatherreport.event;

import com.exercise.weatherreport.dto.WeatherInfoDto;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

/**
 * @description: 气象发布事件信息
 * @author: Jonathan
 * @createDate: 2023/02/11
 */
@Getter
public class WeatherReportEvent extends ApplicationEvent {
    /**
     * 气象发布信息
     */
    private WeatherInfoDto weatherInfoDto;


    public WeatherReportEvent(Object source) {
        super(source);
    }

    public WeatherReportEvent(Object source, WeatherInfoDto weatherInfoDto) {
        super(source);
        this.weatherInfoDto = weatherInfoDto;
    }
}
