/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.tdsr.model.v20200101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.tdsr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SaveHotspotTagRequest extends RpcAcsRequest<SaveHotspotTagResponse> {
	   

	private String accountId;

	private String paramTag;
	public SaveHotspotTagRequest() {
		super("tdsr", "2020-01-01", "SaveHotspotTag");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getAccountId() {
		return this.accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
		if(accountId != null){
			putQueryParameter("AccountId", accountId);
		}
	}

	public String getParamTag() {
		return this.paramTag;
	}

	public void setParamTag(String paramTag) {
		this.paramTag = paramTag;
		if(paramTag != null){
			putQueryParameter("ParamTag", paramTag);
		}
	}

	@Override
	public Class<SaveHotspotTagResponse> getResponseClass() {
		return SaveHotspotTagResponse.class;
	}

}
