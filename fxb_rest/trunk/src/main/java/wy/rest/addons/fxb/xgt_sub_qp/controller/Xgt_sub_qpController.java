package wy.rest.addons.fxb.xgt_sub_qp.controller;

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
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.Date;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;
import wy.core.util.DateUtil;
import com.alibaba.fastjson.JSON;
import net.sf.json.JSONObject;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.PathVariable;
import wy.rest.addons.fxb.xgt_sub_qp.dao.Xgt_sub_qpDao;
import wy.rest.addons.fxb.xgt_sub_qp.dao.Xgt_sub_qpMapper;
import wy.rest.addons.fxb.xgt_sub_qp.model.Xgt_sub_qp;
import wy.rest.config.properties.XydProperties;


/**
 * 题目控制器
 *
 * @author wyFrame
 * @Date 2018-09-05 16:40:06
 */
@Controller
@RequestMapping("/xgt_sub_qp")
public class Xgt_sub_qpController extends BaseController {

    private String PREFIX = "/addons/fxb/xgt_sub_qp/";
	@Resource
    Xgt_sub_qpDao xgt_sub_qpDao;
	
	@Resource
    Xgt_sub_qpMapper xgt_sub_qpMapper;

	@Resource
    XydProperties xydProperties;
	
    /**
     * 跳转到题目首页
     */
    @RequestMapping("")
    public String index(Model model) {
        return PREFIX + "xgt_sub_qp.html";
    }





    /**
     * 删除题目
     */
    @RequestMapping(value = "/delete")
    @ResponseBody
    public Object delete(@RequestParam String xgt_sub_qpIds) {
        //物理删除
    	//this.xgt_sub_qpMapper.deleteById(xgt_sub_qpId);
    	//逻辑删除
    	  String[] split =xgt_sub_qpIds.split(",");
          Integer[] iarray = new Integer[split.length];
          for(int i=0;i<split.length;i++){
              iarray[i]=Integer.parseInt(split[i]);
           }
          List<Integer> list = Arrays.asList(iarray);
    	this.xgt_sub_qpDao.deleteByIds(list);
        return SUCCESS_TIP;
    }

        @RequestMapping("/bulidJson")
        @ResponseBody
        public JSONObject buildJson(HttpServletResponse response, @RequestParam(required = false) String condition, @RequestParam(required = false) Integer id) {
            if (null==id){
                id=0;
            }
            List list=xgt_sub_qpDao.list4(condition,id);
            Map<String,Object> map = new HashMap<String,Object>();
            map.put("data",list);
            String json= JSON.toJSONString(map);
            System.out.println(json);
            JSONObject jsStr = JSONObject.fromObject(json);
            System.err.println(jsStr);
            return jsStr;
        }

         @RequestMapping(value = "/shangji")
            @ResponseBody
            public JSONObject shangji(){
                List list=xgt_sub_qpDao.getMapByPar();
                Map<String,Object> map = new HashMap<String,Object>();
                map.put("data",list);
                String json= JSON.toJSONString(map);
                System.out.println(json);
                JSONObject shangji = JSONObject.fromObject(json);
                System.err.println(shangji);
                return shangji;
            }
    //拿到单选题题目
    @RequestMapping(value = "/getDanxuan")
    @ResponseBody
    public Object getDanxuan(@RequestParam Integer subexamId){
        List<Map<String, Object>>DanList=this.xgt_sub_qpDao.getDanxuan(subexamId);
        return  DanList;
    }
    //拿到完型题目
    @RequestMapping(value = "/getWanxing")
    @ResponseBody
    public Object getWanxing(@RequestParam Integer subexamId){
        List<Map<String, Object>>WanxingList=this.xgt_sub_qpDao.getWanxing(subexamId);
        return  WanxingList;
    }

    //拿到阅读理解题目
    @RequestMapping(value = "/getYuedu")
    @ResponseBody
    public Object getYuedu(@RequestParam Integer subexamId){
        List<Map<String, Object>>YueduList=this.xgt_sub_qpDao.getYuedu(subexamId);
        return  YueduList;
    }

    //拿到任务型阅读题目
    @RequestMapping(value = "/getRenwu")
    @ResponseBody
    public Object getRenwu(@RequestParam Integer subexamId){
        List<Map<String, Object>>RenwuList=this.xgt_sub_qpDao.getRenwu(subexamId);

        return  RenwuList;
    }
}
