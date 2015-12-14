package com.intel.mopub_ios_sdk.protocol;


import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCProtocolName;
import com.intel.inde.moe.natj.objc.ann.Selector;
import com.intel.mopub_ios_sdk.MOPUBFullscreenPlayerViewController;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MOPUBFullscreenPlayerViewControllerDelegate")
public interface MOPUBFullscreenPlayerViewControllerDelegate {
	@Generated
	@Selector("ctaTapped:")
	void ctaTapped(MOPUBFullscreenPlayerViewController viewController);

	@Generated
	@Selector("fullscreenPlayerWillLeaveApplication:")
	void fullscreenPlayerWillLeaveApplication(
			MOPUBFullscreenPlayerViewController viewController);

	@Generated
	@Selector("playerDidProgressToTime:")
	void playerDidProgressToTime(double playbackTime);
}