package com.test.mopub_ios_sdk.protocol;


import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCProtocolName;
import com.intel.inde.moe.natj.objc.ann.Selector;
import com.test.mopub_ios_sdk.MPAdConfiguration;
import ios.foundation.NSError;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MPAdServerCommunicatorDelegate")
public interface MPAdServerCommunicatorDelegate {
	@Generated
	@Selector("communicatorDidFailWithError:")
	void communicatorDidFailWithError(NSError error);

	@Generated
	@Selector("communicatorDidReceiveAdConfiguration:")
	void communicatorDidReceiveAdConfiguration(MPAdConfiguration configuration);
}