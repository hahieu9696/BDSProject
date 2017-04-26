package com.team.landhouse.dao;

import java.util.List;

import com.team.landhouse.entities.ProjectCreateRequestModel;
import com.team.landhouse.entities.ProjectModel;
import com.team.landhouse.entities.ProjectUpdateRequestModel;
import com.team.landhouse.utils.SearchPage;

public interface ProjectModelMapper {
	
	List<ProjectModel> getAll();

	int create(ProjectCreateRequestModel projectCreateRequestModel);
	
	int update(ProjectUpdateRequestModel projectUpdateRequestModel);
	
	int delete(int projectId);
	
	List<ProjectModel> loadPagination(SearchPage searchPage);
	
	List<ProjectModel> getRowPagination(SearchPage searchPage);
}