package com.intel.mopub_ios_sdk.protocol;


import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCProtocolName;
import com.intel.inde.moe.natj.objc.ann.Selector;
import com.intel.mopub_ios_sdk.MRVideoPlayerManager;
import ios.uikit.UIViewController;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MRVideoPlayerManagerDelegate")
public interface MRVideoPlayerManagerDelegate {
	@Generated
	@Selector("videoPlayerManager:didFailToPlayVideoWithErrorMessage:")
	void videoPlayerManagerDidFailToPlayVideoWithErrorMessage(
			MRVideoPlayerManager manager, String message);

	@Generated
	@Selector("videoPlayerManagerDidDismissVideo:")
	void videoPlayerManagerDidDismissVideo(MRVideoPlayerManager manager);

	@Generated
	@Selector("videoPlayerManagerWillPresentVideo:")
	void videoPlayerManagerWillPresentVideo(MRVideoPlayerManager manager);

	@Generated
	@Selector("viewControllerForPresentingVideoPlayer")
	UIViewController viewControllerForPresentingVideoPlayer();
}