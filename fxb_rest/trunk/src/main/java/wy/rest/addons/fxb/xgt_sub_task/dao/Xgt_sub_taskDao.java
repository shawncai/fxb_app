package wy.rest.addons.fxb.xgt_sub_task.dao;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
/**
 * 作业任务Dao
 *
 * @author wyFrame
 * @Date 2018-09-05 11:51:57
 */
public interface Xgt_sub_taskDao {
	List<Map<String, Object>> list(@Param("condition") String condition, @Param("st_id") Integer st_id);


    List<Map<String, Object>> getMap2();
    List<Map<String, Object>> getMap3();
    List<Map<String, Object>> getMap4();

      void deleteByIds(@Param("list") List<Integer> list);

    List<Map<String, Object>>getTaskName(@Param("taskid")Integer taskid);

    List<Map<String, Object>>getTaskName2(@Param("Id")Integer Id);

    List<Map<String, Object>>HistoryWork(@Param("Id")Integer Id);

    List<Map<String, Object>>FindClass();

    List<Map<String, Object>>CompleteMission(@Param("cpn_dept_id") Integer cpn_dept_id);
}
