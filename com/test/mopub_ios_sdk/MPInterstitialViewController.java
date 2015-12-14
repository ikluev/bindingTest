package com.test.mopub_ios_sdk;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.Pointer;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Mapped;
import com.intel.inde.moe.natj.general.ann.MappedReturn;
import com.intel.inde.moe.natj.general.ann.NUInt;
import com.intel.inde.moe.natj.general.ann.Owned;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCClassBinding;
import com.intel.inde.moe.natj.objc.ann.Selector;
import com.intel.inde.moe.natj.objc.map.ObjCObjectMapper;
import com.test.mopub_ios_sdk.protocol.MPInterstitialViewControllerDelegate;
import ios.foundation.NSBundle;
import ios.foundation.NSCoder;
import ios.uikit.UIButton;
import ios.uikit.UIViewController;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPInterstitialViewController extends UIViewController {
	static {
		NatJ.register();
	}

	@Generated
	protected MPInterstitialViewController(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPInterstitialViewController alloc();

	@Generated
	@Selector("closeButton")
	public native UIButton closeButton();

	@Generated
	@Selector("closeButtonStyle")
	@NUInt
	public native long closeButtonStyle();

	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native MPInterstitialViewControllerDelegate delegate();

	@Generated
	@Selector("didDismissInterstitial")
	public native void didDismissInterstitial();

	@Generated
	@Selector("didPresentInterstitial")
	public native void didPresentInterstitial();

	@Generated
	@Selector("dismissInterstitialAnimated:")
	public native void dismissInterstitialAnimated(boolean animated);

	@Generated
	@Selector("init")
	public native MPInterstitialViewController init();

	@Generated
	@Selector("initWithCoder:")
	public native MPInterstitialViewController initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("initWithNibName:bundle:")
	public native MPInterstitialViewController initWithNibNameBundle(
			String nibNameOrNil, NSBundle nibBundleOrNil);

	@Generated
	@Selector("layoutCloseButton")
	public native void layoutCloseButton();

	@Generated
	@Selector("orientationType")
	@NUInt
	public native long orientationType();

	@Generated
	@Selector("presentInterstitialFromViewController:")
	public native void presentInterstitialFromViewController(
			UIViewController controller);

	@Generated
	@Selector("setCloseButton:")
	public native void setCloseButton(UIButton value);

	@Generated
	@Selector("setCloseButtonStyle:")
	public native void setCloseButtonStyle(@NUInt long value);

	@Generated
	@Selector("setDelegate:")
	public native void setDelegate_unsafe(
			@Mapped(ObjCObjectMapper.class) MPInterstitialViewControllerDelegate value);

	@Generated
	public void setDelegate(
			@Mapped(ObjCObjectMapper.class) MPInterstitialViewControllerDelegate value) {
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
	@Selector("setOrientationType:")
	public native void setOrientationType(@NUInt long value);

	@Generated
	@Selector("shouldDisplayCloseButton")
	public native boolean shouldDisplayCloseButton();

	@Generated
	@Selector("willDismissInterstitial")
	public native void willDismissInterstitial();

	@Generated
	@Selector("willPresentInterstitial")
	public native void willPresentInterstitial();
}