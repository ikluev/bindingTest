package com.intel.mopub_ios_sdk.protocol;


import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCProtocolName;
import com.intel.inde.moe.natj.objc.ann.Selector;
import ios.foundation.NSError;
import ios.foundation.NSURL;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MRImageDownloaderDelegate")
public interface MRImageDownloaderDelegate {
	@Generated
	@Selector("downloaderDidFailToSaveImageWithURL:error:")
	void downloaderDidFailToSaveImageWithURLError(NSURL URL, NSError error);
}