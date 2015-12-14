package com.test.mopub_ios_sdk.protocol;


import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.NUInt;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCProtocolName;
import com.intel.inde.moe.natj.objc.ann.Selector;
import ios.foundation.NSDictionary;
import ios.foundation.NSURL;
import ios.uikit.UIViewController;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MRNativeCommandHandlerDelegate")
public interface MRNativeCommandHandlerDelegate {
	@Generated
	@Selector("adViewPlacementType")
	@NUInt
	long adViewPlacementType();

	@Generated
	@Selector("handleMRAIDClose")
	void handleMRAIDClose();

	@Generated
	@Selector("handleMRAIDExpandWithParameters:")
	void handleMRAIDExpandWithParameters(NSDictionary params);

	@Generated
	@Selector("handleMRAIDOpenCallForURL:")
	void handleMRAIDOpenCallForURL(NSURL URL);

	@Generated
	@Selector("handleMRAIDResizeWithParameters:")
	void handleMRAIDResizeWithParameters(NSDictionary params);

	@Generated
	@Selector("handleMRAIDSetOrientationPropertiesWithForceOrientationMask:")
	void handleMRAIDSetOrientationPropertiesWithForceOrientationMask(
			@NUInt long forceOrientationMask);

	@Generated
	@Selector("handleMRAIDUseCustomClose:")
	void handleMRAIDUseCustomClose(boolean useCustomClose);

	@Generated
	@Selector("handlingWebviewRequests")
	boolean handlingWebviewRequests();

	@Generated
	@Selector("nativeCommandCompleted:")
	void nativeCommandCompleted(String command);

	@Generated
	@Selector("nativeCommandDidDismissModalView")
	void nativeCommandDidDismissModalView();

	@Generated
	@Selector("nativeCommandFailed:withMessage:")
	void nativeCommandFailedWithMessage(String command, String message);

	@Generated
	@Selector("nativeCommandWillPresentModalView")
	void nativeCommandWillPresentModalView();

	@Generated
	@Selector("userInteractedWithWebView")
	boolean userInteractedWithWebView();

	@Generated
	@Selector("viewControllerForPresentingModalView")
	UIViewController viewControllerForPresentingModalView();
}