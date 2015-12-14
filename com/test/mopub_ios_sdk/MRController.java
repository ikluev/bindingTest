package com.test.mopub_ios_sdk;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.Pointer;
import com.intel.inde.moe.natj.general.ann.ByValue;
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
import com.test.mopub_ios_sdk.protocol.MRControllerDelegate;
import ios.NSObject;
import ios.coregraphics.struct.CGRect;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MRController extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected MRController(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native MRController alloc();

	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native MRControllerDelegate delegate();

	@Generated
	@Selector("disableRequestHandling")
	public native void disableRequestHandling();

	@Generated
	@Selector("enableRequestHandling")
	public native void enableRequestHandling();

	@Generated
	@Selector("handleMRAIDInterstitialDidPresentWithViewController:")
	public native void handleMRAIDInterstitialDidPresentWithViewController(
			MPMRAIDInterstitialViewController viewController);

	@Generated
	@Selector("init")
	public native MRController init();

	@Generated
	@Selector("initWithAdViewFrame:adPlacementType:")
	public native MRController initWithAdViewFrameAdPlacementType(
			@ByValue CGRect adViewFrame, @NUInt long placementType);

	@Generated
	@Selector("loadAdWithConfiguration:")
	public native void loadAdWithConfiguration(MPAdConfiguration configuration);

	@Generated
	@Selector("setDelegate:")
	public native void setDelegate_unsafe(
			@Mapped(ObjCObjectMapper.class) MRControllerDelegate value);

	@Generated
	public void setDelegate(
			@Mapped(ObjCObjectMapper.class) MRControllerDelegate value) {
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
}