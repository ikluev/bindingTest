package com.intel.mopub_ios_sdk.protocol;


import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.NUInt;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCProtocolName;
import com.intel.inde.moe.natj.objc.ann.Selector;
import com.intel.mopub_ios_sdk.MRBridge;
import ios.foundation.NSDictionary;
import ios.foundation.NSError;
import ios.foundation.NSURL;
import ios.uikit.UIViewController;
import ios.uikit.UIWebView;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MRBridgeDelegate")
public interface MRBridgeDelegate {
	@Generated
	@Selector("bridge:didFailLoadingWebView:error:")
	void bridgeDidFailLoadingWebViewError(MRBridge bridge, UIWebView webView,
			NSError error);

	@Generated
	@Selector("bridge:didFinishLoadingWebView:")
	void bridgeDidFinishLoadingWebView(MRBridge bridge, UIWebView webView);

	@Generated
	@Selector("bridge:handleDisplayForDestinationURL:")
	void bridgeHandleDisplayForDestinationURL(MRBridge bridge, NSURL URL);

	@Generated
	@Selector("bridge:handleNativeCommandExpandWithURL:useCustomClose:")
	void bridgeHandleNativeCommandExpandWithURLUseCustomClose(MRBridge bridge,
			NSURL url, boolean useCustomClose);

	@Generated
	@Selector("bridge:handleNativeCommandResizeWithParameters:")
	void bridgeHandleNativeCommandResizeWithParameters(MRBridge bridge,
			NSDictionary parameters);

	@Generated
	@Selector("bridge:handleNativeCommandSetOrientationPropertiesWithForceOrientationMask:")
	void bridgeHandleNativeCommandSetOrientationPropertiesWithForceOrientationMask(
			MRBridge bridge, @NUInt long forceOrientationMask);

	@Generated
	@Selector("bridge:handleNativeCommandUseCustomClose:")
	void bridgeHandleNativeCommandUseCustomClose(MRBridge bridge,
			boolean useCustomClose);

	@Generated
	@Selector("bridge:performActionForMoPubSpecificURL:")
	void bridgePerformActionForMoPubSpecificURL(MRBridge bridge, NSURL url);

	@Generated
	@Selector("handleNativeCommandCloseWithBridge:")
	void handleNativeCommandCloseWithBridge(MRBridge bridge);

	@Generated
	@Selector("hasUserInteractedWithWebViewForBridge:")
	boolean hasUserInteractedWithWebViewForBridge(MRBridge bridge);

	@Generated
	@Selector("isLoadingAd")
	boolean isLoadingAd();

	@Generated
	@Selector("nativeCommandDidDismissModalView")
	void nativeCommandDidDismissModalView();

	@Generated
	@Selector("nativeCommandWillPresentModalView")
	void nativeCommandWillPresentModalView();

	@Generated
	@Selector("placementType")
	@NUInt
	long placementType();

	@Generated
	@Selector("viewControllerForPresentingModalView")
	UIViewController viewControllerForPresentingModalView();
}