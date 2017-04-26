package com.team.landhouse.entities;

/**
 * @author Ocean
 *
 */
public class ProjectUpdateRequestModel {

	private int projectId;
	private String code;
	private String name;
	private String modifier;

	/**
	 * @return projectId
	 */
	public int getProjectId() {
		return projectId;
	}

	/**
	 * @param projectId
	 * 		the projectId to set
	 */
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	/**
	 * @return projectId
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code
	 * 		the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 * 		the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return modifier
	 */
	public String getModifier() {
		return modifier;
	}

	/**
	 * @param modifier
	 * 		the modifier to set
	 */
	public void setModifier(String modifier) {
		this.modifier = modifier;
	}

}
