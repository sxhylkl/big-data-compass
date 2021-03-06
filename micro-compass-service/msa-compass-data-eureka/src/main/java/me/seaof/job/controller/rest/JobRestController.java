package me.seaof.job.controller.rest;

import com.alibaba.fastjson.JSON;
import me.seaof.job.service.CompassDataService;
import me.seaof.job.vo.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Watter on 2018-03-01
 */
@RestController
@RequestMapping("/getData")
public class JobRestController {

    @Autowired
    private CompassDataService compassDataService;

    @GetMapping("/allJobNum")
    public String cityList(){
        try {
            return compassDataService.getDataByCity();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
