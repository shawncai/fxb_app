package wy.rest.addons.fxb.xgt_sub_qp.model;

import com.baomidou.mybatisplus.annotations.TableId;
import java.util.Date;
import java.sql.Timestamp;
import com.baomidou.mybatisplus.enums.IdType;
/**
 * 题目Model
 *
 * @author wyFrame
 * @Date 2018-09-05 16:40:06
 */
 public class Xgt_sub_qp {

    private static final long serialVersionUID = 1L;

	@TableId(value="sub_qp_id", type= IdType.AUTO)
	private Integer sub_qp_id;
	private String sub_qp_title;
	private Integer par_sub_id;
	private Integer spec_flg;
	private Integer sub_id;
	private Integer sub_exam_id;
	private Integer sub_qp_tp_id;
	private Integer sub_qp_ea_id;
	private String sub_qp_sel_a;
	private String sub_qp_sel_b;
	private String sub_qp_sel_c;
	private String sub_qp_sel_d;
	private String sub_qp_yes;
	private String sub_qp_no;
	private String sub_qp_answer;
	private String sub_qp_anl;
	private String mdi_dt;
	private String cre_dt;
	private Integer cpn_id;
	private Integer st_id;

	public Integer getSub_qp_id() {
		return sub_qp_id;
	}

	public void setSub_qp_id(Integer sub_qp_id) {
		this.sub_qp_id = sub_qp_id;
	}
	public String getSub_qp_title() {
		return sub_qp_title;
	}

	public void setSub_qp_title(String sub_qp_title) {
		this.sub_qp_title = sub_qp_title;
	}
	public Integer getPar_sub_id() {
		return par_sub_id;
	}

	public void setPar_sub_id(Integer par_sub_id) {
		this.par_sub_id = par_sub_id;
	}
	public Integer getSpec_flg() {
		return spec_flg;
	}

	public void setSpec_flg(Integer spec_flg) {
		this.spec_flg = spec_flg;
	}
	public Integer getSub_id() {
		return sub_id;
	}

	public void setSub_id(Integer sub_id) {
		this.sub_id = sub_id;
	}
	public Integer getSub_exam_id() {
		return sub_exam_id;
	}

	public void setSub_exam_id(Integer sub_exam_id) {
		this.sub_exam_id = sub_exam_id;
	}
	public Integer getSub_qp_tp_id() {
		return sub_qp_tp_id;
	}

	public void setSub_qp_tp_id(Integer sub_qp_tp_id) {
		this.sub_qp_tp_id = sub_qp_tp_id;
	}
	public Integer getSub_qp_ea_id() {
		return sub_qp_ea_id;
	}

	public void setSub_qp_ea_id(Integer sub_qp_ea_id) {
		this.sub_qp_ea_id = sub_qp_ea_id;
	}
	public String getSub_qp_sel_a() {
		return sub_qp_sel_a;
	}

	public void setSub_qp_sel_a(String sub_qp_sel_a) {
		this.sub_qp_sel_a = sub_qp_sel_a;
	}
	public String getSub_qp_sel_b() {
		return sub_qp_sel_b;
	}

	public void setSub_qp_sel_b(String sub_qp_sel_b) {
		this.sub_qp_sel_b = sub_qp_sel_b;
	}
	public String getSub_qp_sel_c() {
		return sub_qp_sel_c;
	}

	public void setSub_qp_sel_c(String sub_qp_sel_c) {
		this.sub_qp_sel_c = sub_qp_sel_c;
	}
	public String getSub_qp_sel_d() {
		return sub_qp_sel_d;
	}

	public void setSub_qp_sel_d(String sub_qp_sel_d) {
		this.sub_qp_sel_d = sub_qp_sel_d;
	}
	public String getSub_qp_yes() {
		return sub_qp_yes;
	}

	public void setSub_qp_yes(String sub_qp_yes) {
		this.sub_qp_yes = sub_qp_yes;
	}
	public String getSub_qp_no() {
		return sub_qp_no;
	}

	public void setSub_qp_no(String sub_qp_no) {
		this.sub_qp_no = sub_qp_no;
	}
	public String getSub_qp_answer() {
		return sub_qp_answer;
	}

	public void setSub_qp_answer(String sub_qp_answer) {
		this.sub_qp_answer = sub_qp_answer;
	}
	public String getSub_qp_anl() {
		return sub_qp_anl;
	}

	public void setSub_qp_anl(String sub_qp_anl) {
		this.sub_qp_anl = sub_qp_anl;
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