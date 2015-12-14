package com.test.mopub_ios_sdk;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.Pointer;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Mapped;
import com.intel.inde.moe.natj.general.ann.Owned;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.general.ptr.Ptr;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.IsOptional;
import com.intel.inde.moe.natj.objc.ann.ObjCBlock;
import com.intel.inde.moe.natj.objc.ann.ObjCClassBinding;
import com.intel.inde.moe.natj.objc.ann.ProtocolClassMethod;
import com.intel.inde.moe.natj.objc.ann.Selector;
import com.intel.inde.moe.natj.objc.map.ObjCObjectMapper;
import com.test.mopub_ios_sdk.protocol.MPNativeAdRenderer;
import com.test.mopub_ios_sdk.protocol.MPNativeAdRendererSettings;
import ios.NSObject;
import ios.foundation.NSError;
import ios.uikit.UIView;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPStaticNativeAdRenderer extends NSObject implements
		MPNativeAdRenderer {
	static {
		NatJ.register();
	}

	@Generated
	protected MPStaticNativeAdRenderer(Pointer peer) {
		super(peer);
	}

	@Generated
	@IsOptional
	@Selector("adViewWillMoveToSuperview:")
	public native void adViewWillMoveToSuperview(UIView superview);

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPStaticNativeAdRenderer alloc();

	@Generated
	@Selector("init")
	public native MPStaticNativeAdRenderer init();

	@Generated
	@Selector("initWithRendererSettings:")
	public native MPStaticNativeAdRenderer initWithRendererSettings(
			@Mapped(ObjCObjectMapper.class) Object rendererSettings);

	@Generated
	@IsOptional
	@Selector("nativeAdTapped")
	public native void nativeAdTapped();

	@Generated
	@Selector("rendererConfigurationWithRendererSettings:")
	public static native MPNativeAdRendererConfiguration rendererConfigurationWithRendererSettings(
			@Mapped(ObjCObjectMapper.class) MPNativeAdRendererSettings rendererSettings);

	@Generated
	@ProtocolClassMethod("rendererConfigurationWithRendererSettings")
	public MPNativeAdRendererConfiguration _rendererConfigurationWithRendererSettings(
			@Mapped(ObjCObjectMapper.class) Object rendererSettings) {
		return rendererConfigurationWithRendererSettings((MPNativeAdRendererSettings)rendererSettings);
	}

	@Generated
	@Selector("retrieveViewWithAdapter:error:")
	public native UIView retrieveViewWithAdapterError(
			@Mapped(ObjCObjectMapper.class) Object adapter, Ptr<NSError> error);

	@Generated
	@Selector("viewSizeHandler")
	@ObjCBlock(name = "call_viewSizeHandler_ret")
	public native MPNativeAdRenderer.Block_viewSizeHandler_ret viewSizeHandler();
}