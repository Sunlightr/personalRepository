package com.exercise.weatherreport.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

/**
 * @description: 气象发布信息
 * @author: Jonathan
 * @createDate: 2023/02/11
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ApiModel(value = "气象发布信息")
public class WeatherInfoDto {

    /**
     * 温度
     */
    @ApiModelProperty(name = "温度")
    private String temperature;

    /**
     * 湿度
     */
    @ApiModelProperty(name = "湿度")
    private String humidity;

    /**
     * 压力
     */
    @ApiModelProperty(name = "压力")
    private String pressure;

}
