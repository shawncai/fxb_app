package wy.rest.addons.fxb.xgt_sub_task_dtl.model;

import com.baomidou.mybatisplus.annotations.TableId;
import java.util.Date;
import java.sql.Timestamp;
import com.baomidou.mybatisplus.enums.IdType;
/**
 * 任务详情Model
 *
 * @author wyFrame
 * @Date 2018-09-05 15:20:52
 */
 public class Xgt_sub_task_dtl {

    private static final long serialVersionUID = 1L;

	@TableId(value="task_dtl_id", type= IdType.AUTO)
	private Integer task_dtl_id;
	private Integer over_id;
	private Integer sub_qp_id;
	private Integer task_obj_id;
	private String user_ask;
	private String right_ask;
	private Integer right_errof_flg;
	private String mdi_dt;
	private String cre_dt;
	private Integer cpn_id;
	private Integer st_id;

	public Integer getTask_dtl_id() {
		return task_dtl_id;
	}

	public void setTask_dtl_id(Integer task_dtl_id) {
		this.task_dtl_id = task_dtl_id;
	}

	public Integer getOver_id() {
		return over_id;
	}

	public void setOver_id(Integer over_id) {
		this.over_id = over_id;
	}

	public Integer getSub_qp_id() {
		return sub_qp_id;
	}

	public void setSub_qp_id(Integer sub_qp_id) {
		this.sub_qp_id = sub_qp_id;
	}
	public Integer getTask_obj_id() {
		return task_obj_id;
	}

	public void setTask_obj_id(Integer task_obj_id) {
		this.task_obj_id = task_obj_id;
	}
	public String getUser_ask() {
		return user_ask;
	}

	public void setUser_ask(String user_ask) {
		this.user_ask = user_ask;
	}
	public String getRight_ask() {
		return right_ask;
	}

	public void setRight_ask(String right_ask) {
		this.right_ask = right_ask;
	}
	public Integer getRight_errof_flg() {
		return right_errof_flg;
	}

	public void setRight_errof_flg(Integer right_errof_flg) {
		this.right_errof_flg = right_errof_flg;
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