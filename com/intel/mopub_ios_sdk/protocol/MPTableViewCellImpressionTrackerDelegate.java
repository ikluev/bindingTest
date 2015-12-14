package com.intel.mopub_ios_sdk.protocol;


import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCProtocolName;
import com.intel.inde.moe.natj.objc.ann.Selector;
import com.intel.mopub_ios_sdk.MPTableViewCellImpressionTracker;
import ios.foundation.NSArray;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MPTableViewCellImpressionTrackerDelegate")
public interface MPTableViewCellImpressionTrackerDelegate {
	@Generated
	@Selector("tracker:didDetectVisibleRowsAtIndexPaths:")
	void trackerDidDetectVisibleRowsAtIndexPaths(
			MPTableViewCellImpressionTracker tracker, NSArray indexPaths);
}