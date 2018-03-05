package com.liyashe.controller;

import com.liyashe.common.utils.AjaxObject;
import com.liyashe.domain.Feed;
import com.liyashe.service.FeedService;
import com.liyashe.service.impl.FeedServiceImpl;
import javafx.beans.binding.ObjectExpression;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    FeedService feedService;

    @RequestMapping(value = "/feedList",method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> getSquareFeedList(@RequestParam(value="start") Integer start, @RequestParam(value="size") Integer size,
                                                @RequestParam(value="userId") Long userId, @RequestParam(value="type") Integer type){
        Map<String,Object> result = new HashMap<>();
        //chuliguo
        List<Map<String,Object>> feedList = feedService.getSquareFeedList(start,size,userId,type);
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
