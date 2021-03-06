package wy.rest.addons.fxb.xgt_sub_task_obj.model;

import com.baomidou.mybatisplus.annotations.TableId;
import java.util.Date;
import java.sql.Timestamp;
import com.baomidou.mybatisplus.enums.IdType;
/**
 * 作业对象Model
 *
 * @author wyFrame
 * @Date 2018-09-05 15:45:21
 */
 public class Xgt_sub_task_obj {

    private static final long serialVersionUID = 1L;

	@TableId(value="task_obj_id", type= IdType.AUTO)
	private Integer task_obj_id;
	private Integer task_id;
	private Integer over_id;
	private String accept_dt;
	private String over_dt;
	private Integer over_st_id;
	private Integer right_num;
	private Integer error_num;
	private String mdi_dt;
	private String cre_dt;
	private Integer cpn_id;
	private Integer st_id;

	public Integer getTask_obj_id() {
		return task_obj_id;
	}

	public void setTask_obj_id(Integer task_obj_id) {
		this.task_obj_id = task_obj_id;
	}
	public Integer getTask_id() {
		return task_id;
	}

	public void setTask_id(Integer task_id) {
		this.task_id = task_id;
	}

	public Integer getOver_id() {
		return over_id;
	}

	public void setOver_id(Integer over_id) {
		this.over_id = over_id;
	}

	public String getAccept_dt() {
		return accept_dt;
	}

	public void setAccept_dt(String accept_dt) {
		this.accept_dt = accept_dt;
	}
	public String getOver_dt() {
		return over_dt;
	}

	public void setOver_dt(String over_dt) {
		this.over_dt = over_dt;
	}
	public Integer getOver_st_id() {
		return over_st_id;
	}

	public void setOver_st_id(Integer over_st_id) {
		this.over_st_id = over_st_id;
	}
	public Integer getRight_num() {
		return right_num;
	}

	public void setRight_num(Integer right_num) {
		this.right_num = right_num;
	}
	public Integer getError_num() {
		return error_num;
	}

	public void setError_num(Integer error_num) {
		this.error_num = error_num;
	}
	public String getMdi_dt() {
		return mdi_dt;
	}

	public void setMdi_dt(String mdi_dt) {
		this.mdi_dt = mdi_dt;
	}
	public String getCre_dt() {
		return cre_dt;
	}

	public void setCre_dt(String cre_dt) {
		this.cre_dt = cre_dt;
	}
	public Integer getCpn_id() {
		return cpn_id;
	}

	public void setCpn_id(Integer cpn_id) {
		this.cpn_id = cpn_id;
	}
	public Integer getSt_id() {
		return st_id;
	}

	public void setSt_id(Integer st_id) {
		this.st_id = st_id;
	}
}