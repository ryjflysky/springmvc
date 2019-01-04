package org.springmvc.pojo;

public class RoleParam {
	private String roleName;
	private String note;
	private PageParams pp;

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	@Override
	public String toString() {
		return "RoleParam [roleName=" + roleName + ", note=" + note + ", pp=" + pp + "]";
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public PageParams getPp() {
		return pp;
	}

	public void setPp(PageParams pp) {
		this.pp = pp;
	}
}
