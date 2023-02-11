package com.exercise.weatherreport.listener;

import com.exercise.weatherreport.dto.WeatherInfoDto;
import com.exercise.weatherreport.event.WeatherReportEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;


/**
 * @description: 气象发布监听
 * @author: Jonathan
 * @createDate: 2023/02/11
 */
@Component
@Slf4j
public class WeatherReportListener {

    /**
     * 气象站1监听气象发布事件
     */
    @EventListener
    public void weatherStation1(WeatherReportEvent event) {
        WeatherInfoDto infoDto = event.getWeatherInfoDto();
        log.info("气象站1监听到气象发布事件 --> 温度:{} 湿度:{} 压力:{}", infoDto.getTemperature(),infoDto.getHumidity(),infoDto.getPressure());
    }

    /**
     * 气象站2监听气象发布事件
     */
    @EventListener
    public void weatherStation2(WeatherReportEvent event) {
        WeatherInfoDto infoDto = event.getWeatherInfoDto();
        log.info("气象站2监听到气象发布事件 --> 温度:{} 湿度:{} 压力:{}", infoDto.getTemperature(),infoDto.getHumidity(),infoDto.getPressure());
    }

    /**
     * 气象站3监听气象发布事件
     */
    @EventListener
    public void weatherStation3(WeatherReportEvent event) {
        WeatherInfoDto infoDto = event.getWeatherInfoDto();
        log.info("气象站3监听到气象发布事件 --> 温度:{} 湿度:{} 压力:{}", infoDto.getTemperature(),infoDto.getHumidity(),infoDto.getPressure());
    }
}
