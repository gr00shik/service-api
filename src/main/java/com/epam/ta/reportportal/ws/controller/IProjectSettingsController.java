/*
 * Copyright 2016 EPAM Systems
 * 
 * 
 * This file is part of EPAM Report Portal.
 * https://github.com/reportportal/service-api
 * 
 * Report Portal is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Report Portal is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with Report Portal.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.epam.ta.reportportal.ws.controller;

import com.epam.ta.reportportal.ws.model.EntryCreatedRS;
import com.epam.ta.reportportal.ws.model.OperationCompletionRS;
import com.epam.ta.reportportal.ws.model.project.config.CreateIssueSubTypeRQ;
import com.epam.ta.reportportal.ws.model.project.config.ProjectSettingsResource;
import com.epam.ta.reportportal.ws.model.project.config.UpdateIssueSubTypeRQ;

import java.security.Principal;

/**
 * Project Settings controller provide functionality for manipulations of
 * specific project attributes like custom issue types, etc.
 *
 * @author Andrei_Ramanchuk
 */
public interface IProjectSettingsController {

	/**
	 * Create issue sub type for specified project
	 *
	 * @param projectName Project name
	 * @param request
	 * @param principal   Principal
	 * @return EntryCreatedRS
	 */
	EntryCreatedRS createProjectIssueSubType(String projectName, CreateIssueSubTypeRQ request, Principal principal);

	/**
	 * Update specified issue sub-type for specified project
	 *
	 * @param projectName Project name
	 * @param request
	 * @param principal   Principal
	 * @return OperationCompletionRS
	 */
	OperationCompletionRS updateProjectIssueSubType(String projectName, UpdateIssueSubTypeRQ request, Principal principal);

	/**
	 * Remove specified issue sub-type from specified project
	 *
	 * @param projectName Project name
	 * @param id
	 * @param principal   Principal
	 * @return OperationCompletionRS
	 */
	OperationCompletionRS deleteProjectIssueSubType(String projectName, String id, Principal principal);

	/**
	 * Get settings of specified project
	 *
	 * @param projectName Project name
	 * @param principal   Principal
	 * @return ProjectSettingsResource
	 */
	ProjectSettingsResource getProjectSettings(String projectName, Principal principal);

}