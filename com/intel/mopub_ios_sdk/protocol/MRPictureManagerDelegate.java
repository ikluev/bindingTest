package com.intel.mopub_ios_sdk.protocol;


import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCProtocolName;
import com.intel.inde.moe.natj.objc.ann.Selector;
import com.intel.mopub_ios_sdk.MRPictureManager;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MRPictureManagerDelegate")
public interface MRPictureManagerDelegate {
	@Generated
	@Selector("pictureManager:didFailToStorePictureWithErrorMessage:")
	void pictureManagerDidFailToStorePictureWithErrorMessage(
			MRPictureManager manager, String message);
}