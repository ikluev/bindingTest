package com.test.mopub_ios_sdk;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.Pointer;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Owned;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.Class;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCBlock;
import com.intel.inde.moe.natj.objc.ann.ObjCClassBinding;
import com.intel.inde.moe.natj.objc.ann.Selector;
import com.test.mopub_ios_sdk.protocol.MPNativeAdRendererSettings;
import ios.NSObject;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPStaticNativeAdRendererSettings extends NSObject implements
		MPNativeAdRendererSettings {
	static {
		NatJ.register();
	}

	@Generated
	protected MPStaticNativeAdRendererSettings(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPStaticNativeAdRendererSettings alloc();

	@Generated
	@Selector("init")
	public native MPStaticNativeAdRendererSettings init();

	@Generated
	@Selector("renderingViewClass")
	public native Class renderingViewClass();

	@Generated
	@Selector("setRenderingViewClass:")
	public native void setRenderingViewClass(Class value);

	@Generated
	@Selector("setViewSizeHandler:")
	public native void setViewSizeHandler(
			@ObjCBlock(name = "call_setViewSizeHandler") MPNativeAdRendererSettings.Block_setViewSizeHandler value);

	@Generated
	@Selector("viewSizeHandler")
	@ObjCBlock(name = "call_viewSizeHandler_ret")
	public native MPNativeAdRendererSettings.Block_viewSizeHandler_ret viewSizeHandler();
}