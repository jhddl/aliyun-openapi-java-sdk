/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.csb.transform.v20171118;

import com.aliyuncs.csb.model.v20171118.CreateProjectResponse;
import com.aliyuncs.csb.model.v20171118.CreateProjectResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateProjectResponseUnmarshaller {

	public static CreateProjectResponse unmarshall(CreateProjectResponse createProjectResponse, UnmarshallerContext context) {
		
		createProjectResponse.setRequestId(context.stringValue("CreateProjectResponse.RequestId"));
		createProjectResponse.setCode(context.integerValue("CreateProjectResponse.Code"));
		createProjectResponse.setMessage(context.stringValue("CreateProjectResponse.Message"));

		Data data = new Data();
		data.setId(context.longValue("CreateProjectResponse.Data.Id"));
		createProjectResponse.setData(data);
	 
	 	return createProjectResponse;
	}
}