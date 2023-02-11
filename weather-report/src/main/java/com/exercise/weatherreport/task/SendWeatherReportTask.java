package com.exercise.weatherreport.task;

import com.exercise.weatherreport.dto.WeatherInfoDto;
import com.exercise.weatherreport.event.WeatherReportEvent;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;


/**
 * @description: 天气预报定时任务
 * @author: Jonathan
 * @createDate: 2023/02/11
 */
@Component
public class SendWeatherReportTask {
    @Resource
    private ApplicationContext applicationContext;


    @Scheduled(cron = "0 0/1 * * * ?")
    public void executeWeatherReport() {
        //天气信息dto初始化
        WeatherInfoDto weatherInfoDto = WeatherInfoDto.builder()
                .temperature("23")
                .humidity("65")
                .pressure("30.4f")
                .build();
        //每分钟发布天气预报事件
        applicationContext.publishEvent(new WeatherReportEvent(this,weatherInfoDto));
    }
}
