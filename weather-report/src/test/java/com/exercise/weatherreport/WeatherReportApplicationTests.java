package com.exercise.weatherreport;

import com.exercise.weatherreport.dto.WeatherInfoDto;
import com.exercise.weatherreport.event.WeatherReportEvent;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import javax.annotation.Resource;

@SpringBootTest
class WeatherReportApplicationTests {
    @Resource
    private ApplicationContext applicationContext;

    @Test
    void testWeatherReport() {
        //天气信息dto初始化
        WeatherInfoDto weatherInfoDto = WeatherInfoDto.builder()
                .temperature("23")
                .humidity("65")
                .pressure("30.4f")
                .build();
        //发布天气预报事件
        applicationContext.publishEvent(new WeatherReportEvent(this,weatherInfoDto));
    }

}
