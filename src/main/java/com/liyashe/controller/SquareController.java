package com.liyashe.controller;

import com.liyashe.common.utils.AjaxObject;
import com.liyashe.domain.Feed;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by yfxx on 2018/2/27.
 */
@RestController
@RequestMapping("/api/square")
public class SquareController extends AbstractController{


    @RequestMapping(value = "/feedList",method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> getSquareFeedList(@RequestParam(value="start") String start,
                                                @RequestParam(value="size") String size,
                                                @RequestParam(value="userId") String userId,
                                                @RequestParam(value="type") String type){
        Map<String,Object> result = new HashMap<>();
        //chuliguo
        List<Feed> feedList = new ArrayList<Feed>();
        result.put("code",200);
        result.put("message","success");
        result.put("data",feedList);
        return result;
    }
    /*public Map<String,Object> getSquareFeedList(HttpServletRequest request, HttpServletResponse response){
        String start = request.getParameter("start");
        Map<String,Object> result = new HashMap<>();
        result.put("code",200);
        return result;
    }*/
}
