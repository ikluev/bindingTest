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
import com.intel.inde.moe.natj.objc.ann.ObjCClassBinding;
import com.intel.inde.moe.natj.objc.ann.Selector;
import com.intel.inde.moe.natj.objc.map.ObjCObjectMapper;
import com.test.mopub_ios_sdk.protocol.MPAdWebViewAgentDelegate;
import ios.corelocation.CLLocation;
import ios.uikit.UIViewController;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPHTMLBannerCustomEvent extends MPBannerCustomEvent implements
		MPAdWebViewAgentDelegate {
	static {
		NatJ.register();
	}

	@Generated
	protected MPHTMLBannerCustomEvent(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("adActionDidFinish:")
	public native void adActionDidFinish(MPAdWebView ad);

	@Generated
	@Selector("adActionWillBegin:")
	public native void adActionWillBegin(MPAdWebView ad);

	@Generated
	@Selector("adActionWillLeaveApplication:")
	public native void adActionWillLeaveApplication(MPAdWebView ad);

	@Generated
	@Selector("adDidClose:")
	public native void adDidClose(MPAdWebView ad);

	@Generated
	@Selector("adDidFailToLoadAd:")
	public native void adDidFailToLoadAd(MPAdWebView ad);

	@Generated
	@Selector("adDidFinishLoadingAd:")
	public native void adDidFinishLoadingAd(MPAdWebView ad);

	@Generated
	@Selector("adUnitId")
	public native String adUnitId();

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPHTMLBannerCustomEvent alloc();

	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object delegate();

	@Generated
	@Selector("init")
	public native MPHTMLBannerCustomEvent init();

	@Generated
	@Selector("location")
	public native CLLocation location();

	@Generated
	@Selector("setDelegate:")
	public native void setDelegate_unsafe(
			@Mapped(ObjCObjectMapper.class) Object value);

	@Generated
	public void setDelegate(@Mapped(ObjCObjectMapper.class) Object value) {
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
	@Selector("viewControllerForPresentingModalView")
	public native UIViewController viewControllerForPresentingModalView();
}