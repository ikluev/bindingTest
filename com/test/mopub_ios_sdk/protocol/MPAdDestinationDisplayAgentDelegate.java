package com.test.mopub_ios_sdk.protocol;


import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCProtocolName;
import com.intel.inde.moe.natj.objc.ann.Selector;
import ios.uikit.UIViewController;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MPAdDestinationDisplayAgentDelegate")
public interface MPAdDestinationDisplayAgentDelegate {
	@Generated
	@Selector("displayAgentDidDismissModal")
	void displayAgentDidDismissModal();

	@Generated
	@Selector("displayAgentWillLeaveApplication")
	void displayAgentWillLeaveApplication();

	@Generated
	@Selector("displayAgentWillPresentModal")
	void displayAgentWillPresentModal();

	@Generated
	@Selector("viewControllerForPresentingModalView")
	UIViewController viewControllerForPresentingModalView();
}