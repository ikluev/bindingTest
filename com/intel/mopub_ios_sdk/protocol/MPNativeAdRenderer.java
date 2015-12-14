package com.intel.mopub_ios_sdk.protocol;


import com.intel.inde.moe.natj.general.ann.ByValue;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Mapped;
import com.intel.inde.moe.natj.general.ann.MappedReturn;
import com.intel.inde.moe.natj.general.ann.NFloat;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.general.ptr.Ptr;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.IsOptional;
import com.intel.inde.moe.natj.objc.ann.ObjCBlock;
import com.intel.inde.moe.natj.objc.ann.ObjCProtocolName;
import com.intel.inde.moe.natj.objc.ann.ProtocolClassMethod;
import com.intel.inde.moe.natj.objc.ann.Selector;
import com.intel.inde.moe.natj.objc.map.ObjCObjectMapper;
import com.intel.mopub_ios_sdk.MPNativeAdRendererConfiguration;
import ios.coregraphics.struct.CGSize;
import ios.foundation.NSError;
import ios.uikit.UIView;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MPNativeAdRenderer")
public interface MPNativeAdRenderer {
	@Generated
	@IsOptional
	@Selector("adViewWillMoveToSuperview:")
	default void adViewWillMoveToSuperview(UIView superview) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@Selector("initWithRendererSettings:")
	@MappedReturn(ObjCObjectMapper.class)
	Object initWithRendererSettings(
			@Mapped(ObjCObjectMapper.class) Object rendererSettings);

	@Generated
	@IsOptional
	@Selector("nativeAdTapped")
	default void nativeAdTapped() {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@Selector("rendererConfigurationWithRendererSettings:")
	@ProtocolClassMethod("rendererConfigurationWithRendererSettings")
	MPNativeAdRendererConfiguration _rendererConfigurationWithRendererSettings(
			@Mapped(ObjCObjectMapper.class) Object rendererSettings);

	@Generated
	@Selector("retrieveViewWithAdapter:error:")
	UIView retrieveViewWithAdapterError(
			@Mapped(ObjCObjectMapper.class) Object adapter, Ptr<NSError> error);

	@Generated
	@IsOptional
	@Selector("viewSizeHandler")
	@ObjCBlock(name = "call_viewSizeHandler_ret")
	default Block_viewSizeHandler_ret viewSizeHandler() {
		throw new java.lang.UnsupportedOperationException();
	}

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_viewSizeHandler_ret {
		@Generated
		@ByValue
		CGSize call_viewSizeHandler_ret(@NFloat double arg0);
	}
}