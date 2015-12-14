package com.intel.mopub_ios_sdk.protocol;


import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.IsOptional;
import com.intel.inde.moe.natj.objc.ann.ObjCProtocolName;
import com.intel.inde.moe.natj.objc.ann.Selector;
import com.intel.mopub_ios_sdk.MPAdAlertManager;
import ios.uikit.UIViewController;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MPAdAlertManagerDelegate")
public interface MPAdAlertManagerDelegate {
	@Generated
	@IsOptional
	@Selector("adAlertManagerDidProcessAlert:")
	default void adAlertManagerDidProcessAlert(MPAdAlertManager manager) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@Selector("adAlertManagerDidTriggerAlert:")
	void adAlertManagerDidTriggerAlert(MPAdAlertManager manager);

	@Generated
	@Selector("viewControllerForPresentingMailVC")
	UIViewController viewControllerForPresentingMailVC();
}