package com.intel.mopub_ios_sdk.protocol;


import com.intel.inde.moe.natj.general.ann.ByValue;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.NFloat;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.IsOptional;
import com.intel.inde.moe.natj.objc.ann.ObjCBlock;
import com.intel.inde.moe.natj.objc.ann.ObjCProtocolName;
import com.intel.inde.moe.natj.objc.ann.Selector;
import ios.coregraphics.struct.CGSize;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MPNativeAdRendererSettings")
public interface MPNativeAdRendererSettings {
	@Generated
	@IsOptional
	@Selector("setViewSizeHandler:")
	default void setViewSizeHandler(
			@ObjCBlock(name = "call_setViewSizeHandler") Block_setViewSizeHandler value) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_setViewSizeHandler {
		@Generated
		@ByValue
		CGSize call_setViewSizeHandler(@NFloat double arg0);
	}

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