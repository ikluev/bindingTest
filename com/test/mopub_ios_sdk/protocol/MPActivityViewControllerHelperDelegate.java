package com.test.mopub_ios_sdk.protocol;


import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.IsOptional;
import com.intel.inde.moe.natj.objc.ann.ObjCProtocolName;
import com.intel.inde.moe.natj.objc.ann.Selector;
import ios.uikit.UIViewController;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MPActivityViewControllerHelperDelegate")
public interface MPActivityViewControllerHelperDelegate {
	@Generated
	@IsOptional
	@Selector("activityViewControllerDidDismiss")
	default void activityViewControllerDidDismiss() {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("activityViewControllerWillPresent")
	default void activityViewControllerWillPresent() {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@Selector("viewControllerForPresentingActivityViewController")
	UIViewController viewControllerForPresentingActivityViewController();
}