package com.team.landhouse.api;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.team.landhouse.dao.ProjectModelMapper;
import com.team.landhouse.entities.ProjectCreateRequestModel;
import com.team.landhouse.entities.ProjectModel;
import com.team.landhouse.entities.ProjectUpdateRequestModel;
import com.team.landhouse.utils.SearchPage;

/**
 * @author Ocean
 *
 */
@Path("v1/landhouse/projects")
@Component
public class ProjectApi {

	@Autowired
	ProjectModelMapper projectService;
	
	/**
	 * API get all projects
	 * @return
	 */
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<ProjectModel> getAll(){
		return projectService.getAll();
	}
	
	/**
	 * API create a new project
	 * @param projectCreateRequestModel
	 * @return
	 */
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("create")
	public Response create(ProjectCreateRequestModel projectCreateRequestModel){
		int result = 0;
		result = projectService.create(projectCreateRequestModel);
		if(result == 1){
			return Response.status(201).build();
		}else{
			return Response.status(501).build();
		}
	}
	
	/**
	 * API update a project
	 * @param projectUpdateRequestModel
	 * @return
	 */
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("update")
	public Response update(ProjectUpdateRequestModel projectUpdateRequestModel){
		int result = 0;
		result = projectService.update(projectUpdateRequestModel);
		if(result == 1){
			return Response.status(200).build();
		}else{
			return Response.status(304).build();
		}
	}
	
	/**
	 * API delete a project
	 * @param projectId
	 * @return
	 */
	@DELETE
	@Path("delete/{projectId: ([0-9]*)}")
	public Response delete(@PathParam("projectId") int projectId){
		int result = 0;
		result = projectService.delete(projectId);
		if(result == 1){
			return Response.status(200).build();
		}else{
			return Response.status(501).build();
		}
	}
	
	/**
	 * API to load AJAX pagination
	 * @param strPageSize
	 * @param strPageNumber
	 * @param textSearch
	 * @return
	 */
	@GET
	@Path("load-pagination")
	@Produces(MediaType.APPLICATION_JSON)
	public List<ProjectModel> loadPagination(@DefaultValue("1") @QueryParam("pageSize") String strPageSize,
			@DefaultValue("1") @QueryParam("pageNumber") String strPageNumber,
			@DefaultValue("") @QueryParam("textSearch") String textSearch) {
		try {
			int pageSize = Integer.parseInt(strPageSize);
			int pageNumber = Integer.parseInt(strPageNumber);
			SearchPage searchPage = new SearchPage(pageSize, pageNumber, textSearch);
			return projectService.loadPagination(searchPage);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * API to get all rows AJAX pagination
	 * @param textSearch
	 * @return
	 */
	@GET
	@Path("row-pagination")
	@Produces(MediaType.APPLICATION_JSON)
	public List<ProjectModel> getRowPagination(@DefaultValue("") @QueryParam("textSearch") String textSearch) {
		try {
			SearchPage searchPage = new SearchPage(-1, -1, textSearch);
			return projectService.getRowPagination(searchPage);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
