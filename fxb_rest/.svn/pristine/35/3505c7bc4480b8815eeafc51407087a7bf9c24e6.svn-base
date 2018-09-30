package wy.rest.addons.fxb.xgt_sub_task_dtl.dao;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
/**
 * 任务详情Dao
 *
 * @author wyFrame
 * @Date 2018-09-05 15:20:52
 */
public interface Xgt_sub_task_dtlDao {
	List<Map<String, Object>> list(@Param("condition") String condition, @Param("st_id") Integer st_id);

    List<Map<String, Object>> getMap1();
    List<Map<String, Object>> getMap9();

      void deleteByIds(@Param("list") List<Integer> list);

    List<Map<String, Object>>Danxuanlist(@Param("Id")Integer Id,@Param("myDate")String myDate);

    List<Map<String, Object>>Wanxinglist(@Param("Id")Integer Id,@Param("myDate")String myDate);


    List<Map<String, Object>>Yuedulist(@Param("Id")Integer Id,@Param("myDate")String myDate);

    String selectRightAsk(@Param("sub_qp_id")Integer sub_qp_id);

    int selectCpnId(@Param("userid")Integer userid);

    List<Map<String, Object>>Dananlist(@Param("sub_qp_id")Integer sub_qp_id);

    List<Map<String, Object>>XuanZeError(@Param("userId")Integer userId);

    List<Map<String, Object>>PanDuanError(@Param("userId")Integer userId);

    void updateOverStId(@Param("userid")Integer userid,@Param("taskobjId")Integer taskobjId);

    List<Map<String, Object>>selectZuotiList(@Param("task_id")Integer task_id,@Param("cpn_dept_id")Integer cpn_dept_id);

    List<Map<String, Object>>historyDanxuan(@Param("Id")Integer Id,@Param("task_id")Integer task_id);
}
