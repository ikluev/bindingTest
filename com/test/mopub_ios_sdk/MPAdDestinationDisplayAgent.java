package com.test.mopub_ios_sdk;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.Pointer;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Mapped;
import com.intel.inde.moe.natj.general.ann.MappedReturn;
import com.intel.inde.moe.natj.general.ann.Owned;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.IsOptional;
import com.intel.inde.moe.natj.objc.ann.ObjCClassBinding;
import com.intel.inde.moe.natj.objc.ann.Selector;
import com.intel.inde.moe.natj.objc.map.ObjCObjectMapper;
import com.test.mopub_ios_sdk.protocol.MPActivityViewControllerHelperDelegate;
import com.test.mopub_ios_sdk.protocol.MPAdBrowserControllerDelegate;
import com.test.mopub_ios_sdk.protocol.MPAdDestinationDisplayAgentDelegate;
import com.test.mopub_ios_sdk.protocol.MPProgressOverlayViewDelegate;
import com.test.mopub_ios_sdk.protocol.MPSKStoreProductViewControllerDelegate;
import ios.NSObject;
import ios.foundation.NSURL;
import ios.storekit.SKStoreProductViewController;
import ios.uikit.UIViewController;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPAdDestinationDisplayAgent extends NSObject implements
		MPProgressOverlayViewDelegate, MPAdBrowserControllerDelegate,
		MPSKStoreProductViewControllerDelegate,
		MPActivityViewControllerHelperDelegate {
	static {
		NatJ.register();
	}

	@Generated
	protected MPAdDestinationDisplayAgent(Pointer peer) {
		super(peer);
	}

	@Generated
	@IsOptional
	@Selector("activityViewControllerDidDismiss")
	public native void activityViewControllerDidDismiss();

	@Generated
	@IsOptional
	@Selector("activityViewControllerWillPresent")
	public native void activityViewControllerWillPresent();

	@Generated
	@Selector("agentWithDelegate:")
	public static native MPAdDestinationDisplayAgent agentWithDelegate(
			@Mapped(ObjCObjectMapper.class) MPAdDestinationDisplayAgentDelegate delegate);

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPAdDestinationDisplayAgent alloc();

	@Generated
	@Selector("cancel")
	public native void cancel();

	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native MPAdDestinationDisplayAgentDelegate delegate();

	@Generated
	@Selector("dismissBrowserController:animated:")
	public native void dismissBrowserControllerAnimated(
			MPAdBrowserController browserController, boolean animated);

	@Generated
	@Selector("displayDestinationForURL:")
	public native void displayDestinationForURL(NSURL URL);

	@Generated
	@Selector("init")
	public native MPAdDestinationDisplayAgent init();

	@Generated
	@IsOptional
	@Selector("overlayCancelButtonPressed")
	public native void overlayCancelButtonPressed();

	@Generated
	@IsOptional
	@Selector("overlayDidAppear")
	public native void overlayDidAppear();

	@Generated
	@IsOptional
	@Selector("productViewControllerDidFinish:")
	public native void productViewControllerDidFinish(
			SKStoreProductViewController viewController);

	@Generated
	@Selector("setDelegate:")
	public native void setDelegate_unsafe(
			@Mapped(ObjCObjectMapper.class) MPAdDestinationDisplayAgentDelegate value);

	@Generated
	public void setDelegate(
			@Mapped(ObjCObjectMapper.class) MPAdDestinationDisplayAgentDelegate value) {
		Object __old = delegate();
		if (value != null) {
			com.intel.inde.moe.natj.objc.ObjCRuntime.associateObjCObject(this,
					value);
		}
		setDelegate_unsafe(value);
		if (__old != null) {
			com.intel.inde.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this,
					__old);
		}
	}

	@Generated
	@Selector("viewControllerForPresentingActivityViewController")
	public native UIViewController viewControllerForPresentingActivityViewController();
}