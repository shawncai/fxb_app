package wy.rest.addons.fxb.xgt_sub_task.controller;

import wy.core.base.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;
import java.util.ArrayList;
import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.io.IOException;
import java.io.BufferedInputStream;
import java.io.OutputStream;
import java.io.File;
import java.util.Arrays;
import com.alibaba.fastjson.JSON;
import wy.core.util.DateUtil;
import java.io.FileInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.Date;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;
import wy.core.util.DateUtil;
import com.alibaba.fastjson.JSON;
import net.sf.json.JSONObject;

import org.springframework.web.bind.annotation.PathVariable;
import wy.rest.addons.fxb.xgt_sub_task.dao.Xgt_sub_taskDao;
import wy.rest.addons.fxb.xgt_sub_task.dao.Xgt_sub_taskMapper;
import wy.rest.config.properties.XydProperties;


/**
 * 作业任务控制器
 *
 * @author wyFrame
 * @Date 2018-09-05 11:51:57
 */
@Controller
@RequestMapping("/xgt_sub_task")
public class Xgt_sub_taskController extends BaseController {

    private String PREFIX = "/addons/fxb/xgt_sub_task/";
	@Resource
    Xgt_sub_taskDao xgt_sub_taskDao;
	
	@Resource
    Xgt_sub_taskMapper xgt_sub_taskMapper;

	@Resource
    XydProperties xydProperties;

    @RequestMapping(value = "/getId")
    @ResponseBody
    public Object getTask(HttpServletRequest HttpServletRequest){
        String taskIds =  HttpServletRequest.getParameter("taskId");
        System.err.println("tak"+taskIds);
        String[] taskIdstr = taskIds.split(",");
        List<Map<String, Object>> abc = null;
        for(String i:taskIdstr){
            Integer taskid=Integer.parseInt(i);
            List<Map<String, Object>>getTask=this.xgt_sub_taskDao.getTaskName(taskid);
            System.err.println(i);
            abc.addAll(getTask);
        }
        return  abc;
    }

    //学生待完成作业
    @RequestMapping(value = "/getIds")
    @ResponseBody
    public Object getTaskName(@RequestParam Integer Id){
        List<Map<String, Object>>getTask=this.xgt_sub_taskDao.getTaskName2(Id);
        System.err.println(getTask);
        return  getTask;
    }

    //学生历史作业
    @RequestMapping(value = "/HistoryWork")
    @ResponseBody
    public Object HistoryWork(@RequestParam Integer Id){
        List<Map<String, Object>>historyWork=this.xgt_sub_taskDao.HistoryWork(Id);
        System.err.println(historyWork);
        return  historyWork;
    }

    /**
     * 返回给前台高三部的班级名称
     */
    @RequestMapping(value = "/FindClass")
    @ResponseBody
    public Object FindClass() {
        List<Map<String, Object>>classlist=this.xgt_sub_taskDao.FindClass();
        return classlist;
    }

    //进入班级后作业完成状况，完成人数，未完成人数按作业创建时间进行排序
    @RequestMapping(value = "/CompleteMission")
    @ResponseBody
    public Object CompleteMission(@RequestParam Integer cpn_dept_id){
        List<Map<String, Object>>completelist=this.xgt_sub_taskDao.CompleteMission(cpn_dept_id);
        return  completelist;
    }
}
