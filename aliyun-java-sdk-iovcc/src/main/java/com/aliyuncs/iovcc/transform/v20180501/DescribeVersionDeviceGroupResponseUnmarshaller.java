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

package com.aliyuncs.iovcc.transform.v20180501;

import com.aliyuncs.iovcc.model.v20180501.DescribeVersionDeviceGroupResponse;
import com.aliyuncs.iovcc.model.v20180501.DescribeVersionDeviceGroupResponse.DeviceGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVersionDeviceGroupResponseUnmarshaller {

	public static DescribeVersionDeviceGroupResponse unmarshall(DescribeVersionDeviceGroupResponse describeVersionDeviceGroupResponse, UnmarshallerContext _ctx) {
		
		describeVersionDeviceGroupResponse.setRequestId(_ctx.stringValue("DescribeVersionDeviceGroupResponse.RequestId"));

		DeviceGroup deviceGroup = new DeviceGroup();
		deviceGroup.setId(_ctx.longValue("DescribeVersionDeviceGroupResponse.DeviceGroup.Id"));
		deviceGroup.setName(_ctx.stringValue("DescribeVersionDeviceGroupResponse.DeviceGroup.Name"));
		deviceGroup.setDescription(_ctx.stringValue("DescribeVersionDeviceGroupResponse.DeviceGroup.Description"));
		deviceGroup.setGmtCreate(_ctx.stringValue("DescribeVersionDeviceGroupResponse.DeviceGroup.GmtCreate"));
		deviceGroup.setGmtModify(_ctx.stringValue("DescribeVersionDeviceGroupResponse.DeviceGroup.GmtModify"));
		deviceGroup.setMaxCount(_ctx.stringValue("DescribeVersionDeviceGroupResponse.DeviceGroup.MaxCount"));
		describeVersionDeviceGroupResponse.setDeviceGroup(deviceGroup);
	 
	 	return describeVersionDeviceGroupResponse;
	}
}