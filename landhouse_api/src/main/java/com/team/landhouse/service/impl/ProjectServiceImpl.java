package com.team.landhouse.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team.landhouse.dao.ProjectModelMapper;
import com.team.landhouse.entities.ProjectCreateRequestModel;
import com.team.landhouse.entities.ProjectModel;
import com.team.landhouse.entities.ProjectUpdateRequestModel;
import com.team.landhouse.service.ProjectService;
import com.team.landhouse.utils.SearchPage;

/**
 * @author Ocean
 *
 */
@Service
public class ProjectServiceImpl implements ProjectService{

	@Autowired
	ProjectModelMapper projectDao;
	
	Logger logger = Logger.getLogger(ProjectServiceImpl.class);
	@Override
	public List<ProjectModel> getAll() {
		List<ProjectModel> projects = null;
		try{
			projects = projectDao.getAll();
		}catch(Exception e){
			e.printStackTrace();
			logger.error(e);
		}
		return projects;
	}
	@Override
	public int create(ProjectCreateRequestModel projectCreateRequestModel) {
		int result = 0;
		try{
			result = projectDao.create(projectCreateRequestModel);
		}catch(Exception e){
			e.printStackTrace();
			logger.error(e);
		}
		return result;
	}
	@Override
	public int update(ProjectUpdateRequestModel projectUpdateRequestModel) {
		int result = 0;
		try{
			result = projectDao.update(projectUpdateRequestModel);
		}catch(Exception e){
			e.printStackTrace();
			logger.error(e);
		}
		return result;
	}
	@Override
	public int delete(int projectId) {
		int result = 0;
		try{
			result = projectDao.delete(projectId);
		}catch(Exception e){
			e.printStackTrace();
			logger.error(e);
		}
		return result;
	}
	@Override
	public List<ProjectModel> loadPagination(SearchPage searchPage) {
		List<ProjectModel> projects = null;
		try{
			projects = projectDao.loadPagination(searchPage);
		}catch(Exception e){
			e.printStackTrace();
			logger.error(e);
		}
		return projects;
	}
	@Override
	public List<ProjectModel> getRowPagination(SearchPage searchPage) {
		List<ProjectModel> projects = null;
		try{
			projects = projectDao.getRowPagination(searchPage);
		}catch(Exception e){
			e.printStackTrace();
			logger.error(e);
		}
		return projects;
	}

}
